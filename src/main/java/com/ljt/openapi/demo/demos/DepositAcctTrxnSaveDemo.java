package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.Response;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.util.PropertiesUtils;
import com.ljt.openapi.demo.vo.DepositAcctTrxnVO;
import com.ljt.openapi.demo.vo.FaDepositAcctTrxnParaVO;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

/**
 * @description 交易流水保存示例
 * @author xyzhao
 * @date 2018年10月22日下午5:21:54
 */
public class DepositAcctTrxnSaveDemo {

  /******************* 以下信息请换成您获取到的密钥 **************************/
  /**
   * aes加密密钥
   */
  private String key = PropertiesUtils.getAESKey();
  /**
   * 产品Key
   */
  private String appKey = PropertiesUtils.getAppKey();
  /**
   * 产品密钥
   */
  private String appSecret = PropertiesUtils.getAppSecret();

  /******************* 以上信息请换成您获取到的密钥 *************************/

  /**
   * @description 交易流水保存示例
   * @author xyzhao
   * @date 2018年10月22日下午5:22:34
   */
  @Test
  public void depositAcctTrxnTest() throws Exception {
    String requestBody = depositAcctTrxnSaveParam();
    String method = "loan_app:deposit_acct_trxns:save";
    String aesKey = key;
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
    request.setPath("/v1/gateway/" + method);
    request.setAppKey(appKey);
    request.setAppSecret(appSecret);
    request.setTimeout(Constants.DEFAULT_TIMEOUT_LONG);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Response response = Client.execute(request);
    if (response.getStatusCode() == 200) {
      System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
    }
  }

  /**
   * @description 交易流水保存参数
   * @author xyzhao
   * @date 2018年10月22日下午5:29:00
   */
  public String depositAcctTrxnSaveParam() throws ParseException {
    FaDepositAcctTrxnParaVO paraVO = new FaDepositAcctTrxnParaVO();
    paraVO.setAppId("c4d6f8cfabc547539c2ae4fb49130aff");
    paraVO.setMtFinInsttnCd("01");
    List<DepositAcctTrxnVO> items = new ArrayList<>();
    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
    for (int i = 0; i < 5; i++) {
      DepositAcctTrxnVO depositAcctTrxnVO = new DepositAcctTrxnVO();
      depositAcctTrxnVO.setAcctNo("6217002710000684878");
      depositAcctTrxnVO.setAcctNm("北京海恩炼鑫台信息技术有限责任公司");
      Date date=dateFormat.parse("2015-05-"+(5+i));
      depositAcctTrxnVO.setDtTrxn(date);
      depositAcctTrxnVO.setDebitAmount(new BigDecimal("2000.01"));
      depositAcctTrxnVO.setCreditAmount(new BigDecimal("0"));
      depositAcctTrxnVO.setBalance(new BigDecimal(2000.01*(i+1)+""));
      depositAcctTrxnVO.setMtCurCd("人民币");
      depositAcctTrxnVO.setToAcctNm("董强");
      depositAcctTrxnVO.setToAcctNo("622200020011111111");
      depositAcctTrxnVO.setToBankNm("华夏银行");
      date=dateFormat.parse("2015-10-"+(10+i));
      depositAcctTrxnVO.setDtAccounting(date);
      depositAcctTrxnVO.setSummary("自定义");
      depositAcctTrxnVO.setRemark("置换补贴");
      depositAcctTrxnVO.setSerialNo(UUID.randomUUID().toString().replaceAll("-", ""));
      items.add(depositAcctTrxnVO);
    }
    for (int i = 0; i < 5; i++) {
      DepositAcctTrxnVO depositAcctTrxnVO = new DepositAcctTrxnVO();
      depositAcctTrxnVO.setAcctNo("6217002710000684877");
      depositAcctTrxnVO.setAcctNm("北京海恩炼鑫台信息技术有限责任公司");
      depositAcctTrxnVO.setDtTrxn(new Date(2014,6,6+i));
      depositAcctTrxnVO.setDebitAmount(new BigDecimal("1000.01"));
      depositAcctTrxnVO.setCreditAmount(new BigDecimal("1000.01"));
      depositAcctTrxnVO.setBalance(new BigDecimal((10000-1000.01*(i+1))+""));
      depositAcctTrxnVO.setMtCurCd("欧元");
      depositAcctTrxnVO.setToAcctNm("张强");
      depositAcctTrxnVO.setToAcctNo("622200020022222222");
      depositAcctTrxnVO.setToBankNm("华夏银行");
      depositAcctTrxnVO.setDtAccounting(new Date(2014,8,8+i));
      depositAcctTrxnVO.setSummary("自定义");
      depositAcctTrxnVO.setRemark("置换补贴");
      depositAcctTrxnVO.setSerialNo(UUID.randomUUID().toString().replaceAll("-", ""));
      items.add(depositAcctTrxnVO);
    }
    paraVO.setItems(items);
    return JSONObject.toJSONString(paraVO, SerializerFeature.WriteDateUseDateFormat);
  }
}

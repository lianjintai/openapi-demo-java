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
import com.ljt.openapi.demo.vo.PreAppCsVO;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

/**
 * 预申请demo
 */
public class PreAppCsDemo {

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

  @Test
  public void postAppDemo() throws Exception {
    String requestBody = getRequestBody();
    String method = "loan_app:cs_pre_app:create";
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
    request.setPath("/v1/gateway/" + method);
    request.setAppKey(appKey);
    request.setAppSecret(appSecret);
    request.setTimeout(Constants.DEFAULT_TIMEOUT);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
    requestBody = AESUtil.encrypt(key, requestBody);
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

  public String getRequestBody() {
    PreAppCsVO preAppCsVO = new PreAppCsVO();
    preAppCsVO.setCustId(UUID.randomUUID().toString().replaceAll("-", ""));
    preAppCsVO.setNm("个人预申请");
    preAppCsVO.setIdNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    preAppCsVO.setMtGenderCd("M");
    preAppCsVO.setMtMaritalStsCd("01");

    preAppCsVO.setMtEduLvlCd("02");
    preAppCsVO.setMtResidenceStsCd("001");
    preAppCsVO.setIsFamily("Y");
    preAppCsVO.setMtJobSectorCd("001");

    preAppCsVO.setMtCityCd("110100");

    preAppCsVO.setMobileNo("13853577894");
    preAppCsVO.setCreditCardLines(BigDecimal.TEN);

    preAppCsVO.setPortrait("{\"芝麻评分\":\"698\"}");

    preAppCsVO.setLmtAppr(new BigDecimal("12345.67"));
    preAppCsVO.setTenureAppr(new BigDecimal(12));
    preAppCsVO.setMtTimeCd("M");
    preAppCsVO.setIntRate(new BigDecimal("5.1"));

    return JSONObject.toJSONString(preAppCsVO, SerializerFeature.WriteDateUseDateFormat);
  }
}

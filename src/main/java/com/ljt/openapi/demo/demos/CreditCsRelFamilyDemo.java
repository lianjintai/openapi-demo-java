package com.ljt.openapi.demo.demos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.vo.cs.CsRelFamilyVO;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.CreditCsRelFamilyDemo.java
 * @Description : 创建借款人亲朋信息的关联人
 * @author : lcy
 * @Creation Date : 2018年1月30日 上午10:51:41
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2018年1月30日 create
 */
public class CreditCsRelFamilyDemo {


  /********************* 以下信息请换成您获取到的密钥 **********************************/
  /**
   * aes加密密钥
   */
  private String key = "";
  /**
   * 产品Key
   */
  private String appKey = "";
  /**
   * 产品密钥
   */
  private String appSecret = "";

  /********************* 以上信息请换成您获取到的密钥 **********************************/

  /**
   * 
   * @Description :关联人:亲朋信息的创建
   * @throws Exception
   * @Creation Date : 2018年1月30日 下午4:43:16
   * @Author : lcy
   * @iteration : 1.22
   */
  @Test
  public void createSpouseNotBizTest() throws Exception {
    String requestBody = loanCifRelFamily();
    String method = "loan_app:cif_cs_rel_family:create";
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
    request.setTimeout(Constants.DEFAULT_TIMEOUT);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
  }

  /**
   * @Description : 组装亲朋关联人的参数
   * @return : String
   * @Creation Date : 2018年1月30日 下午4:42:00
   * @Author : lcy
   * @iteration : 1.22
   */
  private String loanCifRelFamily() {
    CsRelFamilyVO csRelFamilyVO = new CsRelFamilyVO();
    csRelFamilyVO.setNm("朋友关联人");
    csRelFamilyVO.setMtCifRelCd("II006");
    csRelFamilyVO.setAppId("d18d361c3668429f9798734c6ad2ac9f");
    csRelFamilyVO.setIdNo("110113199801167614");
    csRelFamilyVO.setMtGenderCd("F");
    csRelFamilyVO.setMtMaritalStsCd("02");
    csRelFamilyVO.setDtRegistered(new Date());
    csRelFamilyVO.setMobileNo("18888888888");
    csRelFamilyVO.setYearIncAmt(BigDecimal.TEN);
    csRelFamilyVO.setMtIncSourceCd("ISC003");
    return JSONObject.toJSONString(csRelFamilyVO, SerializerFeature.WriteDateUseDateFormat);
  }


}

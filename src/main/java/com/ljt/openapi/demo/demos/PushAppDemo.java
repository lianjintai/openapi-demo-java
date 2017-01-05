package com.ljt.openapi.demo.demos;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSONObject;
import com.ljt.openapi.demo.Client;
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

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.PushAppDemo.java
 * @Description : 推贷申请推送demo
 * @Author : bingo刑天
 * @Creation Date : 2016年12月28日 下午4:47:19
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      bingo刑天 2016年12月28日 create
 */
public class PushAppDemo {
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
  @SuppressWarnings("static-access")
  // @Test
  public void pustAppDemo() throws Exception {
    Map<String, String> paraMap = new HashMap<>();
    paraMap.put("app_id", "8e032fb4882049a19e0c039260864898");
    paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
    JSONObject jsob = new JSONObject();
    String requestBody = jsob.toJSONString(paraMap);
    String method = "loan_app:app:push";
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
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Client.execute(request);
  }
}

package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

/**
 * @Project : dcms-openapi-demo
 * @Program Name : apiTest.GetCanUpload.java
 * @Description : 获取可上传申请材料
 * @Author : chenshouhao
 * @Creation Date : 2017年6月6日 上午10:47:20
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      chenshouhao 2017年6月6日 create
 */

public class GetCanUpload {

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
   * @Description : 获取可上传申请材料
   * @throws Exception
   * @return : void
   * @Creation Date : 2017年6月6日 上午11:14:32
   * @Author : chenshouhao
   */
  @Test
  public void getCanUpload() throws Exception {
    // 构建请求体
    Map<String, String> map = new HashMap<>();
    map.put("app_id", "5cafd7bbdd5d44a99e4a26c13c1f0ed0");
    String requestBody = JSONObject.toJSONString(map);
    // 设置请求信息
    String method = "loan_app:doc:can_upload";
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
}

package com.ljt.openapi.demo.demos;

import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.Response;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.PropertiesUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

/**
 *
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.CreditAppCsFacConfDemo
 * @Description : 获取个贷产品配置
 * @author : zhouzb
 * @Creation Date : 2018年10月24日 上午10:51:41
 */
public class CreditAppCsFacConfDemo {

  /******************* 以下信息请换成您获取到的密钥 **************************/
  /**
   * aes加密密钥
   */
  private String key = PropertiesUtils.getAESKey();
  /**
   * 产品 Key
   */
  private String appKey = PropertiesUtils.getAppKey();
  /**
   * 产品密钥
   */
  private String appSecret =  PropertiesUtils.getAppSecret();

  /******************* 以上信息请换成您获取到的密钥 *************************/

  @Test
  public void creditAppCsFacConfTest() throws Exception {

    String url = "/v2/cif/apps/mt_fac_cd/{mt_fac_cd}/fields";
    Request request = new Request();
    request.setMethod(Method.GET);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost()+url);
    request.setAppKey(appKey);
    request.setAppSecret(appSecret);
    request.setTimeout(Constants.DEFAULT_TIMEOUT);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    request.setHeaders(headers);
    Response response = Client.execute(request);
    if (response.getStatusCode() == 200) {
      System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
    }
  }

}

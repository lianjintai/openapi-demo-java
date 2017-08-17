package apiTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.Response;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.vo.AppDocVO;

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
  
  // aes加密密钥
  private String aesKey = "1C+4itn1dXfujlarx3e29g==";
  
  // 产品Key
  private String appKey = "23553310";
  
  // 产品密钥
  private String appSecret = "4393848a91bd5066d3be2dead06c5677";

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
    map.put("app_id", "eb8d63115e1e4031b7d3048a8c6b6d4d");
    String requestBody = JSONObject.toJSONString(map);
    // 设置请求信息
    String method = "loan_app:doc:can_upload";
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTP + ApiHost.DEV_API_HOST.getHost());
    request.setPath("/v1/openapi/gateway/" + method);
    request.setAppKey(appKey);
    request.setAppSecret(appSecret);
    request.setTimeout(Constants.DEFAULT_TIMEOUT);
    // 加密请求信息
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    request.setStringBody(requestBody);
    Response execute = Client.execute(request);
    String body = execute.getBody();
    // 获取相应信息并解密
    AppDocVO appDocVO = JSONObject.parseObject(AESUtil.decrypt(body, aesKey), AppDocVO.class);
    System.out.println(appDocVO);
  }

}

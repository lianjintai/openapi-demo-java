package apiTest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.alibaba.fastjson.JSONObject;

public class PushAppDoc {
  
  private final static String FAILED_CODE = "FAILED";

  private final static String SUCCESS_CODE = "SUCCESS";

  private final static int STATUS_OK_CODE = 200;

  /**
   * @Description : 上传申请材料
   * @return : void
   * @throws Exception
   * @Creation Date : 2017年6月7日 下午4:20:20
   * @Author : chenshouhao
   */
  @Test
  public void pushAppDoc() throws ClientProtocolException, IOException {
    CloseableHttpClient httpClient = HttpClients.createDefault();
    try {
      // 需要上传的文件路径
      String filePath = "D:\\test\\eb8d63115e1e4031b7d3048a8c6b6d4d.zip";
      
      // 上传文件的地址
      HttpPost httpPost = new HttpPost("https://ljt-sit-oss.oss-cn-beijing.aliyuncs.com");
      
      FileBody file = new FileBody(new File(filePath));

      // 构造请求参数，这些参数从获取可上传申请材料接口中获取
      StringBody accessid = new StringBody("ZTEDWNalMYqBjYeQ", ContentType.create("text/plain", Consts.UTF_8));
      StringBody signature = new StringBody("xrbJtas4Ali2SexUkSSZOmXvye4=",ContentType.create("text/plain", Consts.UTF_8));
      StringBody callback = new StringBody("eyJjYWxsYmFja1VybCI6Imh0dHA6Ly93ZnFodHEubmF0YXBwZnJlZS5jYzo4MC92MS9mYWNhZGUvYXBwcy9lYjhkNjMxMTVlMWU0MDMxYjdkMzA0OGE4YzZiNmQ0ZC9kb2NfZmlsZXMiLCJjYWxsYmFja0hvc3QiOiJ3ZnFodHEubmF0YXBwZnJlZS5jYyIsImNhbGxiYWNrQm9keSI6Im9iamVjdFx1MDAzZCR7b2JqZWN0fVx1MDAyNnNpemVcdTAwM2Qke3NpemV9XHUwMDI2bWltZVR5cGVcdTAwM2Qke21pbWVUeXBlfSIsImNhbGJhY2tCb2R5VHlwZSI6IlVSTCIsImNhbGxiYWNrVmFyIjp7fX0=",
          ContentType.create("text/plain", Consts.UTF_8));
      StringBody key = new StringBody("doc/eb8d63115e1e4031b7d3048a8c6b6d4d.zip",ContentType.create("text/plain", Consts.UTF_8));
      StringBody policy = new StringBody("eyJleHBpcmF0aW9uIjoiMjAxNy0wNi0wOFQwMzowOToyNi40MDFaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJkb2MvIl1dfQ==",
          ContentType.create("text/plain", Consts.UTF_8));
      StringBody successActionStatus = new StringBody("200", ContentType.create("text/plain", Consts.UTF_8));

      HttpEntity reqEntity = MultipartEntityBuilder.create()
          .addPart("OSSAccessKeyId", accessid)
          .addPart("signature", signature)
          .addPart("callback", callback)
          .addPart("key", key)
          .addPart("policy", policy)
          .addPart("success_action_status", successActionStatus)
          .addPart("file", file).build();

      httpPost.setEntity(reqEntity);

      // 发起上传请求
      CloseableHttpResponse response = httpClient.execute(httpPost);
      try {

        int statusCode = response.getStatusLine().getStatusCode();

        // 如果响应码不等于200，说明文件上传失败
        if (statusCode != STATUS_OK_CODE) {
          System.out.println("Request failed ....");
        }

        HttpEntity resEntity = response.getEntity();
        if (resEntity != null) {
          String string = EntityUtils.toString(resEntity, Charset.forName("UTF-8"));

          Map<String, String> result = JSONObject.parseObject(string, Map.class);

          String code = result.get("code");

          // 响应code为FAILED 说明上传申请材料失败,请在message字段中查看具体的失败信息,并按照失败信息做相应调整
          if (FAILED_CODE.equalsIgnoreCase(code)) {
            System.out.println("Request failed...");
            System.out.println("message：" + result.get("message"));
          }

          // 响应中的code为SUCCESS时,代表上传申请材料成功,在appId字段返回的是此次申请的申请ID
          if (SUCCESS_CODE.equalsIgnoreCase(code)) {
            System.out.println("Request success...");
            System.out.println("appId：" + result.get("appId"));
          }

        }
        EntityUtils.consume(resEntity);
      } finally {
        if (response != null) {
          response.close();
        }
      }
    } finally {
      if (httpClient != null) {
        httpClient.close();
      }
    }
  }

}

package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
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

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;

/**
 * <class说明>：上传授信申请材料demo
 * Created by jdd on 2018/10/23.
 *
 * @author jdd
 * @version 1.0.0
 * @date 2018/10/23 1:43 PM
 */
public class CreditMaterialUploadDemo {

    private final static String FAILED_CODE = "FAILED";

    private final static String SUCCESS_CODE = "SUCCESS";


    //响应码
    private final static int STATUS_OK_CODE = 200;

    /**
     * 测试上传授信申请材料
     */
    @Test
    public void creditMaterialUpload() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {

            //从获取配置中获取上传oss的加密信息（有时效 过期无法使用）
            JSONObject jsonObject = JSONObject.parseObject("{\n"
                + "            \"accessid\": \"LTAIgSk2NJNg18Kr\",\n"
                + "            \"policy\": \"eyJleHBpcmF0aW9uIjoiMjAxOC0xMS0wOFQwMzowOTo1OS44OTRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjAwMF0sWyJzdGFydHMtd2l0aCIsIiRrZXkiLCJkb2MvIl1dfQ==\",\n"
                + "            \"signature\": \"RyiIfcG3y8Kcf6qfku7WxBhbsrM=\",\n"
                + "            \"dir\": \"doc/\",\n"
                + "            \"host\": \"https://ljt-site-oss.oss-cn-beijing.aliyuncs.com\",\n"
                + "            \"callback\": \"eyJjYWxsYmFja1VybCI6Imh0dHBzOi8vc3RhZ2UubGlhbmppbnRhaS5jb20vdjEvZmFjYWRlL2FwcHMvbXRUZW5hbnRJZC8xMDAwL2RvY19maWxlcyIsImNhbGxiYWNrSG9zdCI6InN0YWdlLmxpYW5qaW50YWkuY29tIiwiY2FsbGJhY2tCb2R5Ijoib2JqZWN0XHUwMDNkJHtvYmplY3R9XHUwMDI2c2l6ZVx1MDAzZCR7c2l6ZX1cdTAwMjZtaW1lVHlwZVx1MDAzZCR7bWltZVR5cGV9XHUwMDI2YnVja2V0XHUwMDNkJHtidWNrZXR9XHUwMDI2ZXRhZ1x1MDAzZCR7ZXRhZ30iLCJjYWxiYWNrQm9keVR5cGUiOiJVUkwiLCJjYWxsYmFja1ZhciI6e319\"\n"
                + "        }");
            // 需要上传的文件路径 （必须zip的文件）
            File file = new File("/doc/abc.zip");

            // 构造请求参数
            // 上传文件的地址（从oss加密信息中获取，有时效 过期无法使用）
            HttpPost httpPost = new HttpPost(jsonObject.getString("host"));
            // 访问id（从oss加密信息中获取，有时效 过期无法使用）
            StringBody accessid = new StringBody(jsonObject.getString("accessid"), ContentType.create("text/plain", Consts.UTF_8));
            // 签名（从oss加密信息中获取，有时效 过期无法使用）
            StringBody signature = new StringBody(jsonObject.getString("signature"), ContentType.create("text/plain", Consts.UTF_8));
            // 回调地址（从oss加密信息中获取，有时效 过期无法使用）
            StringBody callback = new StringBody(jsonObject.getString("callback"),
                    ContentType.create("text/plain", Consts.UTF_8));
            // key（从oss加密信息中获取，有时效 过期无法使用）
            StringBody key = new StringBody(jsonObject.getString("dir") + file.getName(), ContentType.create("text/plain", Consts.UTF_8));
            // policy（从oss加密信息中获取，有时效 过期无法使用）
            StringBody policy = new StringBody(jsonObject.getString("policy"),
                    ContentType.create("text/plain", Consts.UTF_8));
            // 成功状态
            StringBody successActionStatus = new StringBody("200", ContentType.create("text/plain", Consts.UTF_8));
            // 获取本地服务器文件
            FileBody fileBody = new FileBody(file);
            HttpEntity reqEntity = MultipartEntityBuilder.create()
                    .addPart("OSSAccessKeyId", accessid)
                    .addPart("signature", signature)
                    .addPart("callback", callback)
                    .addPart("key", key)
                    .addPart("policy", policy)
                    .addPart("success_action_status", successActionStatus)
                    .addPart("file", fileBody).build();

            httpPost.setEntity(reqEntity);

            // 发起上传请求
            CloseableHttpResponse response = httpClient.execute(httpPost);

            try {
                // 请求响应码
                int statusCode = response.getStatusLine().getStatusCode();

                // 如果响应码不等于200，说明文件上传失败
                if (statusCode != STATUS_OK_CODE) {
                    System.out.println("Request failed ....");
                }
                // 请求响应实体
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null) {
                    String string = EntityUtils.toString(resEntity, Charset.forName("UTF-8"));

                    Map<String, String> result = JSONObject.parseObject(string, Map.class);

                    String code = result.get("code");
                    // 响应code为FAILED 说明上传申请材料失败,请在message字段中查看具体的失败信息,并按照失败信息做相应调整
                    if (FAILED_CODE.equalsIgnoreCase(code)) {
                        System.err.println("Request failed...");
                        System.err.println("message：" + result.get("message"));
                    }
                    // 响应中的code为SUCCESS时,代表上传申请材料成功
                    if (SUCCESS_CODE.equalsIgnoreCase(code)) {
                        System.out.println("Request success...");
                    }
                }
                EntityUtils.consume(resEntity);
            } finally {
                if (response != null) {
                    response.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (httpClient != null) {
                httpClient.close();
            }
        }

    }
}

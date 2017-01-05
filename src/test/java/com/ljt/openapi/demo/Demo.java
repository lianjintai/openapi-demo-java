package com.ljt.openapi.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;

public class Demo {

  @Test
  public void postString() throws Exception {
    String body =
        "{\"app_id\":\"0092728480d24f5d87bf63639b5cfe1c\",\"mt_app_type_cd\":\"CP_PUSH_APP\"}";
    String method = "loan_app:app:sts";
    String key = "==";
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    //测试环境，生产环境需要修改为api.lianjintai.com
    request.setHost(HttpSchema.HTTPS + "stageapi.lianjintai.com");
    request.setPath("/v1/gateway/" + method);
    request.setAppKey("");
    request.setAppSecret("");
    request.setTimeout(com.ljt.openapi.demo.constant.Constants.DEFAULT_TIMEOUT);

    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());

    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header

    System.out.println("body before encrypt:" + body);
    body = AESUtil.encrypt(key, body);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(body));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);

    request.setHeaders(headers);
    request.setStringBody(body);
    Client.execute(request);
  }
  
}

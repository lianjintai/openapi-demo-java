package apiTest;

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
 * @Program Name : com.ljt.openapi.demo.demos.PushAppDemo.java
 * @Description : 推贷申请推送demo
 * @Author : bingo刑天
 * @Creation Date : 2016年12月28日 下午4:47:19
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 * bingo刑天 2016年12月28日 create
 */
public class PushAppTest {


    /**
     * @return : void
     * @Description : 正例测试推送 依赖于正确app_id,所以未对http状态进行断言
     * @Creation Date : 2017年1月4日 上午10:21:55
     * @Author : bingo刑天
     */
    @Test
    public void postAppTest() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", "8836d99d4e954a9f974b53eaac82918b");
        paraMap.put("mt_app_type_cd", "CP_PUSH_APP");
        // JSONObject jsob = new JSONObject();
        String requestBody = JSONObject.toJSONString(paraMap);
        String method = "loan_app:app:push";
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(PropertiesUtils.getAppKey());
        request.setAppSecret(PropertiesUtils.getAppSecret());
        request.setTimeout(Constants.DEFAULT_TIMEOUT);
        Map<String, String> headers = new HashMap<>();
        headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
        // （必填）根据期望的Response内容类型设置
        headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
        // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
        requestBody = AESUtil.encrypt(PropertiesUtils.getAESKey(), requestBody);
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
        // （POST/PUT请求必选）请求Body内容格式
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
        request.setHeaders(headers);
        request.setStringBody(requestBody);
        Response response = Client.execute(request);
        System.out.println("response="+AESUtil.decrypt(response.getBody(), PropertiesUtils.getAESKey()));

    }

    /**
     * @return : void
     * @Description : 反例测试无产品密钥
     * @Creation Date : 2017年1月3日 下午3:00:51
     * @Author : bingo刑天
     */
    @SuppressWarnings("static-access")
    @Test(expected = IllegalArgumentException.class)
    public void postAppTest1() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", "8e032fb4882049a19e0c039260864898");
        paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
        JSONObject jsob = new JSONObject();
        String requestBody = jsob.toJSONString(paraMap);
        String method = "loan_app:app:push";
        String aesKey = UUID.randomUUID().toString();
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(UUID.randomUUID().toString());
        request.setAppSecret(null);
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

    /**
     * @return : void
     * @Description : 反例测试无appKey
     * @Creation Date : 2017年1月3日 下午3:01:13
     * @Author : bingo刑天
     */
    @SuppressWarnings("static-access")
    @Test(expected = IllegalArgumentException.class)
    public void postAppTest2() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", "8e032fb4882049a19e0c039260864898");
        paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
        JSONObject jsob = new JSONObject();
        String requestBody = jsob.toJSONString(paraMap);
        String method = "loan_app:app:push";
        String aesKey = UUID.randomUUID().toString();
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(null);
        request.setAppSecret(UUID.randomUUID().toString());
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

    /**
     * @return : void
     * @Description : 反例测试无aesKey
     * @Creation Date : 2017年1月3日 下午3:01:28
     * @Author : bingo刑天
     */
    @SuppressWarnings("static-access")
    @Test(expected = NullPointerException.class)
    public void postAppTest3() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", "8e032fb4882049a19e0c039260864898");
        paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
        JSONObject jsob = new JSONObject();
        String requestBody = jsob.toJSONString(paraMap);
        String method = "loan_app:app:push";
        String aesKey = null;
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(UUID.randomUUID().toString());
        request.setAppSecret(UUID.randomUUID().toString());
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

    /**
     * @return : void
     * @Description : 反例测试aesKey格式错误
     * @Creation Date : 2017年1月3日 下午3:01:50
     * @Author : bingo刑天
     */
    @SuppressWarnings("static-access")
    @Test(expected = IllegalArgumentException.class)
    public void postAppTest4() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", "8e032fb4882049a19e0c039260864898");
        paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
        JSONObject jsob = new JSONObject();
        String requestBody = jsob.toJSONString(paraMap);
        String method = "loan_app:app:push";
        String aesKey = UUID.randomUUID().toString();
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(UUID.randomUUID().toString());
        request.setAppSecret(UUID.randomUUID().toString());
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

    /**
     * @return : void
     * @Description : 申请id错误
     * @Creation Date : 2017年1月4日 上午10:30:22
     * @Author : bingo刑天
     */
    @SuppressWarnings("static-access")
    @Test
    public void postAppTest5() throws Exception {
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("app_id", UUID.randomUUID().toString());
        paraMap.put("mt_app_type_cd", "CS_PUSH_APP");
        JSONObject jsob = new JSONObject();
        String requestBody = jsob.toJSONString(paraMap);
        String method = "loan_app:app:push";
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
        request.setPath("/v1/gateway/" + method);
        request.setAppKey(PropertiesUtils.getAppKey());
        request.setAppSecret(PropertiesUtils.getAppSecret());
        request.setTimeout(Constants.DEFAULT_TIMEOUT);
        Map<String, String> headers = new HashMap<>();
        headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
        // （必填）根据期望的Response内容类型设置
        headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
        // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header

        requestBody = AESUtil.encrypt(PropertiesUtils.getAESKey(), requestBody);
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
        // （POST/PUT请求必选）请求Body内容格式
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
        request.setHeaders(headers);
        request.setStringBody(requestBody);
        Client.execute(request);
    }
}

package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.Response;
import com.ljt.openapi.demo.constant.*;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.util.PropertiesUtils;
import com.ljt.openapi.demo.vo.cp.CpCreditModelVO;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <class说明>：获取企贷定性打分选项数据
 * Created by jdd on 2018/10/29.
 *
 * @author jdd
 * @version 1.0.0
 * @date 2018/10/29 5:02 PM
 */
public class CpCreditModelDemo {

    //以下信息请换成您获取到的密钥
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

    //以上信息请换成您获取到的密钥

    @Test
    public void cpCreditModelTest() throws Exception {
        String requestBody = cpCreditModelVO();
        System.out.println(requestBody);
        String method = "loan_app:cp_app:credit_model";
        Request request = new Request();
        request.setMethod(Method.POST_STRING);
        //测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
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
        headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
        request.setHeaders(headers);
        request.setStringBody(requestBody);
        Response response = Client.execute(request);
        if (response.getStatusCode() == 200) {
            System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
        }
    }

    //获取评分所需参数
    private String cpCreditModelVO() {
        CpCreditModelVO cpCreditModelVO = new CpCreditModelVO();
        //行业小类
        cpCreditModelVO.setMtIndDetailCd("a0123");
        //注册时间
        cpCreditModelVO.setDtRegistered(new Date());
        //从业人数(单位：人)
        cpCreditModelVO.setEmployeeCnt(11);
        //营业收入(单位：万元)
        cpCreditModelVO.setSaleAmt(new BigDecimal(1000000));
        //资产总额(单位：万元)
        cpCreditModelVO.setAssetAmt(new BigDecimal(1000000));
        return JSONObject.toJSONString(cpCreditModelVO, SerializerFeature.WriteDateUseDateFormat);

    }
}

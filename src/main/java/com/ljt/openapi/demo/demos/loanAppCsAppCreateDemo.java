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
 *
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.loanAppCsAppCreateDemo
 * @Description : 个贷创建申请
 * @author : zhouzb
 * @Creation Date : 2018年10月24日 上午10:51:41
 */
public class loanAppCsAppCreateDemo {
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
  public void createCsAppTest() throws Exception {
    // 构建请求体
    String requestBody = JSONObject.toJSONString(getData());
    String method="loan_app:cs_app:create";
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
    request.setPath("/v1/gateway/"+method);
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

  private Map<String,Object> getData(){
    String jsonData="{\"cif\":{\"feature\":[{\"name\":\"60d9da136de045118eacf903b4e01531\",\"value\":\"dddd\",\"label\":\"test\"}],\"identity\":{\"nm\":\"姓名\",\"mtGenderCd\":\"F\",\"mtCifIdTypCd\":\"I\",\"mtCifIdTypCdDscp\":\"身份证\",\"idNo\":\"110113199506217906\",\"dtIssue\":\"2013-07-10 00:00:00\",\"dtExpiry\":\"2023-07-05 00:00:00\",\"mtMaritalStsCd\":\"01\",\"dtRegistered\":\"1995-06-21 00:00:00\",\"mtEduLvlCd\":\"01\",\"email\":\"912933515@qq.com\",\"mtResidenceStsCd\":\"01\",\"nationalityMtCtryCd\":\"CN\",\"mtStateCd\":\"110000\",\"mtStateCdDscp\":null,\"mtCityCd\":\"110100\",\"mtCityCdDscp\":\"市辖区(北京)\",\"mobileNo\":\"13839944397\",\"mtIndvMobileUsageStsCd\":\"01\",\"qq\":\"912933515\",\"weChat\":\"13839944397\",\"isLongEffec\":\"N\",\"mtCtryCd\":\"CN\"},\"finance\":{\"yearIncAmt\":\"1\",\"hasCreditCard\":\"Y\",\"creditCardLines\":\"1\",\"isFamily\":\"Y\",\"hasCar\":\"Y\",\"plateNo\":\"1\"},\"emplymt\":{\"employerNm\":\"工作单位\",\"mtJobSectorCd\":\"30200\",\"mtJobSectorCdDscp\":\"安全和消防人员\",\"prevServiceYr\":\"1\",\"prevServiceMth\":\"1\",\"mtPosHeldCd\":\"004\",\"employerPhone\":\"1111\",\"dtWorkInCurrIndustry\":\"2013-06-16 16:00:00\",\"isBizEntity\":\"N\"}},\"fac\":{\"dtMaturity\":\"2017-05-03 15:12:27\",\"intRate\":12,\"intRateInSuspense\":\"11\",\"mtIntRateTypCd\":\"Y\",\"deductAcctNo\":\"16547718523633346\",\"isRevolvingAllowed\":\"Y\",\"lmtAppr\":123,\"mtFacCd\":\"P1011\",\"mtFacPurCds\":[\"1001\",\"1002\"],\"mtRepymtTypCd\":\"001\",\"mtTimeCd\":\"D\",\"tenureAppr\":\"12\"},\"spouse\":{\"identity\":{\"mtCifRelCd\":\"II001\",\"isLongEffec\":\"N\",\"dtExpiry\":\"\",\"nm\":\"1111\",\"mtGenderCd\":\"M\",\"mtCifIdTypCd\":\"I2\",\"idNo\":\"11011319861222040X\",\"mtMaritalStsCd\":\"01\",\"dtRegistered\":\"2018-10-24 00:00:00\",\"mtCityCd\":\"500100\",\"mtCtryCd\":\"CN\",\"mtCityCdDscp\":\"市辖区(重庆)\",\"mtStateCd\":\"500000\",\"mtResidenceStsCd\":\"04\",\"mobileNo\":\"13880785548\",\"mtIndvMobileUsageStsCd\":\"04\",\"mtEduLvlCd\":\"04\",\"nationalityMtCtryCd\":\"CN\",\"email\":\"912933515@qq.com\",\"weChat\":\"13880785548\",\"qq\":\"912933515\"},\"finance\":{\"hasCar\":\"Y\",\"hasCreditCard\":\"Y\",\"isFamily\":\"Y\",\"yearIncAmt\":\"11\",\"plateNo\":\"11\",\"creditCardLines\":\"1\"},\"emplymt\":{\"employerNm\":\"工作单位\",\"mtJobSectorCd\":\"50300\",\"mtJobSectorCdDscp\":\"畜牧业生产人员\",\"prevServiceYr\":\"1\",\"prevServiceMth\":\"1\",\"mtPosHeldCd\":\"006\",\"employerPhone\":\"123\",\"dtWorkInCurrIndustry\":\"2013-06-24 00:00:00\",\"isBizEntity\":\"N\"}},\"family\":[{\"identity\":{\"nm\":\"ttt\",\"mtCifIdTypCd\":\"I2\",\"mtGenderCd\":\"M\",\"idNo\":\"234243\",\"dtRegistered\":\"1988-06-28 00:00:00\",\"mobileNo\":\"13819126032\",\"mtCifRelCd\":\"II002\"},\"finance\":{\"mtIncSourceCd\":\"ISC005\",\"yearIncAmt\":\"111111\"}},{\"identity\":{\"nm\":\"ttt\",\"mtCifIdTypCd\":\"I2\",\"mtGenderCd\":\"F\",\"idNo\":\"3431222\",\"dtRegistered\":\"1988-06-28 00:00:00\",\"mobileNo\":\"13891897842\",\"mtCifRelCd\":\"II002\"},\"finance\":{\"mtIncSourceCd\":\"ISC005\",\"yearIncAmt\":\"111111\"}}],\"doc\":{\"cifDocRefId\":\"717dfc405ee44772a1364e6642d4d689\",\"facDocRefId\":\"f376788e74bb4f18bba79c9961bd5f31\"}}";
    Map<String,Object> map= JSONObject.parseObject(jsonData,HashMap.class);
    return map;
  }
}

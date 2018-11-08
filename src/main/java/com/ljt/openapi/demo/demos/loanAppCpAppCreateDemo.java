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
 * @Program Name : com.ljt.openapi.demo.demos.loanAppCpAppCreateDemo
 * @Description : 企贷创建申请
 * @author : zhouzb
 * @Creation Date : 2018年10月24日 上午10:51:41
 */
public class loanAppCpAppCreateDemo {
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
  public void createCpAppTest() throws Exception {
    // 构建请求体
    String requestBody = JSONObject.toJSONString(getData());
    String method="loan_app:cp_app:create";
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
    String jsonData="{\"cif\":{\"corporate\":{\"mtCifCatCd\":\"111\",\"mtCorpSalutationCd\":\"1\",\"mtFinInsttnCd\":\"01\",\"nationalityMtCtryCd\":\"CN\",\"mtIndCd\":\"c305\",\"isComb\":\"N\",\"mtListedCd\":\"Y\",\"isFreeTradeArea\":\"Y\",\"cancelledNum\":0,\"approvedNum\":0,\"nm\":\"测试借款企业7\",\"idNo\":\"450273020039113424\",\"mtCifIdTypCd\":\"C2\",\"coreBiz\":\"测试\",\"principalNo\":\"136677889\",\"mtCtryCd\":\"CN\",\"mtStateCd\":\"110000\",\"mtCityCd\":\"110100\",\"brandNm\":\"12\",\"grpNm\":\"12121212121\",\"website\":\"www.baidu.com\",\"mtIndCatCd\":\"c30\",\"mtIndDetailCd\":\"c3055\",\"mtIndTypCd\":\"c\",\"stockCode\":\"123456\"},\"taxInfo\":{\"dtRegistered\":\"2018-10-26 00:00:00\",\"isLongEffec\":true,\"bizRegDtExpiry\":\"\",\"bizRegNo\":\"132312312312978790\",\"authCapital\":\"12\",\"registeredAddr\":\"12\",\"isBussLongEffec\":\"Y\",\"incomeTaxNo\":\"00000000\",\"nationalTaxNo\":\"88888888\",\"corpIdNo\":\"3212313215468798\"},\"bizCertificates\":[{\"mtBizCertificateTypCd\":\"00\",\"no\":\"123213213213\",\"dtExpiry\":\"2020-07-14 00:00:00\"},{\"mtBizCertificateTypCd\":\"00\",\"no\":\"888888888888888\",\"dtExpiry\":\"2020-07-14 00:00:00\"}]},\"biz\":{\"employeeCnt\":\"1\",\"assetAmt\":\"1\",\"noOfBizSite\":1,\"mtCorpTypeCd\":\"04\",\"dtCommenceTrading\":\"2018-10-30 00:00:00\",\"bizAddr\":\"1\",\"mtBizLandOwnerCd\":\"1\",\"bizLandArea\":1,\"saleAmt\":\"1\",\"ratal\":\"1\",\"waterDosage\":\"1\",\"electricityDosage\":\"1\",\"salaryTotal\":\"1\",\"mtSalaryTypCd\":\"1\",\"socialSecurity\":\"1\",\"equityLine\":\"1\"},\"fin\":{\"mtFinFmtCd\":\"004\",\"mtFinRptCatCd\":\"1\",\"mtFinRptTypCd\":\"1\",\"mtFinStsCd\":\"001\",\"dtFin\":\"2017-05-03\",\"finItems\":{\"BS88\":\"0\",\"ANNEX026\":\"1419144.7\",\"ANNEX08\":\"13487368.34\",\"ANNEX09\":\"6438224.76\",\"ANNEX10\":\"9700377.53\",\"ANNEX11\":\"35561095.45\",\"ANNEX12\":\"40264711.04\",\"ANNEX13\":\"13794328.73\"}},\"rel\":{\"legalRelInfo\":{\"isActualCtrl\":\"Y\",\"isInvolvedMgmt\":\"Y\",\"dtInCompSince\":\"2016-06-27 00:00:00\",\"dtInBizLineSince\":\"2016-06-27 00:00:00\",\"mgmtExperience\":\"dddd\",\"mtPosHeldCd\":\"001\"},\"identity\":{\"mtCifIdTypCd\":\"I2\",\"idNo\":\"ddfdsfds\",\"isLongEffec\":\"N\",\"dtExpiry\":\"\",\"nationalityMtCtryCd\":\"CN\",\"nm\":\"dddd\",\"mtGenderCd\":\"M\",\"mtMaritalStsCd\":\"02\",\"dtRegistered\":\"2018-11-01 00:00:00\",\"mtCityCd\":\"110100\",\"mtCtryCd\":\"CN\",\"mtStateCd\":\"110000\",\"mtResidenceStsCd\":\"01\",\"mobileNo\":\"13887597721\",\"mtIndvMobileUsageStsCd\":\"03\",\"mtEduLvlCd\":\"02\",\"email\":\"912933515@qq.com\",\"weChat\":\"13887597721\",\"qq\":\"912933515\"},\"finance\":{\"hasCar\":\"Y\",\"hasCreditCard\":\"Y\",\"isFamily\":\"Y\",\"yearIncAmt\":\"12321\",\"plateNo\":\"1\",\"creditCardLines\":\"1\"},\"emplymt\":{\"isComb\":\"Y\",\"bizRegDtExpiry\":\"\",\"isLeglaRep\":\"\",\"isBussLongEffec\":\"Y\",\"bizRegNo\":\"817004118277404585\",\"bizAddr\":\"经营地址\",\"isLegalRep\":\"Y\",\"currentTotal\":\"12\",\"yearSaleMarginsRate\":\"12\",\"ratal\":\"13\",\"electricityDosage\":\"14\",\"waterDosage\":\"15\",\"socialSecurity\":\"16\",\"equityLine\":\"17\",\"employees\":\"18\",\"salaryTotal\":\"29\",\"workPhone\":\"联系电话\",\"mtIndDetailCd\":\"c2412\",\"mtIndCatCd\":\"c24\",\"mtIndCd\":\"c241\",\"mtIndTypCd\":\"c\",\"bizArea\":\"经营范围\",\"isBizEntity\":\"Y\"}},\"contact\":[{\"nm\":\"测试的联系人\",\"mobileNo\":\"15811269699\",\"mtPosHeldCd\":\"005\",\"email\":\"89asdsa@qq.com\"},{\"nm\":\"测试的联系人2\",\"mobileNo\":\"15811269888\",\"mtPosHeldCd\":\"005\",\"email\":\"biany@lianjintai.com\"}],\"fac\":{\"mtFacCd\":\"1026\",\"lmtAppr\":\"12\",\"isRevolvingAllowed\":\"Y\",\"mtTimeCd\":\"M\",\"tenureAppr\":\"12\",\"mtFacTypCd\":\"1\",\"intRate\":\"12\",\"intRateInSuspense\":\"12\",\"mtRepymtTypCd\":\"005\",\"mtFacPurCdList\":[{\"mtFacPurCd\":\"1001\"}],\"deductAcctNo\":\"6039425988\",\"mtIntRateTypCd\":\"Y\"},\"doc\":{\"cifDocRefId\":\"bee503b47798415bb19382ab68aba1f1\",\"facDocRefId\":\"d317f08e5eb442738ebc9f82efd3c121\"},\"ccms\":{\"mtCpCreditModelCd\":\"N1\",\"options\":[{\"selected\":[\"A\"],\"cd\":\"chhfw\"},{\"selected\":[\"A\"],\"cd\":\"cwgl\"},{\"selected\":[\"A\"],\"cd\":\"gdzcld\"},{\"selected\":[\"A\"],\"cd\":\"gjzc\"},{\"selected\":[\"A\"],\"cd\":\"dfzc\"},{\"selected\":[\"A\"],\"cd\":\"hytzhj\"},{\"selected\":[\"A\"],\"cd\":\"qybj\"},{\"selected\":[\"A\"],\"cd\":\"ssxfsc\"},{\"selected\":[\"A\"],\"cd\":\"yjnl\"},{\"selected\":[\"A\"],\"cd\":\"ywgc\"},{\"selected\":[\"A\"],\"cd\":\"yysr\"},{\"selected\":[\"A\"],\"cd\":\"zczj\"}]},\"callbackURL\":\"http://www.xxx.com/xxx/xxx\",\"doc\":{\"cifDocRefId\":\"49c41cc803aa47768c463fee77bd0ca2\",\"facDocRefId\":\"cb991f80812e43809183453a1496d5be\"}}";
    Map<String,Object> map= JSONObject.parseObject(jsonData,HashMap.class);
    return map;
  }
}

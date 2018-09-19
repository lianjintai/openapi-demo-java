package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
import com.ljt.openapi.demo.vo.RelCsLoanParam;
import com.ljt.openapi.demo.vo.cs.CsRelSpouseVO;
import com.ljt.openapi.demo.vo.cs.LoanEmplymt;
import com.ljt.openapi.demo.vo.cs.LoanIndv;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

/**
 *
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.CreditCsRelSpouseDemo.java
 * @Description : 创建配偶关联人信息
 * @Author : bianyan
 * @Creation Date : 2017年5月27日 上午10:19:43
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      bianyan 2017年5月27日 create
 */
public class CreditCsRelSpouseDemo {

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

  // 日期类型转换
  private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

  /**
   *
   * @Description : 配偶关联人-非私营业主信息
   * @return : void
   * @Creation Date : 2017年5月26日 下午4:12:31
   * @Author : bianyan
   */
  @Test
  public void createSpouseNotBizTest() throws Exception {
    String requestBody = loanCifIsNotBizEntity();
    System.out.println(requestBody);
    String method = "loan_app:cif_cs_rel_spouse:create";
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
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Response response = Client.execute(request);
    if (response.getStatusCode() == 200) {
      System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
    }
  }

  /**
   * @Description : 配偶关联人-私营业主信息
   * @return : void
   * @Creation Date : 2017年5月27日 下午3:51:50
   * @Author : bianyan
   */
  @Test
  public void loanCifIsBizEntityTest() throws Exception {
    String requestBody = loanCifIsBizEntity();
    String method = "loan_app:cif_cs_rel_spouse:create";
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
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Response response = Client.execute(request);
    if (response.getStatusCode() == 200) {
      System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
    }
  }

  /**
   *
   * @Description : 组装配偶关联人非私营业主参数(测试数据)
   * @return : String
   * @Creation Date : 2017年5月26日 下午4:11:50
   * @Author : bianyan
   */
  private String loanCifIsNotBizEntity() throws ParseException {
    RelCsLoanParam relLoanParams = new RelCsLoanParam();
    CsRelSpouseVO relCsBase = new CsRelSpouseVO();
    relCsBase.setNm("配偶关联人非私营业主");
    relCsBase.setAppId("5cafd7bbdd5d44a99e4a26c13c1f0ed0");
    relCsBase.setMtCifRelCd("II001");
    relCsBase.setIdNo("110113198108221227");
    // 出生日期需与证件号中的出生日期相匹配
    relCsBase.setDtRegistered(format.parse("1981-08-22"));
    relCsBase.setMtCityCd("110100");
    relCsBase.setDtIssue(new Date());
    relCsBase.setMtMaritalStsCd("02");
    relCsBase.setDtExpiry(new Date());
    // 性别需与证件号对应的性别想匹配
    relCsBase.setMtGenderCd("F");
    relCsBase.setMtEduLvlCd("01");
    relCsBase.setMtResidenceStsCd("01");
    relCsBase.setIsFamily("Y");
    relCsBase.setMonthlyIncAmt(new BigDecimal("100000"));
    relCsBase.setEmail("123@qq.com");
    relCsBase.setMobileNo("18888888889");
    relCsBase.setMtIndvMobileUsageStsCd("01");
    relCsBase.setQq(934111111);
    relCsBase.setWeChat("18888888889");
    relCsBase.setBankCard(new BigDecimal("1234556565"));
    relCsBase.setCreditCardLines(new BigDecimal("12345"));
    relCsBase.setIsBizEntity("N");
    relLoanParams.setRelCsBase(relCsBase);
    relLoanParams.setRelCsEmploy(loanEmpParam());
    return JSONObject.toJSONString(relLoanParams, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   *
   * @Description : 职位信息参数(测试数据)
   * @return : LoanEmplymt
   * @Creation Date : 2017年5月27日15:28:22
   * @Author : bianyan
   */
  private LoanEmplymt loanEmpParam() {
    LoanEmplymt loanEmplymt = new LoanEmplymt();
    loanEmplymt.setPrevServiceMth(1);
    loanEmplymt.setPrevServiceYr(2);
    loanEmplymt.setMtPosHeldCd("001");
    loanEmplymt.setEmployerNm("单位姓名");
    loanEmplymt.setDtWorkInCurrIndustry(new Date());
    return loanEmplymt;
  }

  /**
   *
   * @Description : 组装私营业主参数(测试数据)
   * @return : String
   * @Creation Date : 2017年5月27日 上午10:32:54
   * @Author : bianyan
   */
  private String loanCifIsBizEntity() throws ParseException {
    RelCsLoanParam relLoanParams = new RelCsLoanParam();
    CsRelSpouseVO relCsBase = new CsRelSpouseVO();
    relCsBase.setNm("配偶关联人私营业主");
    relCsBase.setAppId("5cafd7bbdd5d44a99e4a26c13c1f0ed0");
    relCsBase.setMtCifRelCd("II001");
    relCsBase.setIdNo("110113198108221227");
    // 出生日期需与证件号中的出生日期相匹配
    relCsBase.setDtRegistered(format.parse("1981-08-22"));
    relCsBase.setMtCityCd("110100");
    relCsBase.setDtIssue(new Date());
    relCsBase.setMtMaritalStsCd("02");
    relCsBase.setDtExpiry(new Date());
    relCsBase.setMtGenderCd("F");
    relCsBase.setMtEduLvlCd("01");
    relCsBase.setMtResidenceStsCd("01");
    relCsBase.setIsFamily("Y");
    relCsBase.setMonthlyIncAmt(new BigDecimal("100000"));
    relCsBase.setEmail("123@qq.com");
    relCsBase.setMobileNo("18888888889");
    relCsBase.setMtIndvMobileUsageStsCd("01");
    relCsBase.setQq(934111111);
    relCsBase.setWeChat("18888888889");
    relCsBase.setBankCard(new BigDecimal("1234556565"));
    relCsBase.setCreditCardLines(new BigDecimal("12345"));
    relCsBase.setLoanFixedYear(new BigDecimal("11"));
    relCsBase.setIsBizEntity("Y");
    relLoanParams.setRelCsBase(relCsBase);
    relLoanParams.setRelCsBusiness(loanIndvParam());
    return JSONObject.toJSONString(relLoanParams, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   *
   * @Description : 私营业主信息(测试数据)
   * @return : LoanIndv
   * @Creation Date : 2017年5月27日 上午10:35:21
   * @Author : bianyan
   */
  private LoanIndv loanIndvParam() {
    LoanIndv loanIndv = new LoanIndv();
    loanIndv.setBizAddr("北京");
    loanIndv.setBizArea("电子商务");
    loanIndv.setBizRegNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 15));
    loanIndv.setCurrentTotal(new BigDecimal("123"));
    loanIndv.setElectricityDosage(new BigDecimal("123"));
    loanIndv.setRatal(new BigDecimal("123"));
    loanIndv.setSocialSecurity(new BigDecimal("123"));
    loanIndv.setEquityLine(new BigDecimal("123"));
    loanIndv.setSalaryTotal(new BigDecimal("123"));
    loanIndv.setIsLegalRep("Y");
    loanIndv.setMtJobSectorCd("10000");
    loanIndv.setEmployees("22");
    loanIndv.setWaterDosage(new BigDecimal("123"));
    loanIndv.setMtIndDetailCd("a0111");
    return loanIndv;
  }

}

package com.ljt.openapi.demo.demos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.vo.CpCust;
import com.ljt.openapi.demo.vo.CsCust;
import com.ljt.openapi.demo.vo.LoanCol;
import com.ljt.openapi.demo.vo.LoanContact;
import com.ljt.openapi.demo.vo.LoanFac;
import com.ljt.openapi.demo.vo.LoanParams;
import com.ljt.openapi.demo.vo.cs.LoanBase;
import com.ljt.openapi.demo.vo.cs.LoanEmplymt;
import com.ljt.openapi.demo.vo.cs.LoanIndv;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.CreditAppDemo.java
 * @Description : 推贷申请创建demo
 * @Author : bingo刑天
 * @Creation Date : 2016年12月28日 下午4:47:42
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      bingo刑天 2016年12月28日 create
 */
public class CreditAppDemo {
  /********************* 以下信息请换成您获取到的密钥 **********************************/
  /**
   * aes加密密钥
   */
  private String key = "";
  /**
   * 产品Key
   */
  private String appKey = "";
  /**
   * 产品密钥
   */
  private String appSecret = "";

  /********************* 以上信息请换成您获取到的密钥 **********************************/
  /**
   * 
   * @Description : 个人推贷非私营业主申请Demo
   * @throws Exception
   * @return : void
   * @Creation Date : 2016年12月27日 上午11:02:27
   * @Author : bingo刑天
   */
  // @Test
  public void credateCsAppTest() throws Exception {
    String requestBody = loanCifIsNotBizEntity();
    String method = "loan_app:app:create";
    String aesKey = key;
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
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Client.execute(request);
  }

  /**
   * 
   * @Description : 个人推贷私营业主申请Demo
   * @throws Exception
   * @return : void
   * @Creation Date : 2016年12月27日 上午11:04:27
   * @Author : bingo刑天
   */
  // @Test
  public void credateCsAppTest2() throws Exception {
    String requestBody = loanCifIsBizEntity();
    String method = "loan_app:app:create";
    String aesKey = key;
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
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Client.execute(request);



  }

  /**
   * 
   * @Description : 企业推贷申请Demo
   * @throws Exception
   * @return : void
   * @Creation Date : 2016年12月27日 下午3:30:45
   * @Author : bingo刑天
   */
  // @Test
  public void credateCpAppTest() throws Exception {
    String requestBody = loanCpParam();
    String method = "loan_app:app:create";
    String aesKey = key;
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
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Client.execute(request);
  }

  /**
   * 
   * @Description : 推贷企贷参数
   * @return : String
   * @Creation Date : 2016年12月28日 下午4:37:50
   * @Author : bingo刑天
   */
  @SuppressWarnings("static-access")
  private String loanCpParam() {
    LoanParams loanParams = new LoanParams();
    CpCust cp_cust = new CpCust();
    cp_cust.setNm("企业");
    cp_cust.setCustId(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    cp_cust.setIsComb("Y");
    cp_cust.setBizRegNo("234353464634563545");
    cp_cust.setIdNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    cp_cust.setBrandNm("213123412");
    cp_cust.setCoreBiz("手机");
    cp_cust.setIsFreeTradeArea("Y");
    cp_cust.setMtCifCatCd("a12");
    cp_cust.setMtCityCd("020");
    cp_cust.setMtCorpSalutationCd("123");
    cp_cust.setMtIndDetailCd("12312");
    cp_cust.setWebsite("baidu.com");
    cp_cust.setDtRegistered(new Date());
    cp_cust.setIncomeTaxNo("ds13wqe5");
    cp_cust.setNationalTaxNo("1332");
    cp_cust.setRegisteredAddr("北京");
    cp_cust.setBizAddr("北京");
    cp_cust.setDtStart(new Date());
    cp_cust.setNoOfBizSite(333);
    cp_cust.setEmployeeCnt(new BigDecimal("12333445"));
    cp_cust.setMtListedCd("y");
    cp_cust.setPaidUpCapital(new BigDecimal("676"));
    cp_cust.setAuthCapital(new BigDecimal("5456"));
    cp_cust.setBizLandArea(4576);
    cp_cust.setMtBizLandOwnerCd("23");
    cp_cust.setSaleAmt(new BigDecimal("33"));
    cp_cust.setAssetAmt(new BigDecimal("55"));
    cp_cust.setRatal(new BigDecimal("3"));
    cp_cust.setSocialSecurity(new BigDecimal("879"));
    cp_cust.setEquityLine(new BigDecimal("879"));
    cp_cust.setWaterDosage(new BigDecimal("879"));
    cp_cust.setElectricityDosage(new BigDecimal("879"));
    cp_cust.setSalaryTotal(new BigDecimal("879"));
    cp_cust.setMtSalaryTypCd("3");
    cp_cust.setPrincipalNo("53453");
    cp_cust.setMtFinInsttnCd("345");
    loanParams.setCp_cust(cp_cust);
    loanParams.setContacts(loanContactParam());
    loanParams.setFac(loanFacParam());
    loanParams.setCol(loanColParam());
    JSONObject json = new JSONObject();
    return json.toJSONString(loanParams, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   * 
   * @Description : 组装个人私营业主参数
   * @return : String
   * @Creation Date : 2016年12月28日 下午3:53:48
   * @Author : bingo刑天
   */
  @SuppressWarnings("static-access")
  private String loanCifIsBizEntity() {
    LoanParams loanParams = new LoanParams();
    CsCust cs_cust = new CsCust();

    LoanBase base = new LoanBase();
    base.setNm("个人私营");
    base.setCustId(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    base.setIdNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    base.setMtCityCd("010");
    base.setDtIssue(new Date());
    base.setMtMaritalStsCd("02");
    base.setDtExpiry(new Date());
    base.setMtGenderCd("M");
    base.setMtEduLvlCd("001");
    base.setMtResidenceStsCd("001");
    base.setIsFamily("Y");
    base.setMtJobSectorCd("21");
    base.setMonthlyIncAmt(new BigDecimal("100000"));
    base.setEmail("123@qq.com");
    base.setMobileNo("18888888888");
    base.setMtIndvMobileUsageStsCd("32");
    base.setQq(12345);
    base.setWeChat("1234");
    base.setBankCard(new BigDecimal("1234556565"));
    base.setCreditCardLines(new BigDecimal("12345"));
    base.setLoanFixedYear(new BigDecimal("11"));
    base.setIsBizEntity("Y");
    cs_cust.setBase(base);
    cs_cust.setBusiness(loanIndvParam());
    loanParams.setCs_cust(cs_cust);
    loanParams.setContacts(loanContactParam());
    loanParams.setFac(loanFacParam());
    loanParams.setCol(loanColParam());
    JSONObject json = new JSONObject();
    return json.toJSONString(loanParams, SerializerFeature.WriteDateUseDateFormat);

  }

  /**
   * 
   * @Description : 组装个人非私营业主参数
   * @return : String
   * @Creation Date : 2016年12月28日 下午3:47:46
   * @Author : bingo刑天
   */
  @SuppressWarnings("static-access")
  private String loanCifIsNotBizEntity() {
    LoanParams loanParams = new LoanParams();
    CsCust cs_cust = new CsCust();

    LoanBase base = new LoanBase();
    base.setNm("个人非私营");
    base.setCustId(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    base.setIdNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    base.setMtCityCd("010");
    base.setDtIssue(new Date());
    base.setMtMaritalStsCd("02");
    base.setDtExpiry(new Date());
    base.setMtGenderCd("M");
    base.setMtEduLvlCd("001");
    base.setMtResidenceStsCd("001");
    base.setIsFamily("Y");
    base.setMtJobSectorCd("21");
    base.setMonthlyIncAmt(new BigDecimal("100000"));
    base.setEmail("123@qq.com");
    base.setMobileNo("18888888888");
    base.setMtIndvMobileUsageStsCd("32");
    base.setQq(12345);
    base.setWeChat("1234");
    base.setBankCard(new BigDecimal("1234556565"));
    base.setCreditCardLines(new BigDecimal("12345"));
    base.setLoanFixedYear(new BigDecimal("11"));
    base.setIsBizEntity("N");
    cs_cust.setEmploy(loanEmpParam());
    cs_cust.setBase(base);
    loanParams.setCs_cust(cs_cust);
    loanParams.setContacts(loanContactParam());
    loanParams.setFac(loanFacParam());
    loanParams.setCol(loanColParam());
    JSONObject json = new JSONObject();
    return json.toJSONString(loanParams, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   * 
   * @Description : 业务信息参数
   * @return : LoanFac
   * @Creation Date : 2016年12月28日 下午3:16:22
   * @Author : bingo刑天
   */
  private LoanFac loanFacParam() {
    LoanFac loanFac = new LoanFac();
    loanFac.setIsRevolvingAllowed("Y");
    loanFac.setLmtAppr(new BigDecimal("123"));
    loanFac.setIntRate(new BigDecimal("123"));
    loanFac.setMtRepymtTypCd("44");
    loanFac.setTenureAppr("123");
    loanFac.setDtMaturity(new Date());
    loanFac.setMtFacCd("1104");
    List<String> loanFacPurCds = new ArrayList<>();
    loanFacPurCds.add("1132");
    loanFacPurCds.add("2134");
    loanFac.setMtTimeCd("d");
    loanFac.setMtFacPurCds(loanFacPurCds);
    return loanFac;
  }

  /**
   * 
   * @Description : 职位信息参数
   * @return : LoanEmplymt
   * @Creation Date : 2016年12月28日 下午3:16:45
   * @Author : bingo刑天
   */
  private LoanEmplymt loanEmpParam() {
    LoanEmplymt loanEmplymt = new LoanEmplymt();
    loanEmplymt.setPrevServiceMth(1);
    loanEmplymt.setPrevServiceYr(2);
    loanEmplymt.setMtPosHeldCd("123");
    loanEmplymt.setEmployerNm("12345");
    loanEmplymt.setDtWorkInCurrIndustry(new Date());
    return loanEmplymt;
  }

  /**
   * 
   * @Description : 联系人信息参数
   * @return : List<LoanContact>
   * @Creation Date : 2016年12月28日 下午3:16:57
   * @Author : bingo刑天
   */
  private List<LoanContact> loanContactParam() {
    List<LoanContact> contacts = new ArrayList<>();
    LoanContact loanContact = new LoanContact();
    loanContact.setEmail("1233@qq.com");
    loanContact.setMobileNo("13333333333");
    loanContact.setNm("联系人");
    loanContact.setMtCifContactCd("001");
    loanContact.setMtPosHeldCd("123");
    contacts.add(loanContact);
    return contacts;
  }

  /**
   * 
   * @Description : 担保品信息参数
   * @return : List<LoanCol>
   * @Creation Date : 2016年12月28日 下午3:17:14
   * @Author : bingo刑天
   */
  private List<LoanCol> loanColParam() {
    LoanCol loanCol = new LoanCol();
    loanCol.setMtCollTypCd("1102");
    loanCol.setMtCollTypeCd("11022");
    loanCol.setCollOwner("所有人");
    loanCol.setCollValue("111111");
    loanCol.setIsDeposit("N");
    List<LoanCol> loanCols = new ArrayList<>();
    loanCols.add(loanCol);
    return loanCols;
  }

  /**
   * 
   * @Description :私营业主信息
   * @return : LoanIndv
   * @Creation Date : 2016年12月28日 下午3:30:33
   * @Author : bingo刑天
   */
  private LoanIndv loanIndvParam() {
    LoanIndv loanIndv = new LoanIndv();
    loanIndv.setBizAddr("北京");
    loanIndv.setBizArea("电子商务");
    loanIndv.setBizRegNo("999999999999999");
    loanIndv.setCurrentTotal(new BigDecimal("123"));
    loanIndv.setElectricityDosage(new BigDecimal("123"));
    loanIndv.setRatal(new BigDecimal("123"));
    loanIndv.setSocialSecurity(new BigDecimal("123"));
    loanIndv.setEquityLine(new BigDecimal("123"));
    loanIndv.setSalaryTotal(new BigDecimal("123"));
    loanIndv.setIsLegalRep("Y");
    loanIndv.setMtJobSectorCd("102");
    loanIndv.setEmployees("22");
    loanIndv.setWaterDosage(new BigDecimal("123"));
    return loanIndv;
  }
}

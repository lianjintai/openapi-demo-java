package apiTest;

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
import com.ljt.openapi.demo.util.PropertiesUtils;
import com.ljt.openapi.demo.vo.CpCust;
import com.ljt.openapi.demo.vo.CsCust;
import com.ljt.openapi.demo.vo.LoanCol;
import com.ljt.openapi.demo.vo.LoanContact;
import com.ljt.openapi.demo.vo.LoanFac;
import com.ljt.openapi.demo.vo.LoanParams;
import com.ljt.openapi.demo.vo.cs.LoanBase;
import com.ljt.openapi.demo.vo.cs.LoanEmplymt;
import com.ljt.openapi.demo.vo.cs.LoanIndv;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

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
public class CreatedAppTest {

  /**
   * 
   * @Description : 正例测试创建推贷申请
   * @throws Exception
   * @return : void
   * @Creation Date : 2017年1月3日 下午4:09:28
   * @Author : bingo刑天
   */
  @Test
  public void createCsAppTest() throws Exception {
    String requestBody = loanCifIsBizEntity();
    String method = "loan_app:app:create";
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

  /**
   * 
   * @Description : 反例测试无产品密钥
   * @throws Exception 参数错误异常
   * @return : void
   * @Creation Date : 2017年1月3日 下午2:15:46
   * @Author : bingo刑天
   */
  @Test(expected = IllegalArgumentException.class)
  public void createCsAppTest1() throws Exception {
    String requestBody = loanCifIsNotBizEntity();
    String method = "loan_app:app:create";
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
   * 
   * @Description : 反例测试aes密钥为空
   * @throws Exception
   * @return : void
   * @Creation Date : 2017年1月3日 下午2:17:32
   * @Author : bingo刑天
   */
  @Test(expected = NullPointerException.class)
  public void createCsAppTest2() throws Exception {
    String requestBody = loanCifIsBizEntity();
    String method = "loan_app:app:create";
    String aesKey = null;
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    request.setHost(HttpSchema.HTTP + ApiHost.DEV_API_HOST.getHost());
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
   * 
   * @Description : 反例测试aes密钥格式错误
   * @throws Exception
   * @return : void
   * @Creation Date : 2017年1月3日 下午2:18:17
   * @Author : bingo刑天
   */
  @Test(expected = IllegalArgumentException.class)
  public void createCsAppTest3() throws Exception {
    String requestBody = loanCifIsBizEntity();
    String method = "loan_app:app:create";
    String aesKey = UUID.randomUUID().toString();
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    request.setHost(HttpSchema.HTTP + ApiHost.DEV_API_HOST.getHost());
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
    cp_cust.setBizRegNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 15));
    cp_cust.setIdNo(UUID.randomUUID().toString().replaceAll("-", "").substring(0, 18));
    cp_cust.setBrandNm("213123412");
    cp_cust.setCoreBiz("手机");
    cp_cust.setIsFreeTradeArea("Y");
    cp_cust.setMtCifCatCd("112");
    cp_cust.setMtCityCd("110100");
    cp_cust.setMtCorpSalutationCd("2");
    cp_cust.setMtIndDetailCd("a0111");
    cp_cust.setWebsite("baidu.com");
    cp_cust.setDtRegistered(new Date());
    cp_cust.setIncomeTaxNo("ds13wqe5");
    cp_cust.setNationalTaxNo("1332");
    cp_cust.setRegisteredAddr("北京");
    cp_cust.setBizAddr("北京");
    cp_cust.setDtStart(new Date());
    cp_cust.setNoOfBizSite(333);
    cp_cust.setEmployeeCnt(new BigDecimal("12333445"));
    cp_cust.setMtListedCd("Y");
    cp_cust.setPaidUpCapital(new BigDecimal("676"));
    cp_cust.setAuthCapital(new BigDecimal("5456"));
    cp_cust.setBizLandArea(4576);
    cp_cust.setMtBizLandOwnerCd("2");
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
    cp_cust.setMtFinInsttnCd("02");
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
    base.setMtCityCd("110100");
    base.setDtIssue(new Date());
    base.setMtMaritalStsCd("02");
    base.setDtExpiry(new Date());
    base.setMtGenderCd("M");
    base.setMtEduLvlCd("01");
    base.setMtResidenceStsCd("01");
    base.setIsFamily("Y");
    base.setMtJobSectorCd("10000");
    base.setYearIncAmt(new BigDecimal("100000"));
    base.setEmail("123@qq.com");
    base.setMobileNo("18888888888");
    base.setMtIndvMobileUsageStsCd("01");
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
    base.setMtCityCd("110100");
    base.setDtIssue(new Date());
    base.setMtMaritalStsCd("02");
    base.setDtExpiry(new Date());
    base.setMtGenderCd("M");
    base.setMtEduLvlCd("01");
    base.setMtResidenceStsCd("01");
    base.setIsFamily("Y");
    base.setMtJobSectorCd("10000");
    base.setYearIncAmt(new BigDecimal("100000"));
    base.setEmail("123@qq.com");
    base.setMobileNo("18888888888");
    base.setMtIndvMobileUsageStsCd("01");
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
    loanFac.setMtRepymtTypCd("001");
    loanFac.setTenureAppr("12");
    loanFac.setDtMaturity(new Date());
    loanFac.setMtFacCd("P101");
    List<String> loanFacPurCds = new ArrayList<>();
    loanFacPurCds.add("1001");
    loanFacPurCds.add("1002");
    loanFac.setMtTimeCd("D");
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
    loanEmplymt.setMtPosHeldCd("001");
    loanEmplymt.setEmployerNm("单位姓名");
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
    loanContact.setMtCifContactCd("F001");
    loanContact.setMtPosHeldCd("001");
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
    loanCol.setMtCollTypCd("CC");
    loanCol.setMtCollStyleCd("ZY");
    loanCol.setCollOwner("所有人");
    loanCol.setCollValue("111111");
    loanCol.setIsDeposit("N");
    loanCol.setMtCollCd("ZY0601001");
    loanCol.setMtCollCatCd("CC02");
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

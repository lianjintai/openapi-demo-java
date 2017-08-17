package com.ljt.openapi.demo.demos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

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
import com.ljt.openapi.demo.vo.AppCollEvaluateVO;
import com.ljt.openapi.demo.vo.AppCollMvApiVO;
import com.ljt.openapi.demo.vo.AppCollOwnerVO;
import com.ljt.openapi.demo.vo.MvBasicInfoVO;
import com.ljt.openapi.demo.vo.MvConfInfoVO;
import com.ljt.openapi.demo.vo.MvInsuranceInfo;
import com.ljt.openapi.demo.vo.MvPaymentInfoVO;
import com.ljt.openapi.demo.vo.MvPenaltyInfoVO;

/**
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.AddCollMvDemo.java
 * @Description : 新增机动车担保品Demo
 * @Author : zhiqiang zhang
 * @Creation Date : 2017年8月16日 下午3:59:13
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      zhiqiang zhang 2017年8月16日 create
 */
public class AddCollMvDemo {
  /********************* 以下信息请换成您获取到的密钥 **********************************/
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

  /**
   * @Description : 财报上传demo
   * @return : void
   * @Creation Date : 2017年5月8日 下午6:36:08
   * @Author : zhiqiang zhang
   */
  @Test
  public void AddCollMvTest() throws Exception {
    String requestBody = collMvParams();
    String method = "loan_app:coll_mv:create";
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
   * @Description : 新增机动车担保品请求参数示例
   * @return : String
   * @Creation Date : 2017年8月17日 下午1:57:01
   * @Author : zhiqiang zhang
   */
  public String collMvParams() {
    AppCollMvApiVO appCollMvApiVO = new AppCollMvApiVO();
    appCollMvApiVO.setAppId("0092728480d24f5d87bf63639b5cfe1c");
    appCollMvApiVO.setMtCollStyleCd("DY");
    appCollMvApiVO.setMtCollCatCd("MV01");
    appCollMvApiVO.setMtCollCd("DY0601001");
    appCollMvApiVO.setCollValue(new BigDecimal("123456.78"));
    appCollMvApiVO.setDtPurchased(new Date());
    appCollMvApiVO.setMortgageInfo("抵押摘要");
    appCollMvApiVO.setPurchasedPrc(new BigDecimal("500000.78"));
    // 机动车基本信息
    appCollMvApiVO.setMvBasicInfo(getMvBasicInfo());
    // 车辆配置
    appCollMvApiVO.setMvConfInfo(getMvConfInfo());
    // 交强险信息
    appCollMvApiVO.setMvInsuranceInfo(getMvInsuranceInfo());
    // 代收车船费
    appCollMvApiVO.setMvPaymentInfo(getMvPaymentInfo());
    // 违章情况
    appCollMvApiVO.setMvPenaltyInfo(getMvPenaltyInfo());
    // 所有者信息（个人）
    appCollMvApiVO.setCsCollOwner(getCsCollOwner());
    // 所有者信息（企业）
    appCollMvApiVO.setCsCollOwner(getCpCollOwner());
    // 外部评估信息
    appCollMvApiVO.setAppCollEvaluate(getAppCollEvaluate());
    return JSONObject.toJSONString(appCollMvApiVO, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   * @Description : 外部评估信息（测试数据）
   * @return : List<AppCollEvaluateVO>
   * @Creation Date : 2017年8月17日 下午8:07:48
   * @Author : zhiqiang zhang
   */
  private List<AppCollEvaluateVO> getAppCollEvaluate() {
    List<AppCollEvaluateVO> appCollEvaluate = new ArrayList<>();
    AppCollEvaluateVO appCollEvaluateVO = new AppCollEvaluateVO();
    appCollEvaluateVO.setEvaluateValue(new BigDecimal("123456.78"));
    appCollEvaluateVO.setDtEvaluated(new Date());
    appCollEvaluateVO.setAppraiser("李四");
    appCollEvaluate.add(appCollEvaluateVO);
    return appCollEvaluate;
  }

  /**
   * @Description : 所有者信息（企业）（测试数据）
   * @return : List<AppCollOwnerVO>
   * @Creation Date : 2017年8月17日 下午8:07:30
   * @Author : zhiqiang zhang
   */
  private List<AppCollOwnerVO> getCpCollOwner() {
    List<AppCollOwnerVO> cpCollOwner = new ArrayList<>();
    AppCollOwnerVO appCollOwner3 = new AppCollOwnerVO();
    appCollOwner3.setNm("北京某某公司");
    appCollOwner3.setIdNo("110113198410126911");
    appCollOwner3.setIsComb("Y");
    AppCollOwnerVO appCollOwner4 = new AppCollOwnerVO();
    appCollOwner4.setNm("上海某某公司");
    appCollOwner4.setIdNo("110113198410126922");
    appCollOwner4.setIsComb("N");
    cpCollOwner.add(appCollOwner3);
    cpCollOwner.add(appCollOwner4);
    return cpCollOwner;
  }

  /**
   * @Description : 所有者信息（个人）（测试数据）
   * @return : List<AppCollOwnerVO>
   * @Creation Date : 2017年8月17日 下午8:07:16
   * @Author : zhiqiang zhang
   */
  private List<AppCollOwnerVO> getCsCollOwner() {
    List<AppCollOwnerVO> csCollOwner = new ArrayList<>();
    AppCollOwnerVO appCollOwner1 = new AppCollOwnerVO();
    appCollOwner1.setNm("张三");
    appCollOwner1.setMtCifIdTypCd("I");
    appCollOwner1.setIdNo("110113198410126933");
    appCollOwner1.setMobileNo("13512341234");
    AppCollOwnerVO appCollOwner2 = new AppCollOwnerVO();
    appCollOwner2.setNm("李四");
    appCollOwner2.setMtCifIdTypCd("I");
    appCollOwner2.setIdNo("110113198410126932");
    appCollOwner2.setMobileNo("13512341232");
    csCollOwner.add(appCollOwner1);
    csCollOwner.add(appCollOwner2);
    return csCollOwner;
  }

  /**
   * @Description : 违章情况（测试数据）
   * @return : MvPenaltyInfoVO
   * @Creation Date : 2017年8月17日 下午8:07:00
   * @Author : zhiqiang zhang
   */
  private MvPenaltyInfoVO getMvPenaltyInfo() {
    MvPenaltyInfoVO mvPenaltyInfoVO = new MvPenaltyInfoVO();
    mvPenaltyInfoVO.setUnclearedPenaltyPoints(5);
    mvPenaltyInfoVO.setUnpaidPenalty(new BigDecimal("200"));
    return mvPenaltyInfoVO;
  }

  /**
   * @Description : 代收车船费（测试数据）
   * @return : MvPaymentInfoVO
   * @Creation Date : 2017年8月17日 下午8:06:43
   * @Author : zhiqiang zhang
   */
  private MvPaymentInfoVO getMvPaymentInfo() {
    MvPaymentInfoVO mvPaymentInfoVO = new MvPaymentInfoVO();
    mvPaymentInfoVO.setCurYearUnpaid(new BigDecimal("200"));
    mvPaymentInfoVO.setForfeit(new BigDecimal("200"));
    mvPaymentInfoVO.setLastYearPaid(new BigDecimal("200"));
    mvPaymentInfoVO.setFeeSum(new BigDecimal("600"));
    Calendar calendar = Calendar.getInstance();
    mvPaymentInfoVO.setPaymentYear(new Date(calendar.get(Calendar.YEAR)));
    return mvPaymentInfoVO;
  }

  /**
   * @Description : 交强险信息(测试数据)
   * @return : MvInsuranceInfo
   * @Creation Date : 2017年8月17日 下午8:06:24
   * @Author : zhiqiang zhang
   */
  private MvInsuranceInfo getMvInsuranceInfo() {
    MvInsuranceInfo insuranceInfo = new MvInsuranceInfo();
    insuranceInfo.setDeathPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setNoResponDeathPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setNoResponMedicalPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setNoResponPropertyLossPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setPropertyLossPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setMedicalPayLimit(new BigDecimal("50000.01"));
    insuranceInfo.setInsuranceSum(new BigDecimal("50000.01"));
    insuranceInfo.setRescueFundRate(new BigDecimal("52.22"));
    insuranceInfo.setRescueFund(new BigDecimal("50000.01"));
    insuranceInfo.setDtInsuranceStart(new Date());
    insuranceInfo.setDtInsuranceEnd(new Date());
    List<String> mtInsuranceResolutionCd = new ArrayList<>();
    mtInsuranceResolutionCd.add("001");
    mtInsuranceResolutionCd.add("002");
    insuranceInfo.setMtInsuranceResolutionCd(mtInsuranceResolutionCd);
    insuranceInfo.setHasInsurancePayHis("Y");
    insuranceInfo.setEngineNo("123456789987654321");
    insuranceInfo.setFrameNo("WFIE231231");
    insuranceInfo.setPlateNo("JWF1231233");
    insuranceInfo.setInsurancePaySum(new BigDecimal("50000.01"));
    insuranceInfo.setAccidentIllegalRate(new BigDecimal("52"));
    return insuranceInfo;
  }

  /**
   * @Description : 车辆配置（测试数据）
   * @return : MvConfInfoVO
   * @Creation Date : 2017年8月17日 下午7:41:15
   * @Author : zhiqiang zhang
   */
  private MvConfInfoVO getMvConfInfo() {
    MvConfInfoVO confInfoVO = new MvConfInfoVO();
    List<String> mtAirconditionTypCd = new ArrayList<>();
    mtAirconditionTypCd.add("001");
    mtAirconditionTypCd.add("002");
    confInfoVO.setMtAirconditionTypCd(mtAirconditionTypCd);
    List<String> mtCommonConfTypCd = new ArrayList<>();
    mtCommonConfTypCd.add("001");
    mtCommonConfTypCd.add("002");
    confInfoVO.setMtCommonConfTypCd(mtCommonConfTypCd);
    List<String> mtDriverEleTypCd = new ArrayList<>();
    mtDriverEleTypCd.add("001");
    mtDriverEleTypCd.add("002");
    confInfoVO.setMtDriverEleTypCd(mtDriverEleTypCd);
    List<String> mtGearboxTypCd = new ArrayList<>();
    mtGearboxTypCd.add("001");
    mtGearboxTypCd.add("002");
    confInfoVO.setMtGearboxTypCd(mtGearboxTypCd);
    List<String> mtParkingRadarTypCd = new ArrayList<>();
    mtParkingRadarTypCd.add("001");
    mtParkingRadarTypCd.add("002");
    confInfoVO.setMtParkingRadarTypCd(mtParkingRadarTypCd);
    List<String> mtSeatHeatTypCd = new ArrayList<>();
    mtSeatHeatTypCd.add("001");
    mtSeatHeatTypCd.add("002");
    confInfoVO.setMtSeatHeatTypCd(mtSeatHeatTypCd);
    return confInfoVO;
  }

  /**
   * @Description : 机动车基本信息（测试数据）
   * @return : MvBasicInfoVO
   * @Creation Date : 2017年8月17日 下午7:39:17
   * @Author : zhiqiang zhang
   */
  private MvBasicInfoVO getMvBasicInfo() {
    MvBasicInfoVO basicInfoVO = new MvBasicInfoVO();
    basicInfoVO.setDtFirstRecord(new Date());
    basicInfoVO.setVehicleType("汽车");
    basicInfoVO.setBrand("奥迪");
    basicInfoVO.setApprovedMass(new BigDecimal("1000"));
    basicInfoVO.setApprovedPassenger(6);
    basicInfoVO.setColor("红");
    basicInfoVO.setDrivenDistance(new BigDecimal("1000"));
    basicInfoVO.setEngineCapacity(new BigDecimal("2.0"));
    basicInfoVO.setIsMadeInChina("N");
    basicInfoVO.setManufactured(new Date());
    basicInfoVO.setModel("轿车");
    List<String> mtFuelCd = new ArrayList<>();
    mtFuelCd.add("001");
    mtFuelCd.add("002");
    mtFuelCd.add("003");
    basicInfoVO.setMtFuelCd(mtFuelCd);
    basicInfoVO.setPower(new BigDecimal("232.0"));
    basicInfoVO.setPriceMax(new BigDecimal("500000.01"));
    basicInfoVO.setPriceMin(new BigDecimal("20000.01"));
    basicInfoVO.setSeries("美系车");
    return basicInfoVO;
  }
}

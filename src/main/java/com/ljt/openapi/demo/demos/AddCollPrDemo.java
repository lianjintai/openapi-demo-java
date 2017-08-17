package com.ljt.openapi.demo.demos;

import java.math.BigDecimal;
import java.util.ArrayList;
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
import com.ljt.openapi.demo.vo.AppCollEvaluateVO;
import com.ljt.openapi.demo.vo.AppCollOwnerVO;
import com.ljt.openapi.demo.vo.AppCollPrVO;
import com.ljt.openapi.demo.vo.PrBasicInfoVO;
import com.ljt.openapi.demo.vo.PrConsttInfoVO;
import com.ljt.openapi.demo.vo.PrLandInfoVO;
import com.ljt.openapi.demo.vo.PrLeaseInfoVO;
import com.ljt.openapi.demo.vo.PrRecordInfoVO;

/**
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.AddCollMvDemo.java
 * @Description : 新增房产担保品Demo
 * @Author : zhiqiang zhang
 * @Creation Date : 2017年8月16日 下午3:59:13
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      zhiqiang zhang 2017年8月16日 create
 */
public class AddCollPrDemo {
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


  /**
   * @Description : 财报上传demo
   * @return : void
   * @Creation Date : 2017年5月8日 下午6:36:08
   * @Author : zhiqiang zhang
   */
  @Test
  public void AddCollPrTest() throws Exception {
    String requestBody = collPrParams();
    String method = "loan_app:coll_pr:create";
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
   * @Description : 新增房产担保品请求参数示例
   * @return : String
   * @Creation Date : 2017年8月17日 下午1:57:01
   * @Author : zhiqiang zhang
   */
  public String collPrParams() {
    AppCollPrVO appCollPrVO = new AppCollPrVO();
    appCollPrVO.setAppId("0092728480d24f5d87bf63639b5cfe1c");
    appCollPrVO.setMtCollStyleCd("DY");
    appCollPrVO.setMtCollCatCd("PR01");
    appCollPrVO.setMtCollCd("DY0101001");
    appCollPrVO.setCollValue(new BigDecimal("123456.78"));
    appCollPrVO.setDtPurchased(new Date());
    appCollPrVO.setMortgageInfo("抵押摘要");
    appCollPrVO.setPurchasedPrc(new BigDecimal("500000.78"));
    // 房产基本信息
    appCollPrVO.setPrBasicInfo(getPrBasicInfo());
    // 房屋构造情况
    appCollPrVO.setPrConsttInfo(getPrConsttInfo());
    // 土地状况
    appCollPrVO.setPrLandInfo(getPrLandInfo());
    // 租赁信息
    appCollPrVO.setPrLeaseInfo(getPrLeaseInfo());
    // 房屋登记情况
    appCollPrVO.setPrRecordInfo(getPrRecordInfo());
    // 所有者信息（个人）
    appCollPrVO.setCsCollOwner(getCsCollOwner());
    // 所有者信息（企业）
    appCollPrVO.setCsCollOwner(getCpCollOwner());
    // 外部评估信息
    appCollPrVO.setAppCollEvaluate(getAppCollEvaluate());
    return JSONObject.toJSONString(appCollPrVO, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   * @Description : 外部评估信息（测试数据）
   * @return : List<AppCollEvaluateVO>
   * @Creation Date : 2017年8月17日 下午7:35:45
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
   * @Creation Date : 2017年8月17日 下午7:34:41
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
   * @Creation Date : 2017年8月17日 下午7:33:37
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
   * @Description : 房屋登记情况（测试数据）
   * @return : PrRecordInfoVO
   * @Creation Date : 2017年8月17日 下午7:32:12
   * @Author : zhiqiang zhang
   */
  private PrRecordInfoVO getPrRecordInfo() {
    PrRecordInfoVO prRecordInfoVO = new PrRecordInfoVO();
    prRecordInfoVO.setBuildingNo("5");
    prRecordInfoVO.setBuiltUpArea(new BigDecimal("123.5"));
    prRecordInfoVO.setFloorNo(12);
    prRecordInfoVO.setHousingBalconyArea(new BigDecimal("123.5"));
    prRecordInfoVO.setHousingCoveredArea(new BigDecimal("123.5"));
    prRecordInfoVO.setHousingShareArea(new BigDecimal("123.5"));
    prRecordInfoVO.setHousingUsefulArea(new BigDecimal("123.5"));
    prRecordInfoVO.setRoomNo("122");
    prRecordInfoVO.setRoomNum(12);
    prRecordInfoVO.setStructure("砖混结构");
    prRecordInfoVO.setTotalFloorNum(15);
    return prRecordInfoVO;
  }

  /**
   * @Description : 租赁信息(测试数据)
   * @return : PrLeaseInfoVO
   * @Creation Date : 2017年8月17日 下午7:31:21
   * @Author : zhiqiang zhang
   */
  private PrLeaseInfoVO getPrLeaseInfo() {
    PrLeaseInfoVO prLeaseInfoVO = new PrLeaseInfoVO();
    prLeaseInfoVO.setDtEffective(new Date());
    prLeaseInfoVO.setIsLease("Y");
    prLeaseInfoVO.setLesseeNm("张三");
    return prLeaseInfoVO;
  }

  /**
   * @Description : 土地状况（测试数据）
   * @return : PrLandInfoVO
   * @Creation Date : 2017年8月17日 下午7:30:26
   * @Author : zhiqiang zhang
   */
  private PrLandInfoVO getPrLandInfo() {
    PrLandInfoVO prLandInfo = new PrLandInfoVO();
    prLandInfo.setDtLandEnd(new Date());
    prLandInfo.setDtLandStarted(new Date());
    prLandInfo.setLandNo("KL92819928177281");
    prLandInfo.setLandUseLife(88);
    prLandInfo.setMtLandAcquireMtdCd("001");
    prLandInfo.setOtherLandAcquireMtdDscp("土地使用权取得方式");
    return prLandInfo;
  }

  /**
   * @Description : 房屋构造情况(测试数据)
   * @return : PrConsttInfoVO
   * @Creation Date : 2017年8月17日 下午7:29:21
   * @Author : zhiqiang zhang
   */
  private PrConsttInfoVO getPrConsttInfo() {
    PrConsttInfoVO prConsttInfo = new PrConsttInfoVO();
    prConsttInfo.setMtConsttFlrCd("001");
    prConsttInfo.setMtConsttRoofCd("001");
    prConsttInfo.setMtConsttWallCd("001");
    prConsttInfo.setOtherConsttFlrDscp("地面构造");
    prConsttInfo.setOtherConsttRoofDscp("屋顶构造");
    prConsttInfo.setOtherConsttWallDscp("墙壁构造");
    prConsttInfo.setRemark("建筑物说明");
    return prConsttInfo;
  }

  /**
   * @Description : 房产基本信息（测试数据）
   * @return : PrBasicInfoVO
   * @Creation Date : 2017年8月17日 下午7:27:36
   * @Author : zhiqiang zhang
   */
  private PrBasicInfoVO getPrBasicInfo() {
    PrBasicInfoVO prBasicInfo = new PrBasicInfoVO();
    prBasicInfo.setBuildingNm("建筑物名称");
    prBasicInfo.setMtCollShareCd("001");
    prBasicInfo.setAddrLine("美国");
    prBasicInfo.setContractNo("234234324234");
    prBasicInfo.setPropertyNo("");
    prBasicInfo.setDtRecord(new Date());
    prBasicInfo.setAge(22);
    prBasicInfo.setDtFinished(new Date());
    prBasicInfo.setHasElevator("Y");
    prBasicInfo.setMonthPropertyFee(new BigDecimal("1555.22"));
    prBasicInfo.setMtPrtyFacingCd("006");
    prBasicInfo.setMtPrtyUseCd("005");
    prBasicInfo.setOtherPrtyUseDscp("工业用地");
    prBasicInfo.setPropertyCompany("美国物业公司");
    return prBasicInfo;
  }


}

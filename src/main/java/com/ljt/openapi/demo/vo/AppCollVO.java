package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Map;

public class AppCollVO {
  /**
   * 描述:主担保唯一标识
   */
  private java.lang.String id;

  /**
   * 描述:租户id
   */
  private java.lang.String mtTenantId;

  /**
   * 描述:经办机构代码
   */
  private java.lang.String mtOrgCd;

  /**
   * 描述:申请id
   */
  private java.lang.String appId;

  /**
   * 描述:担保编号
   */
  private java.lang.String no;

  /**
   * 描述:担保类型
   */
  private java.lang.String mtCollTypCd;
  private java.lang.String mtCollTypCdDscp;

  /**
   * 描述:担保品种类
   */
  private java.lang.String mtCollCatCd;
  private java.lang.String mtCollCatCdDscp;

  /**
   * 描述:担保小类
   */
  private java.lang.String mtCollCd;
  private java.lang.String mtCollCdDscp;

  /**
   * 描述:担保品状态
   */
  private java.lang.String mtCollStsCd;
  private java.lang.String mtCollStsCdDscp;

  /**
   * 描述:担保方式
   */
  private java.lang.String mtCollStyleCd;
  private java.lang.String mtCollStyleCdDscp;

  /**
   * 描述:担保明细
   */
  private java.lang.String collDet;

  /**
   * 描述:币种
   */
  private java.lang.String mtCurCd;
  private java.lang.String mtCurCdDscp;

  /**
   * 描述:汇率
   */
  private java.math.BigDecimal exchgRate;

  /**
   * 描述:担保品价值
   */
  private java.math.BigDecimal collValue;

  /**
   * 描述:购买日期
   */

  private java.util.Date dtPurchased;
  private java.util.Date dtPurchasedBegin;
  private java.util.Date dtPurchasedEnd;

  /**
   * 描述:购买价值
   */
  private java.math.BigDecimal purchasedPrc;

  /**
   * 描述:抵押摘要
   */
  private java.lang.String mortgageInfo;

  /**
   * 描述:是否特别授信担保
   */
  private java.lang.String isFd;

  /**
   * 描述:安全系数唯一标识
   */
  private java.lang.String mtSafetyClsId;

  /**
   * 描述:备注
   */
  private java.lang.String remark;

  /**
   * 描述:createdBy
   */
  private java.lang.String createdBy;

  /**
   * 描述:updatedBy
   */
  private java.lang.String updatedBy;

  /**
   * 描述:dtCreated
   */
  private java.util.Date dtCreated;
  private java.util.Date dtCreatedBegin;
  private java.util.Date dtCreatedEnd;

  /**
   * 描述:dtUpdated
   */
  private java.util.Date dtUpdated;
  private java.util.Date dtUpdatedBegin;
  private java.util.Date dtUpdatedEnd;

  /**
   * 描述:version
   */
  private BigDecimal version;
  // 业务的主键
  private String facId;
  // 客户的主键
  private String cifId;
  // coll_chrg 主键
  private String collChrgId;

  // coll 主键
  private String collId;
  // 担保详情的主键
  private String collDetilId;

  // 信贷文件的id
  private String cdtFileId;

  // 查询担保品唯一性的条件
  private Map<String, String> map;



  public String getCdtFileId() {
    return cdtFileId;
  }

  public void setCdtFileId(String cdtFileId) {
    this.cdtFileId = cdtFileId;
  }

  public String getCollId() {
    return collId;
  }

  public void setCollId(String collId) {
    this.collId = collId;
  }

  public String getCollDetilId() {
    return collDetilId;
  }

  public void setCollDetilId(String collDetilId) {
    this.collDetilId = collDetilId;
  }

  public String getFacId() {
    return facId;
  }

  public void setFacId(String facId) {
    this.facId = facId;
  }

  public String getCifId() {
    return cifId;
  }

  public void setCifId(String cifId) {
    this.cifId = cifId;
  }

  public String getCollChrgId() {
    return collChrgId;
  }

  public void setCollChrgId(String collChrgId) {
    this.collChrgId = collChrgId;
  }

  public AppCollVO() {}

  public AppCollVO(java.lang.String id) {
    this.id = id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getId() {
    return this.id;
  }



  public void setMtTenantId(java.lang.String mtTenantId) {
    this.mtTenantId = mtTenantId;
  }

  public java.lang.String getMtTenantId() {
    return this.mtTenantId;
  }



  public void setMtOrgCd(java.lang.String mtOrgCd) {
    this.mtOrgCd = mtOrgCd;
  }

  public java.lang.String getMtOrgCd() {
    return this.mtOrgCd;
  }



  public void setAppId(java.lang.String appId) {
    this.appId = appId;
  }

  public java.lang.String getAppId() {
    return this.appId;
  }



  public void setNo(java.lang.String no) {
    this.no = no;
  }

  public java.lang.String getNo() {
    return this.no;
  }



  public void setMtCollTypCd(java.lang.String mtCollTypCd) {
    this.mtCollTypCd = mtCollTypCd;
  }

  public java.lang.String getMtCollTypCd() {
    return this.mtCollTypCd;
  }



  public void setMtCollCatCd(java.lang.String mtCollCatCd) {
    this.mtCollCatCd = mtCollCatCd;
  }

  public java.lang.String getMtCollCatCd() {
    return this.mtCollCatCd;
  }



  public void setMtCollCd(java.lang.String mtCollCd) {
    this.mtCollCd = mtCollCd;
  }

  public java.lang.String getMtCollCd() {
    return this.mtCollCd;
  }



  public void setMtCollStsCd(java.lang.String mtCollStsCd) {
    this.mtCollStsCd = mtCollStsCd;
  }

  public java.lang.String getMtCollStsCd() {
    return this.mtCollStsCd;
  }



  public void setMtCollStyleCd(java.lang.String mtCollStyleCd) {
    this.mtCollStyleCd = mtCollStyleCd;
  }

  public java.lang.String getMtCollStyleCd() {
    return this.mtCollStyleCd;
  }



  public void setCollDet(java.lang.String collDet) {
    this.collDet = collDet;
  }

  public java.lang.String getCollDet() {
    return this.collDet;
  }



  public void setMtCurCd(java.lang.String mtCurCd) {
    this.mtCurCd = mtCurCd;
  }

  public java.lang.String getMtCurCd() {
    return this.mtCurCd;
  }



  public void setExchgRate(java.math.BigDecimal exchgRate) {
    this.exchgRate = exchgRate;
  }

  public java.math.BigDecimal getExchgRate() {
    return this.exchgRate;
  }



  public void setCollValue(java.math.BigDecimal collValue) {
    this.collValue = collValue;
  }

  public java.math.BigDecimal getCollValue() {
    return this.collValue;
  }



  public void setDtPurchased(java.util.Date dtPurchased) {
    this.dtPurchased = dtPurchased;
  }

  public java.util.Date getDtPurchased() {
    return this.dtPurchased;
  }

  public void setDtPurchasedBegin(java.util.Date dtPurchasedBegin) {
    this.dtPurchasedBegin = dtPurchasedBegin;
  }

  public java.util.Date getDtPurchasedBegin() {
    return this.dtPurchasedBegin;
  }

  public void setDtPurchasedEnd(java.util.Date dtPurchasedEnd) {
    this.dtPurchasedEnd = dtPurchasedEnd;
  }

  public java.util.Date getDtPurchasedEnd() {
    return this.dtPurchasedEnd;
  }


  public void setPurchasedPrc(java.math.BigDecimal purchasedPrc) {
    this.purchasedPrc = purchasedPrc;
  }

  public java.math.BigDecimal getPurchasedPrc() {
    return this.purchasedPrc;
  }



  public void setMortgageInfo(java.lang.String mortgageInfo) {
    this.mortgageInfo = mortgageInfo;
  }

  public java.lang.String getMortgageInfo() {
    return this.mortgageInfo;
  }



  public void setIsFd(java.lang.String isFd) {
    this.isFd = isFd;
  }

  public java.lang.String getIsFd() {
    return this.isFd;
  }



  public void setMtSafetyClsId(java.lang.String mtSafetyClsId) {
    this.mtSafetyClsId = mtSafetyClsId;
  }

  public java.lang.String getMtSafetyClsId() {
    return this.mtSafetyClsId;
  }



  public void setRemark(java.lang.String remark) {
    this.remark = remark;
  }

  public java.lang.String getRemark() {
    return this.remark;
  }



  public void setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
  }

  public java.lang.String getCreatedBy() {
    return this.createdBy;
  }



  public void setUpdatedBy(java.lang.String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public java.lang.String getUpdatedBy() {
    return this.updatedBy;
  }



  public void setDtCreated(java.util.Date dtCreated) {
    this.dtCreated = dtCreated;
  }

  public java.util.Date getDtCreated() {
    return this.dtCreated;
  }

  public void setDtCreatedBegin(java.util.Date dtCreatedBegin) {
    this.dtCreatedBegin = dtCreatedBegin;
  }

  public java.util.Date getDtCreatedBegin() {
    return this.dtCreatedBegin;
  }

  public void setDtCreatedEnd(java.util.Date dtCreatedEnd) {
    this.dtCreatedEnd = dtCreatedEnd;
  }

  public java.util.Date getDtCreatedEnd() {
    return this.dtCreatedEnd;
  }


  public void setDtUpdated(java.util.Date dtUpdated) {
    this.dtUpdated = dtUpdated;
  }

  public java.util.Date getDtUpdated() {
    return this.dtUpdated;
  }

  public void setDtUpdatedBegin(java.util.Date dtUpdatedBegin) {
    this.dtUpdatedBegin = dtUpdatedBegin;
  }

  public java.util.Date getDtUpdatedBegin() {
    return this.dtUpdatedBegin;
  }

  public void setDtUpdatedEnd(java.util.Date dtUpdatedEnd) {
    this.dtUpdatedEnd = dtUpdatedEnd;
  }

  public java.util.Date getDtUpdatedEnd() {
    return this.dtUpdatedEnd;
  }

  public BigDecimal getVersion() {
    return version;
  }

  public void setVersion(BigDecimal version) {
    this.version = version;
  }

  public java.lang.String getMtCollTypCdDscp() {
    return mtCollTypCdDscp;
  }

  public void setMtCollTypCdDscp(java.lang.String mtCollTypCdDscp) {
    this.mtCollTypCdDscp = mtCollTypCdDscp;
  }

  public java.lang.String getMtCollCatCdDscp() {
    return mtCollCatCdDscp;
  }

  public void setMtCollCatCdDscp(java.lang.String mtCollCatCdDscp) {
    this.mtCollCatCdDscp = mtCollCatCdDscp;
  }

  public java.lang.String getMtCollCdDscp() {
    return mtCollCdDscp;
  }

  public void setMtCollCdDscp(java.lang.String mtCollCdDscp) {
    this.mtCollCdDscp = mtCollCdDscp;
  }

  public java.lang.String getMtCollStsCdDscp() {
    return mtCollStsCdDscp;
  }

  public void setMtCollStsCdDscp(java.lang.String mtCollStsCdDscp) {
    this.mtCollStsCdDscp = mtCollStsCdDscp;
  }

  public java.lang.String getMtCollStyleCdDscp() {
    return mtCollStyleCdDscp;
  }

  public void setMtCollStyleCdDscp(java.lang.String mtCollStyleCdDscp) {
    this.mtCollStyleCdDscp = mtCollStyleCdDscp;
  }

  public java.lang.String getMtCurCdDscp() {
    return mtCurCdDscp;
  }

  public void setMtCurCdDscp(java.lang.String mtCurCdDscp) {
    this.mtCurCdDscp = mtCurCdDscp;
  }

  public Map<String, String> getMap() {
    return map;
  }

  public void setMap(Map<String, String> map) {
    this.map = map;
  }


}


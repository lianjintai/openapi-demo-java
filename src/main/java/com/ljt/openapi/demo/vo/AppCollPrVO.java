package com.ljt.openapi.demo.vo;

import java.util.List;

public class AppCollPrVO extends AppCollVO {

  /**
   * 描述:房屋基本信息
   */
  private java.lang.String basicInfo;

  /**
   * 描述:土地状况
   */
  private java.lang.String landInfo;

  /**
   * 描述:房屋登记情况
   */
  private java.lang.String recordInfo;

  /**
   * 描述:房屋构造情况
   */
  private java.lang.String consttInfo;

  /**
   * 描述:租赁信息
   */
  private java.lang.String leaseInfo;


  /**
   * 描述:房屋基本信息类
   */
  private PrBasicInfoVO prBasicInfo;


  /**
   * 描述:土地状况
   */
  private PrLandInfoVO prLandInfo;


  /**
   * 描述:房屋登记情况
   */
  private PrRecordInfoVO prRecordInfo;

  /**
   * 描述:房屋构造情况
   */
  private PrConsttInfoVO prConsttInfo;


  /**
   * 描述:租赁信息
   */
  private PrLeaseInfoVO prLeaseInfo;

  /**
   * 所有者信息(个人)
   */
  private List<AppCollOwnerVO> csCollOwner;
  /**
   * 所有者信息(企业)
   */
  private List<AppCollOwnerVO> cpCollOwner;
  /**
   * 评估信息
   */
  private List<AppCollEvaluateVO> appCollEvaluate;

  public AppCollPrVO() {}

  public PrBasicInfoVO getPrBasicInfo() {
    return prBasicInfo;
  }

  public void setPrBasicInfo(PrBasicInfoVO prBasicInfo) {
    this.prBasicInfo = prBasicInfo;
  }

  public PrLandInfoVO getPrLandInfo() {
    return prLandInfo;
  }

  public void setPrLandInfo(PrLandInfoVO prLandInfo) {
    this.prLandInfo = prLandInfo;
  }

  public PrRecordInfoVO getPrRecordInfo() {
    return prRecordInfo;
  }

  public void setPrRecordInfo(PrRecordInfoVO prRecordInfo) {
    this.prRecordInfo = prRecordInfo;
  }

  public PrConsttInfoVO getPrConsttInfo() {
    return prConsttInfo;
  }

  public void setPrConsttInfo(PrConsttInfoVO prConsttInfo) {
    this.prConsttInfo = prConsttInfo;
  }

  public PrLeaseInfoVO getPrLeaseInfo() {
    return prLeaseInfo;
  }

  public void setPrLeaseInfo(PrLeaseInfoVO prLeaseInfo) {
    this.prLeaseInfo = prLeaseInfo;
  }

  public List<AppCollOwnerVO> getCsCollOwner() {
    return csCollOwner;
  }

  public void setCsCollOwner(List<AppCollOwnerVO> csCollOwner) {
    this.csCollOwner = csCollOwner;
  }

  public List<AppCollOwnerVO> getCpCollOwner() {
    return cpCollOwner;
  }

  public void setCpCollOwner(List<AppCollOwnerVO> cpCollOwner) {
    this.cpCollOwner = cpCollOwner;
  }

  public List<AppCollEvaluateVO> getAppCollEvaluate() {
    return appCollEvaluate;
  }

  public void setAppCollEvaluate(List<AppCollEvaluateVO> appCollEvaluate) {
    this.appCollEvaluate = appCollEvaluate;
  }

  public java.lang.String getBasicInfo() {
    return basicInfo;
  }

  public void setBasicInfo(java.lang.String basicInfo) {
    this.basicInfo = basicInfo;
  }

  public java.lang.String getLandInfo() {
    return landInfo;
  }

  public void setLandInfo(java.lang.String landInfo) {
    this.landInfo = landInfo;
  }

  public java.lang.String getRecordInfo() {
    return recordInfo;
  }

  public void setRecordInfo(java.lang.String recordInfo) {
    this.recordInfo = recordInfo;
  }

  public java.lang.String getLeaseInfo() {
    return leaseInfo;
  }

  public void setLeaseInfo(java.lang.String leaseInfo) {
    this.leaseInfo = leaseInfo;
  }

  public java.lang.String getConsttInfo() {
    return consttInfo;
  }

  public void setConsttInfo(java.lang.String consttInfo) {
    this.consttInfo = consttInfo;
  }

}


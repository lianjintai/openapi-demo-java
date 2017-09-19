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

  private AppCollPrBaseVO appCollPr;

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

  public AppCollPrBaseVO getAppCollPr() {
    return appCollPr;
  }

  public void setAppCollPr(AppCollPrBaseVO appCollPr) {
    this.appCollPr = appCollPr;
  }
  
}

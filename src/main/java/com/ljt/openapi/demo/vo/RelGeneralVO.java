package com.ljt.openapi.demo.vo;

import java.util.Date;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.vo.RelGeneralVO.java
 * @Description : 关联人的通用字段（不区分企贷关联人和个贷关联人）
 * @Author : lcy
 * @Creation Date : 2017年5月23日 上午11:06:06
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月23日 create
 */
public class RelGeneralVO {

  /**
   * 客户唯一的标识符
   */
  private String appId;

  /**
   * 关联人姓名
   */
  private String nm;

  /**
   * 身份证
   */
  private String idNo;

  /**
   * 身份证签发日期
   */
  private Date dtIssue;
  /**
   * 身份证到期日
   */
  private Date dtExpiry;
  /**
   * 性别
   */
  private String mtGenderCd;
  /**
   * 婚姻情况
   */
  private String mtMaritalStsCd;

  /**
   * 出生日期
   */
  private Date dtRegistered;

  /**
   * 电话号
   */
  private String mobileNo;

  /**
   * 关联关系代码
   */
  private java.lang.String mtCifRelCd;


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getNm() {
    return nm;
  }

  public void setNm(String nm) {
    this.nm = nm;
  }

  public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public Date getDtIssue() {
    return dtIssue;
  }

  public void setDtIssue(Date dtIssue) {
    this.dtIssue = dtIssue;
  }

  public Date getDtExpiry() {
    return dtExpiry;
  }

  public void setDtExpiry(Date dtExpiry) {
    this.dtExpiry = dtExpiry;
  }

  public String getMtGenderCd() {
    return mtGenderCd;
  }

  public void setMtGenderCd(String mtGenderCd) {
    this.mtGenderCd = mtGenderCd;
  }

  public String getMtMaritalStsCd() {
    return mtMaritalStsCd;
  }

  public void setMtMaritalStsCd(String mtMaritalStsCd) {
    this.mtMaritalStsCd = mtMaritalStsCd;
  }



  public Date getDtRegistered() {
    return dtRegistered;
  }

  public void setDtRegistered(Date dtRegistered) {
    this.dtRegistered = dtRegistered;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public java.lang.String getMtCifRelCd() {
    return mtCifRelCd;
  }

  public void setMtCifRelCd(java.lang.String mtCifRelCd) {
    this.mtCifRelCd = mtCifRelCd;
  }



}

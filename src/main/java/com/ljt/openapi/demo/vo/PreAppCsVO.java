package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;

public class PreAppCsVO {

  private String custId;


  private String nm;


  /**
   * 身份证号码
   */
  private String idNo;

  /**
   * 性别
   */
  private String mtGenderCd;


  /**
   * 婚姻情况
   */
  private String mtMaritalStsCd;


  /**
   * 最高学历
   */
  private String mtEduLvlCd;
  /**
   * 本地居住情况
   */
  private String mtResidenceStsCd;
  /**
   * 是否自有房产
   */
  private String isFamily;
  /**
   * 职业
   */
  private String mtJobSectorCd;

  /**
   * 所在城市
   */
  private String mtCityCd;

  /**
   * 手机号
   */
  private String mobileNo;
  /**
   * 信用卡额度
   */
  private BigDecimal creditCardLines;

  /**
   * 客户画像
   */
  private String portrait;


  /**
   * 申请额度
   */
  private BigDecimal lmtAppr;

  /**
   * 业务期限
   */
  private BigDecimal tenureAppr;


  /**
   * 期限单位
   */
  private String mtTimeCd;


  /**
   * 年化利率
   */
  private BigDecimal intRate;


  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
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

  public String getMtEduLvlCd() {
    return mtEduLvlCd;
  }

  public void setMtEduLvlCd(String mtEduLvlCd) {
    this.mtEduLvlCd = mtEduLvlCd;
  }

  public String getMtResidenceStsCd() {
    return mtResidenceStsCd;
  }

  public void setMtResidenceStsCd(String mtResidenceStsCd) {
    this.mtResidenceStsCd = mtResidenceStsCd;
  }

  public String getIsFamily() {
    return isFamily;
  }

  public void setIsFamily(String isFamily) {
    this.isFamily = isFamily;
  }

  public String getMtJobSectorCd() {
    return mtJobSectorCd;
  }

  public void setMtJobSectorCd(String mtJobSectorCd) {
    this.mtJobSectorCd = mtJobSectorCd;
  }

  public String getMtCityCd() {
    return mtCityCd;
  }

  public void setMtCityCd(String mtCityCd) {
    this.mtCityCd = mtCityCd;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public BigDecimal getCreditCardLines() {
    return creditCardLines;
  }

  public void setCreditCardLines(BigDecimal creditCardLines) {
    this.creditCardLines = creditCardLines;
  }

  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }

  public BigDecimal getLmtAppr() {
    return lmtAppr;
  }

  public void setLmtAppr(BigDecimal lmtAppr) {
    this.lmtAppr = lmtAppr;
  }

  public BigDecimal getTenureAppr() {
    return tenureAppr;
  }

  public void setTenureAppr(BigDecimal tenureAppr) {
    this.tenureAppr = tenureAppr;
  }

  public String getMtTimeCd() {
    return mtTimeCd;
  }

  public void setMtTimeCd(String mtTimeCd) {
    this.mtTimeCd = mtTimeCd;
  }

  public BigDecimal getIntRate() {
    return intRate;
  }

  public void setIntRate(BigDecimal intRate) {
    this.intRate = intRate;
  }
}

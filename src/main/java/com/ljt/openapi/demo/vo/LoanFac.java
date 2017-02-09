package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.List;



public class LoanFac {
  /**
   * 是否可循环
   */
  private java.lang.String isRevolvingAllowed;
  /**
   * 申请额度/批准额度
   */
  private java.math.BigDecimal lmtAppr;
  /**
   * 年化利率
   */
  private BigDecimal intRate;
  /**
   * 罚息利率
   */
  private java.math.BigDecimal intRateInSuspense;
  /**
   * 偿还方式
   */
  private String mtRepymtTypCd;
  /**
   * 业务期限
   */
  private String tenureAppr;
  /**
   * 到期日
   */
  private java.util.Date dtMaturity;
  /**
   * 业务类型
   */
  private java.lang.String mtFacCd;
  /**
   * 业务用途
   */
  private List<String> mtFacPurCds;
  private String mtTimeCd;

  public java.lang.String getIsRevolvingAllowed() {
    return isRevolvingAllowed;
  }

  public void setIsRevolvingAllowed(java.lang.String isRevolvingAllowed) {
    this.isRevolvingAllowed = isRevolvingAllowed;
  }

  public java.math.BigDecimal getLmtAppr() {
    return lmtAppr;
  }

  public void setLmtAppr(java.math.BigDecimal lmtAppr) {
    this.lmtAppr = lmtAppr;
  }

  public BigDecimal getIntRate() {
    return intRate;
  }

  public void setIntRate(BigDecimal intRate) {
    this.intRate = intRate;
  }

  public java.math.BigDecimal getIntRateInSuspense() {
    return intRateInSuspense;
  }

  public void setIntRateInSuspense(java.math.BigDecimal intRateInSuspense) {
    this.intRateInSuspense = intRateInSuspense;
  }

  public String getMtRepymtTypCd() {
    return mtRepymtTypCd;
  }

  public void setMtRepymtTypCd(String mtRepymtTypCd) {
    this.mtRepymtTypCd = mtRepymtTypCd;
  }

  public String getTenureAppr() {
    return tenureAppr;
  }

  public void setTenureAppr(String tenureAppr) {
    this.tenureAppr = tenureAppr;
  }

  public java.util.Date getDtMaturity() {
    return dtMaturity;
  }

  public void setDtMaturity(java.util.Date dtMaturity) {
    this.dtMaturity = dtMaturity;
  }

  public java.lang.String getMtFacCd() {
    return mtFacCd;
  }

  public void setMtFacCd(java.lang.String mtFacCd) {
    this.mtFacCd = mtFacCd;
  }

  public List<String> getMtFacPurCds() {
    return mtFacPurCds;
  }

  public void setMtFacPurCds(List<String> mtFacPurCds) {
    this.mtFacPurCds = mtFacPurCds;
  }

  public String getMtTimeCd() {
    return mtTimeCd;
  }

  public void setMtTimeCd(String mtTimeCd) {
    this.mtTimeCd = mtTimeCd;
  }

}

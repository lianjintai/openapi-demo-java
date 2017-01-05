package com.ljt.openapi.demo.vo;

import java.util.Date;

public class LoanEmplymt {

  /**
   * 工作期限年
   */
  private Integer prevServiceYr;
  /**
   * 工作期限月
   */
  private Integer prevServiceMth;
  /**
   * 职位
   */
  private String mtPosHeldCd;
  /**
   * 工作单位
   */
  private String employerNm;
  /**
   * 起始工作时间
   */
  private Date dtWorkInCurrIndustry;

  public Integer getPrevServiceYr() {
    return prevServiceYr;
  }

  public void setPrevServiceYr(Integer prevServiceYr) {
    this.prevServiceYr = prevServiceYr;
  }

  public Integer getPrevServiceMth() {
    return prevServiceMth;
  }

  public void setPrevServiceMth(Integer prevServiceMth) {
    this.prevServiceMth = prevServiceMth;
  }

  public String getMtPosHeldCd() {
    return mtPosHeldCd;
  }

  public void setMtPosHeldCd(String mtPosHeldCd) {
    this.mtPosHeldCd = mtPosHeldCd;
  }

  public String getEmployerNm() {
    return employerNm;
  }

  public void setEmployerNm(String employerNm) {
    this.employerNm = employerNm;
  }

  public Date getDtWorkInCurrIndustry() {
    return dtWorkInCurrIndustry;
  }

  public void setDtWorkInCurrIndustry(Date dtWorkInCurrIndustry) {
    this.dtWorkInCurrIndustry = dtWorkInCurrIndustry;
  }

}

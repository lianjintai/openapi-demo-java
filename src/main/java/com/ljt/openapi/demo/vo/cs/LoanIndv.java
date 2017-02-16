
package com.ljt.openapi.demo.vo.cs;

import java.math.BigDecimal;

public class LoanIndv {

  /**
   * 是否法人
   */
  private java.lang.String isLegalRep;

  /**
   * 经营地址
   */
  private java.lang.String bizAddr;

  /**
   * 营业执照/社会统一信用代码
   */
  private java.lang.String bizRegNo;
  /**
   * 流水总额
   */
  private java.math.BigDecimal currentTotal;
  /**
   * 近一年月平均纳税额(单位/元)
   */
  private BigDecimal ratal;
  /**
   * 近一年月平均社保缴存额(单位/元)
   */
  private BigDecimal socialSecurity;
  /**
   * 近一年月平均公积金缴存额(单位/元)
   */
  private BigDecimal equityLine;
  /**
   * 近一年月平均用水量(单位/吨)
   */
  private BigDecimal waterDosage;
  /**
   * 近一年月平均用电量(单位/度)
   */
  private BigDecimal electricityDosage;
  /**
   * 近一年月平均发放工资(单位/元)
   */
  private BigDecimal salaryTotal;
  /**
   * 员工数
   */
  private String employees;
  /**
   * 职业
   */
  private String mtJobSectorCd;
  /**
   * 经营范围
   */
  private String bizArea;

  public java.lang.String getIsLegalRep() {
    return isLegalRep;
  }

  public void setIsLegalRep(java.lang.String isLegalRep) {
    this.isLegalRep = isLegalRep;
  }

  public java.lang.String getBizAddr() {
    return bizAddr;
  }

  public void setBizAddr(java.lang.String bizAddr) {
    this.bizAddr = bizAddr;
  }

  public java.lang.String getBizRegNo() {
    return bizRegNo;
  }

  public void setBizRegNo(java.lang.String bizRegNo) {
    this.bizRegNo = bizRegNo;
  }

  public java.math.BigDecimal getCurrentTotal() {
    return currentTotal;
  }

  public void setCurrentTotal(java.math.BigDecimal currentTotal) {
    this.currentTotal = currentTotal;
  }

  public BigDecimal getRatal() {
    return ratal;
  }

  public void setRatal(BigDecimal ratal) {
    this.ratal = ratal;
  }

  public BigDecimal getSocialSecurity() {
    return socialSecurity;
  }

  public void setSocialSecurity(BigDecimal socialSecurity) {
    this.socialSecurity = socialSecurity;
  }

  public BigDecimal getEquityLine() {
    return equityLine;
  }

  public void setEquityLine(BigDecimal equityLine) {
    this.equityLine = equityLine;
  }

  public BigDecimal getWaterDosage() {
    return waterDosage;
  }

  public void setWaterDosage(BigDecimal waterDosage) {
    this.waterDosage = waterDosage;
  }

  public BigDecimal getElectricityDosage() {
    return electricityDosage;
  }

  public void setElectricityDosage(BigDecimal electricityDosage) {
    this.electricityDosage = electricityDosage;
  }

  public BigDecimal getSalaryTotal() {
    return salaryTotal;
  }

  public void setSalaryTotal(BigDecimal salaryTotal) {
    this.salaryTotal = salaryTotal;
  }

  public String getEmployees() {
    return employees;
  }

  public void setEmployees(String employees) {
    this.employees = employees;
  }

  public String getMtJobSectorCd() {
    return mtJobSectorCd;
  }

  public void setMtJobSectorCd(String mtJobSectorCd) {
    this.mtJobSectorCd = mtJobSectorCd;
  }

  public String getBizArea() {
    return bizArea;
  }

  public void setBizArea(String bizArea) {
    this.bizArea = bizArea;
  }
}

package com.ljt.openapi.demo.vo;


public class LoanCol {

  /**
   * 担保品所有者
   */
  private String collOwner;
  /**
   * 担保品价值
   */
  private String collValue;
  /**
   * 是否保证金
   */
  private String isDeposit;
  /**
   * 担保类型
   */
  private String mtCollTypCd;
  /**
   * 担保方式类型
   */
  private String mtCollStyleCd;
  /**
   * 担保品种类
   */
  private String mtCollCatCd;
  /**
   * 担保小类
   */
  private String mtCollCd;

  public String getCollOwner() {
    return collOwner;
  }

  public void setCollOwner(String collOwner) {
    this.collOwner = collOwner;
  }

  public String getCollValue() {
    return collValue;
  }

  public void setCollValue(String collValue) {
    this.collValue = collValue;
  }

  public String getIsDeposit() {
    return isDeposit;
  }

  public void setIsDeposit(String isDeposit) {
    this.isDeposit = isDeposit;
  }

  public String getMtCollTypCd() {
    return mtCollTypCd;
  }

  public void setMtCollTypCd(String mtCollTypCd) {
    this.mtCollTypCd = mtCollTypCd;
  }

  public String getMtCollStyleCd() {
    return mtCollStyleCd;
  }

  public void setMtCollStyleCd(String mtCollStyleCd) {
    this.mtCollStyleCd = mtCollStyleCd;
  }

  public String getMtCollCatCd() {
    return mtCollCatCd;
  }

  public void setMtCollCatCd(String mtCollCatCd) {
    this.mtCollCatCd = mtCollCatCd;
  }

  public String getMtCollCd() {
    return mtCollCd;
  }

  public void setMtCollCd(String mtCollCd) {
    this.mtCollCd = mtCollCd;
  }
}

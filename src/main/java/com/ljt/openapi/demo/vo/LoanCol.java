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
  private String mtCollTypeCd;

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

  public String getMtCollTypeCd() {
    return mtCollTypeCd;
  }

  public void setMtCollTypeCd(String mtCollTypeCd) {
    this.mtCollTypeCd = mtCollTypeCd;
  }


}

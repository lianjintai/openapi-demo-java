package com.ljt.openapi.demo.vo;

import java.util.Date;

public class PrLeaseInfoVO {

  // 是否租赁
  private String isLease;

  // 承租人名称
  private String lesseeNm;

  // 租赁开始日期
  private Date dtEffective;

  public String getIsLease() {
    return isLease;
  }

  public void setIsLease(String isLease) {
    this.isLease = isLease;
  }

  public String getLesseeNm() {
    return lesseeNm;
  }

  public void setLesseeNm(String lesseeNm) {
    this.lesseeNm = lesseeNm;
  }

  public Date getDtEffective() {
    return dtEffective;
  }

  public void setDtEffective(Date dtEffective) {
    this.dtEffective = dtEffective;
  }
}

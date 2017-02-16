package com.ljt.openapi.demo.vo;

import com.ljt.openapi.demo.vo.cs.LoanBase;
import com.ljt.openapi.demo.vo.cs.LoanEmplymt;
import com.ljt.openapi.demo.vo.cs.LoanIndv;

public class CsCust {
  /**
   * 基本信息
   */
  private LoanBase base;

  /**
   * 职位信息
   */
  private LoanEmplymt emplymt;
  /**
   * 经营信息
   */
  private LoanIndv business;
  
  
  public LoanBase getBase() {
    return base;
  }
  public void setBase(LoanBase base) {
    this.base = base;
  }
  public LoanEmplymt getEmplymt() {
    return emplymt;
  }
  public void setEmplymt(LoanEmplymt emplymt) {
    this.emplymt = emplymt;
  }
  public LoanIndv getBusiness() {
    return business;
  }
  public void setBusiness(LoanIndv business) {
    this.business = business;
  }
}

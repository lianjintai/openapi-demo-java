package com.ljt.openapi.demo.vo;

import com.ljt.openapi.demo.vo.cs.CsRelSpouseVO;
import com.ljt.openapi.demo.vo.cs.LoanEmplymt;
import com.ljt.openapi.demo.vo.cs.LoanIndv;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.vo.RelCsLoanParam.java
 * @Description : 借款方为个贷，关联关系为配偶
 * @Author : lcy
 * @Creation Date : 2017年5月23日 下午6:01:09
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月23日 create
 */
public class RelCsLoanParam {


  private CsRelSpouseVO relCsBase;
  
  /**
   * 职位信息
   */
  private LoanEmplymt relCsEmploy;
  /**
   * 经营信息
   */
  private LoanIndv relCsBusiness;
  
  
  public CsRelSpouseVO getRelCsBase() {
    return relCsBase;
  }
  public void setRelCsBase(CsRelSpouseVO relCsBase) {
    this.relCsBase = relCsBase;
  }
  public LoanEmplymt getRelCsEmploy() {
    return relCsEmploy;
  }
  public void setRelCsEmploy(LoanEmplymt relCsEmploy) {
    this.relCsEmploy = relCsEmploy;
  }
  public LoanIndv getRelCsBusiness() {
    return relCsBusiness;
  }
  public void setRelCsBusiness(LoanIndv relCsBusiness) {
    this.relCsBusiness = relCsBusiness;
  }
  
  
  

}

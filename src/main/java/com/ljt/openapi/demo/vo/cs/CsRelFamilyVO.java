package com.ljt.openapi.demo.vo.cs;

import java.math.BigDecimal;

import com.ljt.openapi.demo.vo.RelGeneralVO;

public class CsRelFamilyVO extends RelGeneralVO {
  /**
   * 收入来源
   */
  private String mtIncSourceCd;
  /**
   * 年平均收入
   */
  private BigDecimal yearIncAmt;

  public String getMtIncSourceCd() {
    return mtIncSourceCd;
  }

  public void setMtIncSourceCd(String mtIncSourceCd) {
    this.mtIncSourceCd = mtIncSourceCd;
  }

  public BigDecimal getYearIncAmt() {
    return yearIncAmt;
  }

  public void setYearIncAmt(BigDecimal yearIncAmt) {
    this.yearIncAmt = yearIncAmt;
  }
}

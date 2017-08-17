package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;

public class MvPenaltyInfoVO {

  // 未清除违章扣分
  public Integer unclearedPenaltyPoints;

  // 未缴纳罚款金额
  public BigDecimal unpaidPenalty;

  public Integer getUnclearedPenaltyPoints() {
    return unclearedPenaltyPoints;
  }

  public void setUnclearedPenaltyPoints(Integer unclearedPenaltyPoints) {
    this.unclearedPenaltyPoints = unclearedPenaltyPoints;
  }

  public BigDecimal getUnpaidPenalty() {
    return unpaidPenalty;
  }

  public void setUnpaidPenalty(BigDecimal unpaidPenalty) {
    this.unpaidPenalty = unpaidPenalty;
  }
}

package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;

public class MvPaymentInfoVO {

  // 缴费年份
  private Date paymentYear;

  // 当年应缴
  private BigDecimal curYearUnpaid;

  // 往年补缴
  private BigDecimal lastYearPaid;

  // 滞纳金
  private BigDecimal forfeit;

  // 合计
  private BigDecimal feeSum;

  public Date getPaymentYear() {
    return paymentYear;
  }

  public void setPaymentYear(Date paymentYear) {
    this.paymentYear = paymentYear;
  }

  public BigDecimal getCurYearUnpaid() {
    return curYearUnpaid;
  }

  public void setCurYearUnpaid(BigDecimal curYearUnpaid) {
    this.curYearUnpaid = curYearUnpaid;
  }

  public BigDecimal getLastYearPaid() {
    return lastYearPaid;
  }

  public void setLastYearPaid(BigDecimal lastYearPaid) {
    this.lastYearPaid = lastYearPaid;
  }

  public BigDecimal getForfeit() {
    return forfeit;
  }

  public void setForfeit(BigDecimal forfeit) {
    this.forfeit = forfeit;
  }

  public BigDecimal getFeeSum() {
    return feeSum;
  }

  public void setFeeSum(BigDecimal feeSum) {
    this.feeSum = feeSum;
  }


}

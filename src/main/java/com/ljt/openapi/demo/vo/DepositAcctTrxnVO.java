package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description 交易流水明细VO
 * @author xyzhao
 * @date 2018年10月21日下午9:07:10
 */
public class DepositAcctTrxnVO {

  /**
   * 描述:账号
   */
  private java.lang.String acctNo;

  /**
   * 描述:账户名称
   */
  private java.lang.String acctNm;

  /**
   * 描述:交易日期
   */
  private java.util.Date dtTrxn;
  private java.util.Date dtTrxnBegin;
  private java.util.Date dtTrxnEnd;

  /**
   * 描述:借方发生额
   */
  private java.math.BigDecimal debitAmount;

  /**
   * 描述:贷方发生额
   */
  private java.math.BigDecimal creditAmount;

  /**
   * 描述:余额
   */
  private java.math.BigDecimal balance;

  /**
   * 描述:币种
   */
  private java.lang.String mtCurCd;

  private java.lang.String mtCurCdDscp;

  /**
   * 描述:对方账号
   */
  private java.lang.String toAcctNo;

  /**
   * 描述:对方户名
   */
  private java.lang.String toAcctNm;

  /**
   * 描述:对方开户机构
   */
  private java.lang.String toBankNm;

  /**
   * 描述:记账日期
   */
  private java.util.Date dtAccounting;
  private java.util.Date dtAccountingBegin;
  private java.util.Date dtAccountingEnd;

  /**
   * 描述:摘要
   */
  private java.lang.String summary;

  /**
   * 描述:备注
   */
  private java.lang.String remark;

  private java.lang.String depositAcctId;

  /**
   * 描述:交易流水号
   */
  private java.lang.String serialNo;

  /**
   * 描述:未做交易的天数
   */
  private java.lang.Integer daysOfNoTrading;

  /**
   * 描述:createdBy
   */
  private java.lang.String createdBy;

  /**
   * 描述:dtCreated
   */
  private java.util.Date dtCreated;
  private java.util.Date dtCreatedBegin;
  private java.util.Date dtCreatedEnd;
  
  private String expandInfo;

  public java.lang.String getAcctNo() {
    return acctNo;
  }

  public void setAcctNo(java.lang.String acctNo) {
    this.acctNo = acctNo;
  }

  public java.lang.String getAcctNm() {
    return acctNm;
  }

  public void setAcctNm(java.lang.String acctNm) {
    this.acctNm = acctNm;
  }

  public java.util.Date getDtTrxn() {
    return dtTrxn;
  }

  public void setDtTrxn(java.util.Date dtTrxn) {
    this.dtTrxn = dtTrxn;
  }

  public java.util.Date getDtTrxnBegin() {
    return dtTrxnBegin;
  }

  public void setDtTrxnBegin(java.util.Date dtTrxnBegin) {
    this.dtTrxnBegin = dtTrxnBegin;
  }

  public java.util.Date getDtTrxnEnd() {
    return dtTrxnEnd;
  }

  public void setDtTrxnEnd(java.util.Date dtTrxnEnd) {
    this.dtTrxnEnd = dtTrxnEnd;
  }

  public java.math.BigDecimal getDebitAmount() {
    return debitAmount;
  }

  public void setDebitAmount(java.math.BigDecimal debitAmount) {
    this.debitAmount = debitAmount;
  }

  public java.math.BigDecimal getCreditAmount() {
    return creditAmount;
  }

  public void setCreditAmount(java.math.BigDecimal creditAmount) {
    this.creditAmount = creditAmount;
  }

  public java.math.BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(java.math.BigDecimal balance) {
    this.balance = balance;
  }

  public java.lang.String getMtCurCd() {
    return mtCurCd;
  }

  public void setMtCurCd(java.lang.String mtCurCd) {
    this.mtCurCd = mtCurCd;
  }

  public java.lang.String getMtCurCdDscp() {
    return mtCurCdDscp;
  }

  public void setMtCurCdDscp(java.lang.String mtCurCdDscp) {
    this.mtCurCdDscp = mtCurCdDscp;
  }

  public java.lang.String getToAcctNo() {
    return toAcctNo;
  }

  public void setToAcctNo(java.lang.String toAcctNo) {
    this.toAcctNo = toAcctNo;
  }

  public java.lang.String getToAcctNm() {
    return toAcctNm;
  }

  public void setToAcctNm(java.lang.String toAcctNm) {
    this.toAcctNm = toAcctNm;
  }

  public java.lang.String getToBankNm() {
    return toBankNm;
  }

  public void setToBankNm(java.lang.String toBankNm) {
    this.toBankNm = toBankNm;
  }

  public java.util.Date getDtAccounting() {
    return dtAccounting;
  }

  public void setDtAccounting(java.util.Date dtAccounting) {
    this.dtAccounting = dtAccounting;
  }

  public java.util.Date getDtAccountingBegin() {
    return dtAccountingBegin;
  }

  public void setDtAccountingBegin(java.util.Date dtAccountingBegin) {
    this.dtAccountingBegin = dtAccountingBegin;
  }

  public java.util.Date getDtAccountingEnd() {
    return dtAccountingEnd;
  }

  public void setDtAccountingEnd(java.util.Date dtAccountingEnd) {
    this.dtAccountingEnd = dtAccountingEnd;
  }

  public java.lang.String getSummary() {
    return summary;
  }

  public void setSummary(java.lang.String summary) {
    this.summary = summary;
  }

  public java.lang.String getRemark() {
    return remark;
  }

  public void setRemark(java.lang.String remark) {
    this.remark = remark;
  }

  public java.lang.String getDepositAcctId() {
    return depositAcctId;
  }

  public void setDepositAcctId(java.lang.String depositAcctId) {
    this.depositAcctId = depositAcctId;
  }

  public java.lang.String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(java.lang.String serialNo) {
    this.serialNo = serialNo;
  }

  public java.lang.Integer getDaysOfNoTrading() {
    return daysOfNoTrading;
  }

  public void setDaysOfNoTrading(java.lang.Integer daysOfNoTrading) {
    this.daysOfNoTrading = daysOfNoTrading;
  }

  public java.lang.String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
  }

  public java.util.Date getDtCreated() {
    return dtCreated;
  }

  public void setDtCreated(java.util.Date dtCreated) {
    this.dtCreated = dtCreated;
  }

  public java.util.Date getDtCreatedBegin() {
    return dtCreatedBegin;
  }

  public void setDtCreatedBegin(java.util.Date dtCreatedBegin) {
    this.dtCreatedBegin = dtCreatedBegin;
  }

  public java.util.Date getDtCreatedEnd() {
    return dtCreatedEnd;
  }

  public void setDtCreatedEnd(java.util.Date dtCreatedEnd) {
    this.dtCreatedEnd = dtCreatedEnd;
  }

  public String getExpandInfo() {
    return expandInfo;
  }

  public void setExpandInfo(String expandInfo) {
    this.expandInfo = expandInfo;
  }

  public DepositAcctTrxnVO(String acctNo, String acctNm, Date dtTrxn, Date dtTrxnBegin,
      Date dtTrxnEnd, BigDecimal debitAmount, BigDecimal creditAmount, BigDecimal balance,
      String mtCurCd, String mtCurCdDscp, String toAcctNo, String toAcctNm, String toBankNm,
      Date dtAccounting, Date dtAccountingBegin, Date dtAccountingEnd, String summary,
      String remark, String depositAcctId, String serialNo, Integer daysOfNoTrading,
      String createdBy, Date dtCreated, Date dtCreatedBegin, Date dtCreatedEnd) {
    super();
    this.acctNo = acctNo;
    this.acctNm = acctNm;
    this.dtTrxn = dtTrxn;
    this.dtTrxnBegin = dtTrxnBegin;
    this.dtTrxnEnd = dtTrxnEnd;
    this.debitAmount = debitAmount;
    this.creditAmount = creditAmount;
    this.balance = balance;
    this.mtCurCd = mtCurCd;
    this.mtCurCdDscp = mtCurCdDscp;
    this.toAcctNo = toAcctNo;
    this.toAcctNm = toAcctNm;
    this.toBankNm = toBankNm;
    this.dtAccounting = dtAccounting;
    this.dtAccountingBegin = dtAccountingBegin;
    this.dtAccountingEnd = dtAccountingEnd;
    this.summary = summary;
    this.remark = remark;
    this.depositAcctId = depositAcctId;
    this.serialNo = serialNo;
    this.daysOfNoTrading = daysOfNoTrading;
    this.createdBy = createdBy;
    this.dtCreated = dtCreated;
    this.dtCreatedBegin = dtCreatedBegin;
    this.dtCreatedEnd = dtCreatedEnd;
  }

  public DepositAcctTrxnVO() {
    super();
  }
}

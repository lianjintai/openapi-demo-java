package com.ljt.openapi.demo.vo.cs;

import java.math.BigDecimal;
import java.util.Date;

public class LoanBase {
  /**
   * 借款人在平台方的客户ID或编号
   */
  private String custId;

  /**
   * 姓名
   */
  private String nm;

  /**
   * 身份证
   */
  private String idNo;

  /**
   * 身份证签发日期
   */
  private Date dtIssue;
  /**
   * 身份证到期日
   */
  private Date dtExpiry;
  /**
   * 性别
   */
  private String mtGenderCd;
  /**
   * 婚姻情况
   */
  private String mtMaritalStsCd;

  /**
   * 所在城市
   */
  private String mtCityCd;
  /**
   * 最高学历
   */
  private String mtEduLvlCd;
  /**
   * 本地居住情况
   */
  private String mtResidenceStsCd;
  /**
   * 是否自有房产
   */
  private String isFamily;
  /**
   * 职业
   */
  private String mtJobSectorCd;
  /**
   * 近1年税后平均月收入(单位/元)
   */
  private BigDecimal monthlyIncAmt;
  /**
   * 电子邮箱
   */
  private String email;
  /**
   * 电话号
   */
  private String mobileNo;
  /**
   * 手机号使用情况
   */
  private String mtIndvMobileUsageStsCd;
  /**
   * qq
   */
  private Integer qq;
  /**
   * 微信
   */
  private String weChat;
  /**
   * 近一年银行卡流水总额
   */
  private BigDecimal bankCard;
  /**
   * 信用卡额度
   */
  private BigDecimal creditCardLines;
  /**
   * 贷款记录年限
   */
  private BigDecimal loanFixedYear;
  /**
   * 是否个体工商户
   */
  private String isBizEntity;
  private String portrait;

  public String getNm() {
    return nm;
  }

  public void setNm(String nm) {
    this.nm = nm;
  }

  public Date getDtIssue() {
    return dtIssue;
  }

  public void setDtIssue(Date dtIssue) {
    this.dtIssue = dtIssue;
  }

  public Date getDtExpiry() {
    return dtExpiry;
  }

  public void setDtExpiry(Date dtExpiry) {
    this.dtExpiry = dtExpiry;
  }

  public String getMtGenderCd() {
    return mtGenderCd;
  }

  public void setMtGenderCd(String mtGenderCd) {
    this.mtGenderCd = mtGenderCd;
  }

  public String getMtMaritalStsCd() {
    return mtMaritalStsCd;
  }

  public void setMtMaritalStsCd(String mtMaritalStsCd) {
    this.mtMaritalStsCd = mtMaritalStsCd;
  }

  public String getMtEduLvlCd() {
    return mtEduLvlCd;
  }

  public void setMtEduLvlCd(String mtEduLvlCd) {
    this.mtEduLvlCd = mtEduLvlCd;
  }

  public String getMtResidenceStsCd() {
    return mtResidenceStsCd;
  }

  public void setMtResidenceStsCd(String mtResidenceStsCd) {
    this.mtResidenceStsCd = mtResidenceStsCd;
  }

  public String getIsFamily() {
    return isFamily;
  }

  public void setIsFamily(String isFamily) {
    this.isFamily = isFamily;
  }

  public String getMtJobSectorCd() {
    return mtJobSectorCd;
  }

  public void setMtJobSectorCd(String mtJobSectorCd) {
    this.mtJobSectorCd = mtJobSectorCd;
  }

  public BigDecimal getMonthlyIncAmt() {
    return monthlyIncAmt;
  }

  public void setMonthlyIncAmt(BigDecimal monthlyIncAmt) {
    this.monthlyIncAmt = monthlyIncAmt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getMtIndvMobileUsageStsCd() {
    return mtIndvMobileUsageStsCd;
  }

  public void setMtIndvMobileUsageStsCd(String mtIndvMobileUsageStsCd) {
    this.mtIndvMobileUsageStsCd = mtIndvMobileUsageStsCd;
  }

  public Integer getQq() {
    return qq;
  }

  public void setQq(Integer qq) {
    this.qq = qq;
  }

  public String getWeChat() {
    return weChat;
  }

  public void setWeChat(String weChat) {
    this.weChat = weChat;
  }

  public BigDecimal getBankCard() {
    return bankCard;
  }

  public void setBankCard(BigDecimal bankCard) {
    this.bankCard = bankCard;
  }

  public BigDecimal getCreditCardLines() {
    return creditCardLines;
  }

  public void setCreditCardLines(BigDecimal creditCardLines) {
    this.creditCardLines = creditCardLines;
  }

  public BigDecimal getLoanFixedYear() {
    return loanFixedYear;
  }

  public void setLoanFixedYear(BigDecimal loanFixedYear) {
    this.loanFixedYear = loanFixedYear;
  }

  public String getIsBizEntity() {
    return isBizEntity;
  }

  public void setIsBizEntity(String isBizEntity) {
    this.isBizEntity = isBizEntity;
  }

  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public String getMtCityCd() {
    return mtCityCd;
  }

  public void setMtCityCd(String mtCityCd) {
    this.mtCityCd = mtCityCd;
  }

  public String getPortrait() {
    return portrait;
  }

  public void setPortrait(String portrait) {
    this.portrait = portrait;
  }



}

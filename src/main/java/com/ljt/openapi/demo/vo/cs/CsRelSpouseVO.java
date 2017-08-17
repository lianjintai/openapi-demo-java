package com.ljt.openapi.demo.vo.cs;

import java.math.BigDecimal;
import java.util.Date;

import com.ljt.openapi.demo.vo.RelGeneralVO;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.vo.cs.CsRelSpouseVO.java
 * @Description : 个贷关联人字段
 * @Author : lcy
 * @Creation Date : 2017年5月23日 上午11:35:19
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月23日 create
 */
public class CsRelSpouseVO extends RelGeneralVO {


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
   * 所在城市
   */
  private String mtCityCd;

  /**
   * 国籍
   */
  private String nationalityMtCtryCd;

  /**
   * 手机使用年限
   */
  private String mtIndvMobileUsageStsCd;

  /**
   * 电子邮箱
   */
  private String email;

  /**
   * qq
   */
  private Integer qq;
  /**
   * 微信
   */
  private String weChat;

  /**
   * 是否个体工商户
   */
  private String isBizEntity;

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
   * 近1年税后平均月收入(单位/元)
   */
  private BigDecimal monthlyIncAmt;

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

  public String getMtCityCd() {
    return mtCityCd;
  }

  public void setMtCityCd(String mtCityCd) {
    this.mtCityCd = mtCityCd;
  }

  public String getNationalityMtCtryCd() {
    return nationalityMtCtryCd;
  }

  public void setNationalityMtCtryCd(String nationalityMtCtryCd) {
    this.nationalityMtCtryCd = nationalityMtCtryCd;
  }

  public String getMtIndvMobileUsageStsCd() {
    return mtIndvMobileUsageStsCd;
  }

  public void setMtIndvMobileUsageStsCd(String mtIndvMobileUsageStsCd) {
    this.mtIndvMobileUsageStsCd = mtIndvMobileUsageStsCd;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  public String getIsBizEntity() {
    return isBizEntity;
  }

  public void setIsBizEntity(String isBizEntity) {
    this.isBizEntity = isBizEntity;
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

  public BigDecimal getMonthlyIncAmt() {
    return monthlyIncAmt;
  }

  public void setMonthlyIncAmt(BigDecimal monthlyIncAmt) {
    this.monthlyIncAmt = monthlyIncAmt;
  }
}

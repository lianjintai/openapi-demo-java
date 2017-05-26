package com.ljt.openapi.demo.vo.cp;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.vo.cp.CpReInfo.java
 * @Description : 借款方为企贷，关联关系为法定代表人、总经理、财务负责人、实际控制人，直接关联人、间接关联人、控股股东、股东
 * @Author : lcy
 * @Creation Date : 2017年5月23日 下午6:55:41
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月23日 create
 */
public class CpReInfo {

  /**
   * 是否实际控制人
   */
  private String isActualCtrl;

  /**
   * 是否参与日常管理
   */
  private String isInvolvedMgmt;

  /**
   * 管理职位
   */
  private String mtMtPosHeldCd;

  /**
   * 加入公司时间
   */
  private Date dtInCompSince;

  /**
   * 进入本行业时间
   */
  private Date dtInBizLineSince;

  /**
   * 工作经历
   */
  private String mgmtExperience;

  /**
   * 股东入股日期
   */
  private Date dtStockhldStructure;

  /**
   * 持股百分比（直接与间接）
   */
  private BigDecimal equity;

  /**
   * 股份价值（元）
   */
  private BigDecimal equityValue;


  /**
   * 持股数量
   */
  private BigDecimal noShares;

  /**
   * 最终表决权
   */
  private String isUltimateShhdl;

  /**
   * 股东简介
   */
  private String remark;

  public String getIsActualCtrl() {
    return isActualCtrl;
  }

  public void setIsActualCtrl(String isActualCtrl) {
    this.isActualCtrl = isActualCtrl;
  }

  public String getIsInvolvedMgmt() {
    return isInvolvedMgmt;
  }

  public void setIsInvolvedMgmt(String isInvolvedMgmt) {
    this.isInvolvedMgmt = isInvolvedMgmt;
  }

  public String getMtMtPosHeldCd() {
    return mtMtPosHeldCd;
  }

  public void setMtMtPosHeldCd(String mtMtPosHeldCd) {
    this.mtMtPosHeldCd = mtMtPosHeldCd;
  }

  public Date getDtInCompSince() {
    return dtInCompSince;
  }

  public void setDtInCompSince(Date dtInCompSince) {
    this.dtInCompSince = dtInCompSince;
  }

  public Date getDtInBizLineSince() {
    return dtInBizLineSince;
  }

  public void setDtInBizLineSince(Date dtInBizLineSince) {
    this.dtInBizLineSince = dtInBizLineSince;
  }

  public String getMgmtExperience() {
    return mgmtExperience;
  }

  public void setMgmtExperience(String mgmtExperience) {
    this.mgmtExperience = mgmtExperience;
  }

  public Date getDtStockhldStructure() {
    return dtStockhldStructure;
  }

  public void setDtStockhldStructure(Date dtStockhldStructure) {
    this.dtStockhldStructure = dtStockhldStructure;
  }

  public BigDecimal getEquity() {
    return equity;
  }

  public void setEquity(BigDecimal equity) {
    this.equity = equity;
  }

  public BigDecimal getEquityValue() {
    return equityValue;
  }

  public void setEquityValue(BigDecimal equityValue) {
    this.equityValue = equityValue;
  }

  public BigDecimal getNoShares() {
    return noShares;
  }

  public void setNoShares(BigDecimal noShares) {
    this.noShares = noShares;
  }

  public String getIsUltimateShhdl() {
    return isUltimateShhdl;
  }

  public void setIsUltimateShhdl(String isUltimateShhdl) {
    this.isUltimateShhdl = isUltimateShhdl;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }
}

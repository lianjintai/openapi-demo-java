package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MvInsuranceInfo {

  // 死亡伤残赔偿限额
  private BigDecimal deathPayLimit;

  // 无责任死亡伤残赔偿限额
  private BigDecimal noResponDeathPayLimit;

  // 医疗费用赔偿限额
  private BigDecimal medicalPayLimit;

  private BigDecimal noResponMedicalPayLimit;

  // 无责任财产损失赔偿限额
  private BigDecimal noResponPropertyLossPayLimit;

  // 财产损失赔偿限额
  private BigDecimal propertyLossPayLimit;

  // 保险费合计
  private BigDecimal insuranceSum;

  // 救助基金占比
  private BigDecimal rescueFundRate;

  // 救助基金
  private BigDecimal rescueFund;

  // 保险期间-起始日期
  private Date dtInsuranceStart;
  // 保险期间-结束日期
  private Date dtInsuranceEnd;

  // 保险合同争议解决方式
  private List<String> mtInsuranceResolutionCd;
  private List<String> mtInsuranceResolutionCdDscp;

  // 与道路交通安全违法行为和道路交通事故相联系的浮动比率

  private BigDecimal accidentIllegalRate;

  // 是否有车险理赔记录
  private String hasInsurancePayHis;

  // 客户车辆理赔总金额
  private BigDecimal insurancePaySum;

  // 发动机号
  private String engineNo;
  // 车架号
  private String frameNo;
  // 车牌号码
  private String plateNo;

  public String getEngineNo() {
    return engineNo;
  }

  public void setEngineNo(String engineNo) {
    this.engineNo = engineNo;
  }

  public String getFrameNo() {
    return frameNo;
  }

  public void setFrameNo(String frameNo) {
    this.frameNo = frameNo;
  }

  public String getPlateNo() {
    return plateNo;
  }

  public void setPlateNo(String plateNo) {
    this.plateNo = plateNo;
  }

  public BigDecimal getDeathPayLimit() {
    return deathPayLimit;
  }

  public void setDeathPayLimit(BigDecimal deathPayLimit) {
    this.deathPayLimit = deathPayLimit;
  }

  public BigDecimal getNoResponDeathPayLimit() {
    return noResponDeathPayLimit;
  }

  public void setNoResponDeathPayLimit(BigDecimal noResponDeathPayLimit) {
    this.noResponDeathPayLimit = noResponDeathPayLimit;
  }

  public BigDecimal getMedicalPayLimit() {
    return medicalPayLimit;
  }

  public void setMedicalPayLimit(BigDecimal medicalPayLimit) {
    this.medicalPayLimit = medicalPayLimit;
  }

  public BigDecimal getNoResponPropertyLossPayLimit() {
    return noResponPropertyLossPayLimit;
  }

  public void setNoResponPropertyLossPayLimit(BigDecimal noResponPropertyLossPayLimit) {
    this.noResponPropertyLossPayLimit = noResponPropertyLossPayLimit;
  }

  public BigDecimal getInsuranceSum() {
    return insuranceSum;
  }

  public void setInsuranceSum(BigDecimal insuranceSum) {
    this.insuranceSum = insuranceSum;
  }

  public BigDecimal getRescueFundRate() {
    return rescueFundRate;
  }

  public void setRescueFundRate(BigDecimal rescueFundRate) {
    this.rescueFundRate = rescueFundRate;
  }

  public BigDecimal getRescueFund() {
    return rescueFund;
  }

  public void setRescueFund(BigDecimal rescueFund) {
    this.rescueFund = rescueFund;
  }

  public Date getDtInsuranceStart() {
    return dtInsuranceStart;
  }

  public void setDtInsuranceStart(Date dtInsuranceStart) {
    this.dtInsuranceStart = dtInsuranceStart;
  }

  public Date getDtInsuranceEnd() {
    return dtInsuranceEnd;
  }

  public List<String> getMtInsuranceResolutionCd() {
    return mtInsuranceResolutionCd;
  }

  public void setMtInsuranceResolutionCd(List<String> mtInsuranceResolutionCd) {
    this.mtInsuranceResolutionCd = mtInsuranceResolutionCd;
  }

  public List<String> getMtInsuranceResolutionCdDscp() {
    return mtInsuranceResolutionCdDscp;
  }

  public void setMtInsuranceResolutionCdDscp(List<String> mtInsuranceResolutionCdDscp) {
    this.mtInsuranceResolutionCdDscp = mtInsuranceResolutionCdDscp;
  }

  public void setDtInsuranceEnd(Date dtInsuranceEnd) {
    this.dtInsuranceEnd = dtInsuranceEnd;
  }

  public BigDecimal getAccidentIllegalRate() {
    return accidentIllegalRate;
  }

  public void setAccidentIllegalRate(BigDecimal accidentIllegalRate) {
    this.accidentIllegalRate = accidentIllegalRate;
  }

  public String getHasInsurancePayHis() {
    return hasInsurancePayHis;
  }

  public void setHasInsurancePayHis(String hasInsurancePayHis) {
    this.hasInsurancePayHis = hasInsurancePayHis;
  }

  public BigDecimal getInsurancePaySum() {
    return insurancePaySum;
  }

  public void setInsurancePaySum(BigDecimal insurancePaySum) {
    this.insurancePaySum = insurancePaySum;
  }

  public BigDecimal getPropertyLossPayLimit() {
    return propertyLossPayLimit;
  }

  public void setPropertyLossPayLimit(BigDecimal propertyLossPayLimit) {
    this.propertyLossPayLimit = propertyLossPayLimit;
  }

  public BigDecimal getNoResponMedicalPayLimit() {
    return noResponMedicalPayLimit;
  }

  public void setNoResponMedicalPayLimit(BigDecimal noResponMedicalPayLimit) {
    this.noResponMedicalPayLimit = noResponMedicalPayLimit;
  }

}

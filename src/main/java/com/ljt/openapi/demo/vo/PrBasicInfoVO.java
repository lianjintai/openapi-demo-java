package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;

public class PrBasicInfoVO {

  // 建筑物名称
  private String buildingNm;

  // 房产证号
  private String propertyNo;

  // 房地产买卖合同编号
  private String contractNo;

  // 共有情况
  private String mtCollShareCd;
  private String mtCollShareCdDscp;

  // 房屋坐落
  private String addrLine;

  // 登记日期
  private Date dtRecord;

  // 规划用途
  private String mtPrtyUseCd;
  private String mtPrtyUseCdDscp;

  // 规划用途（其他）
  private String otherPrtyUseDscp;

  // 竣工日期
  private Date dtFinished;

  // 房龄
  private Integer age;



  // 是否有电梯
  private String hasElevator;


  // 房屋朝向
  private String mtPrtyFacingCd;
  private String mtPrtyFacingCdDscp;

  // 物业公司
  private String propertyCompany;

  // 月物业费
  private BigDecimal monthPropertyFee;

  public String getBuildingNm() {
    return buildingNm;
  }

  public void setBuildingNm(String buildingNm) {
    this.buildingNm = buildingNm;
  }

  public String getPropertyNo() {
    return propertyNo;
  }

  public void setPropertyNo(String propertyNo) {
    this.propertyNo = propertyNo;
  }

  public String getContractNo() {
    return contractNo;
  }

  public void setContractNo(String contractNo) {
    this.contractNo = contractNo;
  }

  public String getMtCollShareCd() {
    return mtCollShareCd;
  }

  public void setMtCollShareCd(String mtCollShareCd) {
    this.mtCollShareCd = mtCollShareCd;
  }

  public String getMtCollShareCdDscp() {
    return mtCollShareCdDscp;
  }

  public void setMtCollShareCdDscp(String mtCollShareCdDscp) {
    this.mtCollShareCdDscp = mtCollShareCdDscp;
  }

  public String getAddrLine() {
    return addrLine;
  }

  public void setAddrLine(String addrLine) {
    this.addrLine = addrLine;
  }

  public Date getDtRecord() {
    return dtRecord;
  }

  public void setDtRecord(Date dtRecord) {
    this.dtRecord = dtRecord;
  }

  public String getMtPrtyUseCd() {
    return mtPrtyUseCd;
  }

  public void setMtPrtyUseCd(String mtPrtyUseCd) {
    this.mtPrtyUseCd = mtPrtyUseCd;
  }

  public String getMtPrtyUseCdDscp() {
    return mtPrtyUseCdDscp;
  }

  public void setMtPrtyUseCdDscp(String mtPrtyUseCdDscp) {
    this.mtPrtyUseCdDscp = mtPrtyUseCdDscp;
  }

  public String getOtherPrtyUseDscp() {
    return otherPrtyUseDscp;
  }

  public void setOtherPrtyUseDscp(String otherPrtyUseDscp) {
    this.otherPrtyUseDscp = otherPrtyUseDscp;
  }

  public Date getDtFinished() {
    return dtFinished;
  }

  public void setDtFinished(Date dtFinished) {
    this.dtFinished = dtFinished;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getHasElevator() {
    return hasElevator;
  }

  public void setHasElevator(String hasElevator) {
    this.hasElevator = hasElevator;
  }

  public String getMtPrtyFacingCd() {
    return mtPrtyFacingCd;
  }

  public void setMtPrtyFacingCd(String mtPrtyFacingCd) {
    this.mtPrtyFacingCd = mtPrtyFacingCd;
  }

  public String getMtPrtyFacingCdDscp() {
    return mtPrtyFacingCdDscp;
  }

  public void setMtPrtyFacingCdDscp(String mtPrtyFacingCdDscp) {
    this.mtPrtyFacingCdDscp = mtPrtyFacingCdDscp;
  }

  public String getPropertyCompany() {
    return propertyCompany;
  }

  public void setPropertyCompany(String propertyCompany) {
    this.propertyCompany = propertyCompany;
  }

  public BigDecimal getMonthPropertyFee() {
    return monthPropertyFee;
  }

  public void setMonthPropertyFee(BigDecimal monthPropertyFee) {
    this.monthPropertyFee = monthPropertyFee;
  }


}

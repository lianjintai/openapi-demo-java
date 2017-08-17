package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class MvBasicInfoVO {

  // 首次登记日期
  private Date dtFirstRecord;

  // 车牌号码
  private String plateNo;

  // 机动车种类
  private String vehicleType;

  // 车辆品牌
  private String brand;

  // 车系
  private String series;

  // 车型
  private String model;

  // 外观颜色
  private String color;

  // 车架号
  private String frameNo;

  // 产地
  private String isMadeInChina;

  // 发送机号
  private String engineNo;

  // 燃料种类
  private List<String> mtFuelCd;
  private List<String> mtFuelCdDscp;

  // 排量
  private BigDecimal engineCapacity;

  // 功率
  private BigDecimal power;

  // 核定载质量
  private BigDecimal approvedMass;

  // 核定载客
  private int approvedPassenger;

  // 出厂日期
  private Date manufactured;

  // 网查价格区间-最大值
  private BigDecimal priceMax;

  // 网查价格区间-最小值
  private BigDecimal priceMin;

  // 行驶里程
  private BigDecimal drivenDistance;

  public Date getDtFirstRecord() {
    return dtFirstRecord;
  }

  public void setDtFirstRecord(Date dtFirstRecord) {
    this.dtFirstRecord = dtFirstRecord;
  }

  public String getPlateNo() {
    return plateNo;
  }

  public void setPlateNo(String plateNo) {
    this.plateNo = plateNo;
  }

  public String getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getFrameNo() {
    return frameNo;
  }

  public void setFrameNo(String frameNo) {
    this.frameNo = frameNo;
  }

  public String getIsMadeInChina() {
    return isMadeInChina;
  }

  public void setIsMadeInChina(String isMadeInChina) {
    this.isMadeInChina = isMadeInChina;
  }

  public String getEngineNo() {
    return engineNo;
  }

  public void setEngineNo(String engineNo) {
    this.engineNo = engineNo;
  }


  public List<String> getMtFuelCd() {
    return mtFuelCd;
  }

  public void setMtFuelCd(List<String> mtFuelCd) {
    this.mtFuelCd = mtFuelCd;
  }

  public List<String> getMtFuelCdDscp() {
    return mtFuelCdDscp;
  }

  public void setMtFuelCdDscp(List<String> mtFuelCdDscp) {
    this.mtFuelCdDscp = mtFuelCdDscp;
  }

  public BigDecimal getEngineCapacity() {
    return engineCapacity;
  }

  public void setEngineCapacity(BigDecimal engineCapacity) {
    this.engineCapacity = engineCapacity;
  }

  public BigDecimal getPower() {
    return power;
  }

  public void setPower(BigDecimal power) {
    this.power = power;
  }

  public BigDecimal getApprovedMass() {
    return approvedMass;
  }

  public void setApprovedMass(BigDecimal approvedMass) {
    this.approvedMass = approvedMass;
  }

  public int getApprovedPassenger() {
    return approvedPassenger;
  }

  public void setApprovedPassenger(int approvedPassenger) {
    this.approvedPassenger = approvedPassenger;
  }

  public Date getManufactured() {
    return manufactured;
  }

  public void setManufactured(Date manufactured) {
    this.manufactured = manufactured;
  }

  public BigDecimal getPriceMax() {
    return priceMax;
  }

  public void setPriceMax(BigDecimal priceMax) {
    this.priceMax = priceMax;
  }

  public BigDecimal getPriceMin() {
    return priceMin;
  }

  public void setPriceMin(BigDecimal priceMin) {
    this.priceMin = priceMin;
  }

  public BigDecimal getDrivenDistance() {
    return drivenDistance;
  }

  public void setDrivenDistance(BigDecimal drivenDistance) {
    this.drivenDistance = drivenDistance;
  }
}

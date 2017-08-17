package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;

public class PrRecordInfoVO {


  // 楼号或幢号
  private String buildingNo;

  // 房屋总层数
  private Integer totalFloorNum;

  // 所在层数
  private Integer floorNo;

  // 房号
  private String roomNo;

  // 结构
  private String structure;

  // 套数或间数
  private Integer roomNum;

  // 建筑面积
  private BigDecimal builtUpArea;

  // 套内建筑面积（含阳台）
  private BigDecimal housingCoveredArea;

  // 阳台建筑面积
  private BigDecimal housingBalconyArea;

  // 共有分摊建筑面积
  private BigDecimal housingShareArea;

  // 使用面积
  private BigDecimal housingUsefulArea;


  public String getBuildingNo() {
    return buildingNo;
  }

  public void setBuildingNo(String buildingNo) {
    this.buildingNo = buildingNo;
  }

  public void setRoomNo(String roomNo) {
    this.roomNo = roomNo;
  }

  public Integer getTotalFloorNum() {
    return totalFloorNum;
  }

  public void setTotalFloorNum(Integer totalFloorNum) {
    this.totalFloorNum = totalFloorNum;
  }

  public Integer getFloorNo() {
    return floorNo;
  }

  public void setFloorNo(Integer floorNo) {
    this.floorNo = floorNo;
  }

  public String getStructure() {
    return structure;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public Integer getRoomNum() {
    return roomNum;
  }

  public void setRoomNum(Integer roomNum) {
    this.roomNum = roomNum;
  }

  public BigDecimal getBuiltUpArea() {
    return builtUpArea;
  }

  public void setBuiltUpArea(BigDecimal builtUpArea) {
    this.builtUpArea = builtUpArea;
  }

  public BigDecimal getHousingCoveredArea() {
    return housingCoveredArea;
  }

  public void setHousingCoveredArea(BigDecimal housingCoveredArea) {
    this.housingCoveredArea = housingCoveredArea;
  }

  public BigDecimal getHousingBalconyArea() {
    return housingBalconyArea;
  }

  public void setHousingBalconyArea(BigDecimal housingBalconyArea) {
    this.housingBalconyArea = housingBalconyArea;
  }

  public BigDecimal getHousingShareArea() {
    return housingShareArea;
  }

  public void setHousingShareArea(BigDecimal housingShareArea) {
    this.housingShareArea = housingShareArea;
  }

  public BigDecimal getHousingUsefulArea() {
    return housingUsefulArea;
  }

  public void setHousingUsefulArea(BigDecimal housingUsefulArea) {
    this.housingUsefulArea = housingUsefulArea;
  }

  public String getRoomNo() {
    return roomNo;
  }


}

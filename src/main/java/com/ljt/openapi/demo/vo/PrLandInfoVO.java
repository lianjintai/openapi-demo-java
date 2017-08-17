package com.ljt.openapi.demo.vo;

import java.util.Date;

public class PrLandInfoVO {

  // 地号
  private String landNo;

  // 土地使用权取得方式
  private String mtLandAcquireMtdCd;
  private String mtLandAcquireMtdCdDscp;


  // 土地使用权取得方式（其他）
  private String otherLandAcquireMtdDscp;

  // 土地使用起始时间
  private Date dtLandStarted;

  // 土地使用结束时间
  private Date dtLandEnd;

  // 土地使用年限
  private Integer landUseLife;

  public String getLandNo() {
    return landNo;
  }

  public void setLandNo(String landNo) {
    this.landNo = landNo;
  }

  public String getMtLandAcquireMtdCd() {
    return mtLandAcquireMtdCd;
  }

  public void setMtLandAcquireMtdCd(String mtLandAcquireMtdCd) {
    this.mtLandAcquireMtdCd = mtLandAcquireMtdCd;
  }

  public String getMtLandAcquireMtdCdDscp() {
    return mtLandAcquireMtdCdDscp;
  }

  public void setMtLandAcquireMtdCdDscp(String mtLandAcquireMtdCdDscp) {
    this.mtLandAcquireMtdCdDscp = mtLandAcquireMtdCdDscp;
  }



  public String getOtherLandAcquireMtdDscp() {
    return otherLandAcquireMtdDscp;
  }

  public void setOtherLandAcquireMtdDscp(String otherLandAcquireMtdDscp) {
    this.otherLandAcquireMtdDscp = otherLandAcquireMtdDscp;
  }

  public Date getDtLandStarted() {
    return dtLandStarted;
  }

  public void setDtLandStarted(Date dtLandStarted) {
    this.dtLandStarted = dtLandStarted;
  }

  public Integer getLandUseLife() {
    return landUseLife;
  }

  public void setLandUseLife(Integer landUseLife) {
    this.landUseLife = landUseLife;
  }

  public Date getDtLandEnd() {
    return dtLandEnd;
  }

  public void setDtLandEnd(Date dtLandEnd) {
    this.dtLandEnd = dtLandEnd;
  }



}

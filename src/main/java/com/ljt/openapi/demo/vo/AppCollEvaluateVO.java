package com.ljt.openapi.demo.vo;

public class AppCollEvaluateVO {

  /**
   * 描述:担保品评估唯一标识
   */
  private java.lang.String id;

  /**
   * 描述:租户id
   */
  private java.lang.String mtTenantId;

  /**
   * 描述:经办机构代码
   */
  private java.lang.String mtOrgCd;

  /**
   * 描述:申请id
   */
  private java.lang.String appId;

  /**
   * 描述:主担保唯一标识
   */
  private java.lang.String collId;

  /**
   * 描述:评估师核定价格
   */
  private java.math.BigDecimal evaluateValue;

  /**
   * 描述:评估时间
   */
  private java.util.Date dtEvaluated;
  private java.util.Date dtEvaluatedBegin;
  private java.util.Date dtEvaluatedEnd;

  /**
   * 描述:评估师
   */
  private java.lang.String appraiser;

  /**
   * 描述:创建人
   */
  private java.lang.String createdBy;

  /**
   * 描述:修改人
   */
  private java.lang.String updatedBy;

  /**
   * 描述:创建时间
   */
  private java.util.Date dtCreated;
  private java.util.Date dtCreatedBegin;
  private java.util.Date dtCreatedEnd;

  /**
   * 描述:修改时间
   */
  private java.util.Date dtUpdated;
  private java.util.Date dtUpdatedBegin;
  private java.util.Date dtUpdatedEnd;

  /**
   * 描述:版本
   */
  private Integer version;

  public AppCollEvaluateVO() {}

  public AppCollEvaluateVO(java.lang.String id) {
    this.id = id;
  }

  public void setId(java.lang.String id) {
    this.id = id;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public void setMtTenantId(java.lang.String mtTenantId) {
    this.mtTenantId = mtTenantId;
  }

  public java.lang.String getMtTenantId() {
    return this.mtTenantId;
  }

  public void setMtOrgCd(java.lang.String mtOrgCd) {
    this.mtOrgCd = mtOrgCd;
  }

  public java.lang.String getMtOrgCd() {
    return this.mtOrgCd;
  }

  public void setAppId(java.lang.String appId) {
    this.appId = appId;
  }

  public java.lang.String getAppId() {
    return this.appId;
  }

  public void setCollId(java.lang.String collId) {
    this.collId = collId;
  }

  public java.lang.String getCollId() {
    return this.collId;
  }

  public void setEvaluateValue(java.math.BigDecimal evaluateValue) {
    this.evaluateValue = evaluateValue;
  }

  public java.math.BigDecimal getEvaluateValue() {
    return this.evaluateValue;
  }

  public void setDtEvaluated(java.util.Date dtEvaluated) {
    this.dtEvaluated = dtEvaluated;
  }

  public java.util.Date getDtEvaluated() {
    return this.dtEvaluated;
  }

  public void setDtEvaluatedBegin(java.util.Date dtEvaluatedBegin) {
    this.dtEvaluatedBegin = dtEvaluatedBegin;
  }

  public java.util.Date getDtEvaluatedBegin() {
    return this.dtEvaluatedBegin;
  }

  public void setDtEvaluatedEnd(java.util.Date dtEvaluatedEnd) {
    this.dtEvaluatedEnd = dtEvaluatedEnd;
  }

  public java.util.Date getDtEvaluatedEnd() {
    return this.dtEvaluatedEnd;
  }

  public void setAppraiser(java.lang.String appraiser) {
    this.appraiser = appraiser;
  }

  public java.lang.String getAppraiser() {
    return this.appraiser;
  }

  public void setCreatedBy(java.lang.String createdBy) {
    this.createdBy = createdBy;
  }

  public java.lang.String getCreatedBy() {
    return this.createdBy;
  }

  public void setUpdatedBy(java.lang.String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public java.lang.String getUpdatedBy() {
    return this.updatedBy;
  }

  public void setDtCreated(java.util.Date dtCreated) {
    this.dtCreated = dtCreated;
  }

  public java.util.Date getDtCreated() {
    return this.dtCreated;
  }

  public void setDtCreatedBegin(java.util.Date dtCreatedBegin) {
    this.dtCreatedBegin = dtCreatedBegin;
  }

  public java.util.Date getDtCreatedBegin() {
    return this.dtCreatedBegin;
  }

  public void setDtCreatedEnd(java.util.Date dtCreatedEnd) {
    this.dtCreatedEnd = dtCreatedEnd;
  }

  public java.util.Date getDtCreatedEnd() {
    return this.dtCreatedEnd;
  }

  public void setDtUpdated(java.util.Date dtUpdated) {
    this.dtUpdated = dtUpdated;
  }

  public java.util.Date getDtUpdated() {
    return this.dtUpdated;
  }

  public void setDtUpdatedBegin(java.util.Date dtUpdatedBegin) {
    this.dtUpdatedBegin = dtUpdatedBegin;
  }

  public java.util.Date getDtUpdatedBegin() {
    return this.dtUpdatedBegin;
  }

  public void setDtUpdatedEnd(java.util.Date dtUpdatedEnd) {
    this.dtUpdatedEnd = dtUpdatedEnd;
  }

  public java.util.Date getDtUpdatedEnd() {
    return this.dtUpdatedEnd;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Integer getVersion() {
    return this.version;
  }

}

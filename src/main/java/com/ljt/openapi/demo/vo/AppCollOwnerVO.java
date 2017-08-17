package com.ljt.openapi.demo.vo;

public class AppCollOwnerVO {


  /**
   * 描述:主担保所有者唯一标识
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
   * 描述:客户信息唯一标识
   */
  private java.lang.String cifId;
  /**
   * 描述:证件号码
   */
  private java.lang.String idNo;
  /**
   * 描述:所有者名称
   */
  private java.lang.String nm;
  /**
   * 所有者身份
   */
  private String iden;
  /**
   * 证件编码
   */
  private String mtCifIdTypCd;
  /**
   * 客户类型
   */
  private String mtCifTypCd;
  private String mtCifTypCdDscp;
  /**
   * 旧的证件编码
   */
  private String mtCifIdTypCdOld;
  /**
   * 证件类型
   */
  private String mtCifIdTypCdDscp;
  /**
   * 联系方式
   */
  private String mobileNo;
  /**
   * 是否多证合一
   */
  private String isComb;
  /**
   * 个贷企贷标识（CS:个贷，CP:企贷）
   */
  private String loanType;
  /**
   * 描述:createdBy
   */
  private java.lang.String createdBy;
  /**
   * 是否新增所有者（Y:是，N:否）
   */
  private String isAddOwner;
  /**
   * 描述:updatedBy
   */
  private java.lang.String updatedBy;
  /**
   * 是否勾选
   */
  private String isChecked;
  /**
   * 描述:dtCreated
   */
  private java.util.Date dtCreated;
  private java.util.Date dtCreatedBegin;
  private java.util.Date dtCreatedEnd;

  /**
   * 描述:dtUpdated
   */
  private java.util.Date dtUpdated;
  private java.util.Date dtUpdatedBegin;
  private java.util.Date dtUpdatedEnd;

  /**
   * 描述:version
   */
  private Integer version;

  public AppCollOwnerVO() {}

  public AppCollOwnerVO(java.lang.String id) {
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



  public void setCifId(java.lang.String cifId) {
    this.cifId = cifId;
  }

  public java.lang.String getCifId() {
    return this.cifId;
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

  public java.lang.String getIdNo() {
    return idNo;
  }

  public void setIdNo(java.lang.String idNo) {
    this.idNo = idNo;
  }

  public java.lang.String getNm() {
    return nm;
  }

  public void setNm(java.lang.String nm) {
    this.nm = nm;
  }

  public String getIden() {
    return iden;
  }

  public void setIden(String iden) {
    this.iden = iden;
  }

  public String getMtCifIdTypCd() {
    return mtCifIdTypCd;
  }

  public void setMtCifIdTypCd(String mtCifIdTypCd) {
    this.mtCifIdTypCd = mtCifIdTypCd;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public String getIsComb() {
    return isComb;
  }

  public void setIsComb(String isComb) {
    this.isComb = isComb;
  }

  public String getMtCifIdTypCdDscp() {
    return mtCifIdTypCdDscp;
  }

  public void setMtCifIdTypCdDscp(String mtCifIdTypCdDscp) {
    this.mtCifIdTypCdDscp = mtCifIdTypCdDscp;
  }

  public String getLoanType() {
    return loanType;
  }

  public void setLoanType(String loanType) {
    this.loanType = loanType;
  }

  public String getIsAddOwner() {
    return isAddOwner;
  }

  public void setIsAddOwner(String isAddOwner) {
    this.isAddOwner = isAddOwner;
  }

  public String getMtCifIdTypCdOld() {
    return mtCifIdTypCdOld;
  }

  public void setMtCifIdTypCdOld(String mtCifIdTypCdOld) {
    this.mtCifIdTypCdOld = mtCifIdTypCdOld;
  }

  public String getMtCifTypCd() {
    return mtCifTypCd;
  }

  public void setMtCifTypCd(String mtCifTypCd) {
    this.mtCifTypCd = mtCifTypCd;
  }

  public String getIsChecked() {
    return isChecked;
  }

  public void setIsChecked(String isChecked) {
    this.isChecked = isChecked;
  }

  public String getMtCifTypCdDscp() {
    return mtCifTypCdDscp;
  }

  public void setMtCifTypCdDscp(String mtCifTypCdDscp) {
    this.mtCifTypCdDscp = mtCifTypCdDscp;
  }

}


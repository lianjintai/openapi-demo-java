package com.ljt.openapi.demo.vo;

public class DocVO {

  /**
   * isNecessary:是否必须上传(Y:必须,N:非必须)
   */
  private String isNecessary;

  /**
   * mtDocCd:申请材料小类
   */
  private String mtDocCd;
  
  /**
   * mtDocTypeCd:申请材料大类
   */
  private String mtDocTypeCd;

  /**
   * refId:关联资源ID
   */
  private String refId;

  /**
   * refName:关联资源名称
   */
  private String refName;

  public String getIsNecessary() {
    return isNecessary;
  }

  public void setIsNecessary(String isNecessary) {
    this.isNecessary = isNecessary;
  }

  public String getMtDocCd() {
    return mtDocCd;
  }

  public void setMtDocCd(String mtDocCd) {
    this.mtDocCd = mtDocCd;
  }

  public String getMtDocTypeCd() {
    return mtDocTypeCd;
  }

  public void setMtDocTypeCd(String mtDocTypeCd) {
    this.mtDocTypeCd = mtDocTypeCd;
  }

  public String getRefId() {
    return refId;
  }

  public void setRefId(String refId) {
    this.refId = refId;
  }

  public String getRefName() {
    return refName;
  }

  public void setRefName(String refName) {
    this.refName = refName;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("DocVO [isNecessary=").append(isNecessary).append(", mtDocCd=").append(mtDocCd)
        .append(", mtDocTypeCd=").append(mtDocTypeCd).append(", refId=").append(refId)
        .append(", refName=").append(refName).append("]");
    return builder.toString();
  }
  
}

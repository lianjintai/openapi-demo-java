package com.ljt.openapi.demo.vo;

import java.util.Date;

/**
 * @Project : dcms-facade-base
 * @Program Name : com.ljt.dcms.facade.base.vo.FaCifFinParaVO.java
 * @Description : 财报上传参数信息
 * @Author : chichangchao
 * @Creation Date : 2016年9月19日 上午10:18:44
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      chichangchao 2016年9月19日 create
 */
public class FaCifFinParaVO {

  /**
   * 描述:文件上传信息ID
   */
  private String faFileId;

  /**
   * 描述:上传文件名称(包含扩展名)
   */
  private String fileName;

  /**
   * 描述:财务报表状态代码
   */
  private String mtFinStsCd;

  /**
   * 描述:财务报表截止日期
   */
  private Date dtFin;

  /**
   * 描述:财务报表类型代码
   */
  private String mtFinRptTypCd;

  /**
   * 描述:财务报表范围代码
   */
  private String mtFinRptCatCd;

  /**
   * 描述:主客户财务报表信息唯一标识（正式表）
   */
  private java.lang.String cifFinId;
  
  /**
   * appId:推贷申请ID
   */
  private String appId;

  /**
   * base64OfFile:上传文件的Base64编码(URLEncoder转码后)
   */
  private String base64OfFile;
  
  public String getFaFileId() {
    return faFileId;
  }

  public void setFaFileId(String faFileId) {
    this.faFileId = faFileId;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getMtFinStsCd() {
    return mtFinStsCd;
  }

  public void setMtFinStsCd(String mtFinStsCd) {
    this.mtFinStsCd = mtFinStsCd;
  }

  public Date getDtFin() {
    return dtFin;
  }

  public void setDtFin(Date dtFin) {
    this.dtFin = dtFin;
  }

  public String getMtFinRptTypCd() {
    return mtFinRptTypCd;
  }

  public void setMtFinRptTypCd(String mtFinRptTypCd) {
    this.mtFinRptTypCd = mtFinRptTypCd;
  }

  public String getMtFinRptCatCd() {
    return mtFinRptCatCd;
  }

  public void setMtFinRptCatCd(String mtFinRptCatCd) {
    this.mtFinRptCatCd = mtFinRptCatCd;
  }

  public java.lang.String getCifFinId() {
    return cifFinId;
  }

  public void setCifFinId(java.lang.String cifFinId) {
    this.cifFinId = cifFinId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getBase64OfFile() {
    return base64OfFile;
  }

  public void setBase64OfFile(String base64OfFile) {
    this.base64OfFile = base64OfFile;
  }
}

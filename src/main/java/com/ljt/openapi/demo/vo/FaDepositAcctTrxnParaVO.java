package com.ljt.openapi.demo.vo;

import java.util.List;

/**
 * @Project : dcms-facade-base
 * @Program Name : com.ljt.dcms.facade.base.vo.FaDepositAcctTrxnParaVO.java
 * @Description : 交易流水上传参数信息
 * @Author : chichangchao
 * @Creation Date : 2017年6月20日 下午5:28:25
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      chichangchao 2017年6月20日 create
 */
public class FaDepositAcctTrxnParaVO {

  /**
   * 描述:文件上传信息ID
   */
  private String faFileId;

  /**
   * 描述:上传文件名称(包含扩展名)
   */
  private String fileName;

  /**
   * 描述:上传文件真实名称(包含扩展名)
   */
  private String realFileName;

  /**
   * mtFinInsttnCd:所属银行代码
   */
  private String mtFinInsttnCd;

  /**
   * appId:推贷申请ID
   */
  private String appId;

  /**
   * batchId:批次ID
   */
  private String batchId;

  /**
   * cifId:客户ID
   */
  private String cifId;

  /**
   * cdtFileId:信贷文件ID
   */
  private String cdtFileId;

  /**
   * 交易流水明细 
   */
  private List<DepositAcctTrxnVO> items;

  public FaDepositAcctTrxnParaVO() {
    super();
  }

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

  public String getRealFileName() {
    return realFileName;
  }

  public void setRealFileName(String realFileName) {
    this.realFileName = realFileName;
  }

  public String getMtFinInsttnCd() {
    return mtFinInsttnCd;
  }

  public void setMtFinInsttnCd(String mtFinInsttnCd) {
    this.mtFinInsttnCd = mtFinInsttnCd;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public String getBatchId() {
    return batchId;
  }

  public void setBatchId(String batchId) {
    this.batchId = batchId;
  }

  public String getCifId() {
    return cifId;
  }

  public void setCifId(String cifId) {
    this.cifId = cifId;
  }

  public String getCdtFileId() {
    return cdtFileId;
  }

  public void setCdtFileId(String cdtFileId) {
    this.cdtFileId = cdtFileId;
  }

  public List<DepositAcctTrxnVO> getItems() {
    return items;
  }

  public void setItems(List<DepositAcctTrxnVO> items) {
    this.items = items;
  }
}

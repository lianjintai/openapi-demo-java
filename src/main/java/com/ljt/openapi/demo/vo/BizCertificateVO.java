package com.ljt.openapi.demo.vo;

import java.util.Date;


/**
 * 
 * @Project : dcms-cif-base
 * @Program Name : com.ljt.dcms.cif.base.vo.Loan.BizCertificateVO.java
 * @Description : TODO 类描述:经营许可证信息，该对象以json 字符串格式存入cif表的LOAN_REMARK
 * @Author : qiaoxf
 * @Creation Date : 2017年5月11日 上午11:38:18
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      qiaoxf 2017年5月11日 create
 */
public class BizCertificateVO {

  /**
   * 经营许可证到期日 to json
   */
  private Date dtExpiry;
  /**
   * 经营许可证编号 to json
   */
  private String no;
  /**
   * 经营许可证类型 to json
   */
  private String mtBizCertificateTypCd;

  @Override
  public String toString() {
    return "BizCertificateVO [dtExpiry=" + dtExpiry + ", no=" + no + ", mtBizCertificateTypCd="
        + mtBizCertificateTypCd + "]";
  }

  public Date getDtExpiry() {
    return dtExpiry;
  }

  public void setDtExpiry(Date dtExpiry) {
    this.dtExpiry = dtExpiry;
  }

  public String getNo() {
    return no;
  }

  public void setNo(String no) {
    this.no = no;
  }

  public String getMtBizCertificateTypCd() {
    return mtBizCertificateTypCd;
  }

  public void setMtBizCertificateTypCd(String mtBizCertificateTypCd) {
    this.mtBizCertificateTypCd = mtBizCertificateTypCd;
  }

}

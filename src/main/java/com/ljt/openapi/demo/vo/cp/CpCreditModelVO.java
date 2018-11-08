package com.ljt.openapi.demo.vo.cp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <class说明>：获取企业定性评分模型
 * Created by jdd on 2018/10/29.
 *
 * @author jdd
 * @version 1.0.0
 * @date 2018/10/29 4:59 PM
 */
public class CpCreditModelVO implements Serializable {

    private static final long serialVersionUID = -2626049454695261977L;

    /**
     * 行业小类
     */
    private String mtIndDetailCd;

    /**
     * 注册时间
     */
    private Date dtRegistered;

    /**
     * 从业人数(单位：人)
     */
    private Integer employeeCnt;

    /**
     * 营业收入(单位：万元)
     */
    private BigDecimal saleAmt;

    /**
     * 资产总额(单位：万元)
     */
    private BigDecimal assetAmt;

    public String getMtIndDetailCd() {
        return mtIndDetailCd;
    }

    public void setMtIndDetailCd(String mtIndDetailCd) {
        this.mtIndDetailCd = mtIndDetailCd;
    }

    public Date getDtRegistered() {
        return dtRegistered;
    }

    public void setDtRegistered(Date dtRegistered) {
        this.dtRegistered = dtRegistered;
    }

    public Integer getEmployeeCnt() {
        return employeeCnt;
    }

    public void setEmployeeCnt(Integer employeeCnt) {
        this.employeeCnt = employeeCnt;
    }

    public BigDecimal getSaleAmt() {
        return saleAmt;
    }

    public void setSaleAmt(BigDecimal saleAmt) {
        this.saleAmt = saleAmt;
    }

    public BigDecimal getAssetAmt() {
        return assetAmt;
    }

    public void setAssetAmt(BigDecimal assetAmt) {
        this.assetAmt = assetAmt;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CpCreditModelVO{");
        sb.append("mtIndDetailCd='").append(mtIndDetailCd).append('\'');
        sb.append(", dtRegistered=").append(dtRegistered);
        sb.append(", employeeCnt=").append(employeeCnt);
        sb.append(", saleAmt=").append(saleAmt);
        sb.append(", assetAmt=").append(assetAmt);
        sb.append('}');
        return sb.toString();
    }
}

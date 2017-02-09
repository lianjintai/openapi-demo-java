package com.ljt.openapi.demo.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class LoanParams {
  /**
   * 借款人在平台方的客户ID或编号
   */
  private String custId;
  /**
   * 营业执照号码
   */
  private String bizRegNo;
  /**
   * 中征码／贷款卡
   */
  private String idNo;
  /**
   * 是否三证合一
   */
  private String isComb;
  /**
   * 核心产品及品牌
   */
  private String brandNm;
  /**
   * 主营业务
   */
  private String coreBiz;
  /**
   * 是否自贸易区
   */
  private String isFreeTradeArea;
  /**
   * 资本金来源
   */
  private String mtCifCatCd;
  /**
   * 所在城市
   */
  private String mtCityCd;
  /**
   * 公司类型
   */
  private String mtCorpSalutationCd;
  /**
   * 行业类型
   */
  private String mtIndDetailCd;
  /**
   * 网址
   */
  private String website;
  /**
   * 注册日期
   */
  private Date dtRegistered;
  /**
   * 地税登记号
   */
  private String incomeTaxNo;
  /**
   * 国税登记号
   */
  private String nationalTaxNo;
  /**
   * 注册地址
   */
  private String registeredAddr;
  /**
   * 经营地址
   */
  private String bizAddr;
  /**
   * 开始营业日期
   */
  private Date dtStart;
  /**
   * 营业网点数量
   */
  private Integer noOfBizSite;
  /**
   * 从业人数
   */
  private BigDecimal employeeCnt;
  /**
   * 是否上市
   */
  private String mtListedCd;
  /**
   * 实收资本
   */
  private BigDecimal paidUpCapital;
  /**
   * 注册资本
   */
  private BigDecimal authCapital;
  /**
   * 经营场地面积
   */
  private Integer bizLandArea;
  /**
   * 经营场地所有权
   */
  private String mtBizLandOwnerCd;
  /**
   * 近一年销售额
   */
  private BigDecimal saleAmt;
  /**
   * 资产价值
   */
  private BigDecimal assetAmt;
  /**
   * 近一年月平均纳税额(单位/元)
   */
  private BigDecimal ratal;
  /**
   * 近一年月平均社保缴存额(单位/元)
   */
  private BigDecimal socialSecurity;
  /**
   * 近一年月平均公积金缴存额(单位/元)
   */
  private BigDecimal equityLine;
  /**
   * 近一年月平均用水量(单位/吨)
   */
  private BigDecimal waterDosage;
  /**
   * 近一年月平均用电量(单位/度)
   */
  private BigDecimal electricityDosage;
  /**
   * 近一年月平均发放工资(单位/元)
   */
  private BigDecimal salaryTotal;
  /**
   * 工资发放方式
   */
  private String mtSalaryTypCd;
  /**
   * 经营电话/负责人电话
   */
  private String principalNo;
  /**
   * 基本开户行
   */
  private String mtFinInsttnCd;
  /**
   * 姓名
   */
  private String nm;
  /**
   * 身份证签发日期
   */
  private Date dtIssue;
  /**
   * 身份证到期日
   */
  private Date dtExpiry;
  /**
   * 性别
   */
  private String mtGenderCd;
  /**
   * 婚姻情况
   */
  private String mtMaritalStsCd;
  /**
   * 最高学历
   */
  private String mtEduLvlCd;
  /**
   * 本地居住情况
   */
  private String mtResidenceStsCd;
  /**
   * 是否自有房产
   */
  private String isFamily;
  /**
   * 职业
   */
  private String mtJobSectorCd;
  /**
   * 近1年税后平均月收入(单位/元)
   */
  private BigDecimal monthlyIncAmt;
  /**
   * 电子邮箱
   */
  private String email;
  /**
   * 电话号
   */
  private String mobileNo;
  /**
   * 手机号使用情况
   */
  private String mtIndvMobileUsageStsCd;
  /**
   * qq
   */
  private Integer qq;
  /**
   * 微信
   */
  private String weChat;
  /**
   * 近一年银行卡流水总额
   */
  private BigDecimal bankCard;
  /**
   * 信用卡额度
   */
  private BigDecimal creditCardLines;
  /**
   * 贷款记录年限
   */
  private BigDecimal loanFixedYear;
  /**
   * 是否个体工商户
   */
  private String isBizEntity;
  /**
   * 职位信息
   */
  private LoanEmplymt emplymt;
  /**
   * 经营信息
   */
  private LoanIndv Indv;
  /**
   * 联系人信息
   */
  private List<LoanContact> contacts;
  /**
   * 资金需求信息
   */
  private LoanFac fac;
  /**
   * 担保信息
   */
  private List<LoanCol> colls;


  public String getCustId() {
    return custId;
  }

  public void setCustId(String custId) {
    this.custId = custId;
  }

  public String getBizRegNo() {
    return bizRegNo;
  }

  public void setBizRegNo(String bizRegNo) {
    this.bizRegNo = bizRegNo;
  }

  public String getIdNo() {
    return idNo;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public String getIsComb() {
    return isComb;
  }

  public void setIsComb(String isComb) {
    this.isComb = isComb;
  }

  public String getBrandNm() {
    return brandNm;
  }

  public void setBrandNm(String brandNm) {
    this.brandNm = brandNm;
  }

  public String getCoreBiz() {
    return coreBiz;
  }

  public void setCoreBiz(String coreBiz) {
    this.coreBiz = coreBiz;
  }

  public String getIsFreeTradeArea() {
    return isFreeTradeArea;
  }

  public void setIsFreeTradeArea(String isFreeTradeArea) {
    this.isFreeTradeArea = isFreeTradeArea;
  }

  public String getMtCifCatCd() {
    return mtCifCatCd;
  }

  public void setMtCifCatCd(String mtCifCatCd) {
    this.mtCifCatCd = mtCifCatCd;
  }

  public String getMtCityCd() {
    return mtCityCd;
  }

  public void setMtCityCd(String mtCityCd) {
    this.mtCityCd = mtCityCd;
  }

  public String getMtCorpSalutationCd() {
    return mtCorpSalutationCd;
  }

  public void setMtCorpSalutationCd(String mtCorpSalutationCd) {
    this.mtCorpSalutationCd = mtCorpSalutationCd;
  }

  public String getMtIndDetailCd() {
    return mtIndDetailCd;
  }

  public void setMtIndDetailCd(String mtIndDetailCd) {
    this.mtIndDetailCd = mtIndDetailCd;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Date getDtRegistered() {
    return dtRegistered;
  }

  public void setDtRegistered(Date dtRegistered) {
    this.dtRegistered = dtRegistered;
  }

  public String getIncomeTaxNo() {
    return incomeTaxNo;
  }

  public void setIncomeTaxNo(String incomeTaxNo) {
    this.incomeTaxNo = incomeTaxNo;
  }

  public String getNationalTaxNo() {
    return nationalTaxNo;
  }

  public void setNationalTaxNo(String nationalTaxNo) {
    this.nationalTaxNo = nationalTaxNo;
  }

  public String getRegisteredAddr() {
    return registeredAddr;
  }

  public void setRegisteredAddr(String registeredAddr) {
    this.registeredAddr = registeredAddr;
  }

  public String getBizAddr() {
    return bizAddr;
  }

  public void setBizAddr(String bizAddr) {
    this.bizAddr = bizAddr;
  }

  public Date getDtStart() {
    return dtStart;
  }

  public void setDtStart(Date dtStart) {
    this.dtStart = dtStart;
  }

  public Integer getNoOfBizSite() {
    return noOfBizSite;
  }

  public void setNoOfBizSite(Integer noOfBizSite) {
    this.noOfBizSite = noOfBizSite;
  }

  public BigDecimal getEmployeeCnt() {
    return employeeCnt;
  }

  public void setEmployeeCnt(BigDecimal employeeCnt) {
    this.employeeCnt = employeeCnt;
  }

  public String getMtListedCd() {
    return mtListedCd;
  }

  public void setMtListedCd(String mtListedCd) {
    this.mtListedCd = mtListedCd;
  }

  public BigDecimal getPaidUpCapital() {
    return paidUpCapital;
  }

  public void setPaidUpCapital(BigDecimal paidUpCapital) {
    this.paidUpCapital = paidUpCapital;
  }

  public BigDecimal getAuthCapital() {
    return authCapital;
  }

  public void setAuthCapital(BigDecimal authCapital) {
    this.authCapital = authCapital;
  }

  public Integer getBizLandArea() {
    return bizLandArea;
  }

  public void setBizLandArea(Integer bizLandArea) {
    this.bizLandArea = bizLandArea;
  }

  public String getMtBizLandOwnerCd() {
    return mtBizLandOwnerCd;
  }

  public void setMtBizLandOwnerCd(String mtBizLandOwnerCd) {
    this.mtBizLandOwnerCd = mtBizLandOwnerCd;
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

  public BigDecimal getRatal() {
    return ratal;
  }

  public void setRatal(BigDecimal ratal) {
    this.ratal = ratal;
  }

  public BigDecimal getSocialSecurity() {
    return socialSecurity;
  }

  public void setSocialSecurity(BigDecimal socialSecurity) {
    this.socialSecurity = socialSecurity;
  }

  public BigDecimal getEquityLine() {
    return equityLine;
  }

  public void setEquityLine(BigDecimal equityLine) {
    this.equityLine = equityLine;
  }

  public BigDecimal getWaterDosage() {
    return waterDosage;
  }

  public void setWaterDosage(BigDecimal waterDosage) {
    this.waterDosage = waterDosage;
  }

  public BigDecimal getElectricityDosage() {
    return electricityDosage;
  }

  public void setElectricityDosage(BigDecimal electricityDosage) {
    this.electricityDosage = electricityDosage;
  }

  public BigDecimal getSalaryTotal() {
    return salaryTotal;
  }

  public void setSalaryTotal(BigDecimal salaryTotal) {
    this.salaryTotal = salaryTotal;
  }

  public String getMtSalaryTypCd() {
    return mtSalaryTypCd;
  }

  public void setMtSalaryTypCd(String mtSalaryTypCd) {
    this.mtSalaryTypCd = mtSalaryTypCd;
  }

  public String getPrincipalNo() {
    return principalNo;
  }

  public void setPrincipalNo(String principalNo) {
    this.principalNo = principalNo;
  }

  public String getMtFinInsttnCd() {
    return mtFinInsttnCd;
  }

  public void setMtFinInsttnCd(String mtFinInsttnCd) {
    this.mtFinInsttnCd = mtFinInsttnCd;
  }

  public String getNm() {
    return nm;
  }

  public void setNm(String nm) {
    this.nm = nm;
  }

  public Date getDtIssue() {
    return dtIssue;
  }

  public void setDtIssue(Date dtIssue) {
    this.dtIssue = dtIssue;
  }

  public Date getDtExpiry() {
    return dtExpiry;
  }

  public void setDtExpiry(Date dtExpiry) {
    this.dtExpiry = dtExpiry;
  }

  public String getMtGenderCd() {
    return mtGenderCd;
  }

  public void setMtGenderCd(String mtGenderCd) {
    this.mtGenderCd = mtGenderCd;
  }

  public String getMtMaritalStsCd() {
    return mtMaritalStsCd;
  }

  public void setMtMaritalStsCd(String mtMaritalStsCd) {
    this.mtMaritalStsCd = mtMaritalStsCd;
  }

  public String getMtEduLvlCd() {
    return mtEduLvlCd;
  }

  public void setMtEduLvlCd(String mtEduLvlCd) {
    this.mtEduLvlCd = mtEduLvlCd;
  }

  public String getMtResidenceStsCd() {
    return mtResidenceStsCd;
  }

  public void setMtResidenceStsCd(String mtResidenceStsCd) {
    this.mtResidenceStsCd = mtResidenceStsCd;
  }

  public String getIsFamily() {
    return isFamily;
  }

  public void setIsFamily(String isFamily) {
    this.isFamily = isFamily;
  }

  public String getMtJobSectorCd() {
    return mtJobSectorCd;
  }

  public void setMtJobSectorCd(String mtJobSectorCd) {
    this.mtJobSectorCd = mtJobSectorCd;
  }


  public BigDecimal getMonthlyIncAmt() {
    return monthlyIncAmt;
  }

  public void setMonthlyIncAmt(BigDecimal monthlyIncAmt) {
    this.monthlyIncAmt = monthlyIncAmt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }


  public String getMtIndvMobileUsageStsCd() {
    return mtIndvMobileUsageStsCd;
  }

  public void setMtIndvMobileUsageStsCd(String mtIndvMobileUsageStsCd) {
    this.mtIndvMobileUsageStsCd = mtIndvMobileUsageStsCd;
  }

  public Integer getQq() {
    return qq;
  }

  public void setQq(Integer qq) {
    this.qq = qq;
  }

  public String getWeChat() {
    return weChat;
  }

  public void setWeChat(String weChat) {
    this.weChat = weChat;
  }

  public BigDecimal getBankCard() {
    return bankCard;
  }

  public void setBankCard(BigDecimal bankCard) {
    this.bankCard = bankCard;
  }

  public BigDecimal getCreditCardLines() {
    return creditCardLines;
  }

  public void setCreditCardLines(BigDecimal creditCardLines) {
    this.creditCardLines = creditCardLines;
  }

  public BigDecimal getLoanFixedYear() {
    return loanFixedYear;
  }

  public void setLoanFixedYear(BigDecimal loanFixedYear) {
    this.loanFixedYear = loanFixedYear;
  }

  public String getIsBizEntity() {
    return isBizEntity;
  }

  public void setIsBizEntity(String isBizEntity) {
    this.isBizEntity = isBizEntity;
  }

  public LoanEmplymt getEmplymt() {
    return emplymt;
  }

  public void setEmplymt(LoanEmplymt emplymt) {
    this.emplymt = emplymt;
  }

  public LoanIndv getIndv() {
    return Indv;
  }

  public void setIndv(LoanIndv indv) {
    Indv = indv;
  }

  public List<LoanContact> getContacts() {
    return contacts;
  }

  public void setContacts(List<LoanContact> contacts) {
    this.contacts = contacts;
  }

  public LoanFac getFac() {
    return fac;
  }

  public void setFac(LoanFac fac) {
    this.fac = fac;
  }

  public List<LoanCol> getColls() {
    return colls;
  }

  public void setColls(List<LoanCol> colls) {
    this.colls = colls;
  }

}

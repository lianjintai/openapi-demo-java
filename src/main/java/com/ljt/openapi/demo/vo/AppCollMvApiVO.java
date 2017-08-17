package com.ljt.openapi.demo.vo;

import java.util.List;

public class AppCollMvApiVO extends AppCollVO {
  /**
   * 描述:车辆基本信息
   */
  private String basicInfo;

  /**
   * 描述:车辆配置信息
   */
  private String confInfo;

  /**
   * 描述:违章情况
   */
  private String penaltyInfo;

  /**
   * 描述:交强险信息
   */
  private String insuranceInfo;

  /**
   * 描述:代收车船费
   */
  private String paymentInfo;

  /**
   * 描述:车辆基本信息 json类
   */
  private MvBasicInfoVO mvBasicInfo;
  /**
   * 描述:车辆配置信息 json类
   */
  private MvConfInfoVO mvConfInfo;
  /**
   * 描述:违章情况 json类
   */
  private MvPenaltyInfoVO mvPenaltyInfo;

  /**
   * 描述:交强险信息 json类
   */
  private MvInsuranceInfo mvInsuranceInfo;
  /**
   * 描述:代收车船费 json类
   */
  private MvPaymentInfoVO mvPaymentInfo;
  /**
   * 所有者信息(个人)
   */
  private List<AppCollOwnerVO> csCollOwner;
  /**
   * 所有者信息(企业)
   */
  private List<AppCollOwnerVO> cpCollOwner;
  /**
   * 评估信息
   */
  private List<AppCollEvaluateVO> appCollEvaluate;

  public AppCollMvApiVO() {}


  public List<AppCollOwnerVO> getCsCollOwner() {
    return csCollOwner;
  }


  public void setCsCollOwner(List<AppCollOwnerVO> csCollOwner) {
    this.csCollOwner = csCollOwner;
  }


  public List<AppCollOwnerVO> getCpCollOwner() {
    return cpCollOwner;
  }


  public void setCpCollOwner(List<AppCollOwnerVO> cpCollOwner) {
    this.cpCollOwner = cpCollOwner;
  }


  public List<AppCollEvaluateVO> getAppCollEvaluate() {
    return appCollEvaluate;
  }


  public void setAppCollEvaluate(List<AppCollEvaluateVO> appCollEvaluate) {
    this.appCollEvaluate = appCollEvaluate;
  }


  public String getBasicInfo() {
    return basicInfo;
  }

  public void setBasicInfo(String basicInfo) {
    this.basicInfo = basicInfo;
  }

  public String getConfInfo() {
    return confInfo;
  }

  public void setConfInfo(String confInfo) {
    this.confInfo = confInfo;
  }


  public String getPenaltyInfo() {
    return penaltyInfo;
  }


  public void setPenaltyInfo(String penaltyInfo) {
    this.penaltyInfo = penaltyInfo;
  }


  public String getInsuranceInfo() {
    return insuranceInfo;
  }


  public void setInsuranceInfo(String insuranceInfo) {
    this.insuranceInfo = insuranceInfo;
  }


  public String getPaymentInfo() {
    return paymentInfo;
  }


  public void setPaymentInfo(String paymentInfo) {
    this.paymentInfo = paymentInfo;
  }


  public MvBasicInfoVO getMvBasicInfo() {
    return mvBasicInfo;
  }


  public void setMvBasicInfo(MvBasicInfoVO mvBasicInfo) {
    this.mvBasicInfo = mvBasicInfo;
  }


  public MvConfInfoVO getMvConfInfo() {
    return mvConfInfo;
  }


  public void setMvConfInfo(MvConfInfoVO mvConfInfo) {
    this.mvConfInfo = mvConfInfo;
  }


  public MvPenaltyInfoVO getMvPenaltyInfo() {
    return mvPenaltyInfo;
  }


  public void setMvPenaltyInfo(MvPenaltyInfoVO mvPenaltyInfo) {
    this.mvPenaltyInfo = mvPenaltyInfo;
  }


  public MvInsuranceInfo getMvInsuranceInfo() {
    return mvInsuranceInfo;
  }


  public void setMvInsuranceInfo(MvInsuranceInfo mvInsuranceInfo) {
    this.mvInsuranceInfo = mvInsuranceInfo;
  }


  public MvPaymentInfoVO getMvPaymentInfo() {
    return mvPaymentInfo;
  }


  public void setMvPaymentInfo(MvPaymentInfoVO mvPaymentInfo) {
    this.mvPaymentInfo = mvPaymentInfo;
  }
}

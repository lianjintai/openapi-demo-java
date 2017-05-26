package com.ljt.openapi.demo.vo;

import com.ljt.openapi.demo.vo.cp.CpReInfo;
import com.ljt.openapi.demo.vo.cs.CsRelSpouseVO;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.vo.RelCpLoanParam.java
 * @Description : 借款方为企贷，关联关系为法定代表人、总经理、财务负责人、实际控制人，直接关联人、间接关联人、控股股东、股东
 * @Author : lcy
 * @Creation Date : 2017年5月23日 下午7:07:04
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月23日 create
 */
public class RelCpLoanParam {

  private CsRelSpouseVO relCpsBase;

  private CpReInfo cpRelInfo;

  public CsRelSpouseVO getRelCpsBase() {
    return relCpsBase;
  }

  public void setRelCpsBase(CsRelSpouseVO relCpsBase) {
    this.relCpsBase = relCpsBase;
  }

  public CpReInfo getCpRelInfo() {
    return cpRelInfo;
  }

  public void setCpRelInfo(CpReInfo cpRelInfo) {
    this.cpRelInfo = cpRelInfo;
  }
}

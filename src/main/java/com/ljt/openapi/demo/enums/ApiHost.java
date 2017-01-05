package com.ljt.openapi.demo.enums;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.enums.ApiHost.java
 * @Description : api地址枚举
 * @Author : bingo刑天
 * @Creation Date : 2016年12月27日 上午10:44:41
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      bingo刑天 2016年12月27日 create
 */
public enum ApiHost {
  DEV_API_HOST("stageapi.lianjintai.com", "测试api地址"), OFFICIAL_API_HOST("api.lianjintai.com",
      "正式api地址"), LOCALHOST("127.0.0.1:8089", "单机测试地址");

  private String host;
  private String dscp;

  private ApiHost(String host, String dscp) {
    this.host = host;
    this.dscp = dscp;
  }

  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public String getDscp() {
    return dscp;
  }

  public void setDscp(String dscp) {
    this.dscp = dscp;
  }
}

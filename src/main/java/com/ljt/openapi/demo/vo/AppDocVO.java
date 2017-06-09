package com.ljt.openapi.demo.vo;

import java.util.List;
import java.util.Map;

public class AppDocVO {

  /**
   * appId:申请ID
   */

  private String appId;

  /**
   * docs:申请材料信息
   */

  private List<DocVO> docs;

  /**
   * url:oss上传凭证
   */

  private Map<String, String> url;

  public AppDocVO() {}

  public AppDocVO(String appId) {
    this.appId = appId;
  }

  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public List<DocVO> getDocs() {
    return docs;
  }

  public void setDocs(List<DocVO> docs) {
    this.docs = docs;
  }

  public Map<String, String> getUrl() {
    return url;
  }

  public void setUrl(Map<String, String> url) {
    this.url = url;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("AppDocVO [appId=").append(appId).append(", docs=").append(docs).append(", url=")
        .append(url).append("]");
    return builder.toString();
  }

}

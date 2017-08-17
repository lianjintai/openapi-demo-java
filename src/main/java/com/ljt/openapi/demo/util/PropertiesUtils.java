package com.ljt.openapi.demo.util;

import java.io.IOException;
import java.util.Properties;

public final class PropertiesUtils {

  private static Properties prop = new Properties();

  private static final String PROPERTIES_NAME = "keys3.properties";


  static {
    if (prop.size() == 0) {
      try {
        prop.load(
            Thread.currentThread().getContextClassLoader().getResourceAsStream(PROPERTIES_NAME));
      } catch (IOException e) {
        throw new RuntimeException("properties file (" + PROPERTIES_NAME + ") not found", e);
      }
    }
  }

  public static String getAESKey() {
    return prop.getProperty("aesKey");
  }

  public static String getAppKey() {
    return prop.getProperty("appKey");
  }

  public static String getAppSecret() {
    return prop.getProperty("appSecret");
  }

}

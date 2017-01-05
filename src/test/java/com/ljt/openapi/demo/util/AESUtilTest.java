package com.ljt.openapi.demo.util;

import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class AESUtilTest {

  @Test
  public void test() throws NoSuchAlgorithmException {
    System.out.println(AESUtil.genKey());
  }

}

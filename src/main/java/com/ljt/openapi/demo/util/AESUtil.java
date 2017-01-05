package com.ljt.openapi.demo.util;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {

  private static final String CHARSET = "UTF-8";
  private static final String KEY_ALGORITHM = "AES";
  private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";

  private AESUtil() {}
  /**
   * @param key AES秘钥
   * @param content 需要加密的内容
   * @return
   * @throws Exception
   */
  public static String encrypt(String key, String content)
      throws GeneralSecurityException, UnsupportedEncodingException {

    Cipher cipher;
    try {
      cipher = Cipher.getInstance(CIPHER_ALGORITHM);
      IvParameterSpec iv = new IvParameterSpec(initIv(CIPHER_ALGORITHM));
      cipher.init(Cipher.ENCRYPT_MODE,
          new SecretKeySpec(Base64.getDecoder().decode(key.getBytes()), KEY_ALGORITHM), iv);

      byte[] encryptBytes = cipher.doFinal(content.getBytes(CHARSET));
      return Base64.getEncoder().encodeToString(encryptBytes);

    } catch (GeneralSecurityException | UnsupportedEncodingException e) {
      throw e;
    }

  }

  public static String genKey() throws NoSuchAlgorithmException {
    KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
    kg.init(128);
    //生成密钥
    SecretKey secretKey = kg.generateKey();
    //获取二进制密钥编码形式
    return Base64.getEncoder().encodeToString(secretKey.getEncoded());
  }

  /**
   * 初始向量的方法, 全部为0. 这里的写法适合于其它算法,针对AES算法的话,IV值一定是128位的(16字节).
   * @param fullAlg
   * @return
   * @throws GeneralSecurityException
   */
  private static byte[] initIv(String fullAlg) throws GeneralSecurityException {
    Cipher cipher = Cipher.getInstance(fullAlg);
    int blockSize = cipher.getBlockSize();
    byte[] iv = new byte[blockSize];
    for (int i = 0; i < blockSize; ++i) {
      iv[i] = 0;
    }
    return iv;
  }

  /**
   * @param content 密文
   * @param key aes密钥
   * @return 原文
   * @throws EncryptException
   */
  public static String decrypt(String content, String key) throws GeneralSecurityException {

    //反序列化AES密钥
    SecretKeySpec keySpec =
        new SecretKeySpec(Base64.getDecoder().decode(key.getBytes()), KEY_ALGORITHM);

    //128bit全零的IV向量
    byte[] iv = new byte[16];
    for (int i = 0; i < iv.length; i++) {
      iv[i] = 0;
    }
    IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);

    //初始化加密器并加密
    Cipher deCipher = Cipher.getInstance(CIPHER_ALGORITHM);
    deCipher.init(Cipher.DECRYPT_MODE, keySpec, ivParameterSpec);
    byte[] encryptedBytes = Base64.getDecoder().decode(content.getBytes());
    byte[] bytes = deCipher.doFinal(encryptedBytes);
    return new String(bytes);

  }

}

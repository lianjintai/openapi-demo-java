package com.ljt.openapi.demo.demos;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.vo.RelCpLoanParam;
import com.ljt.openapi.demo.vo.cp.CpReInfo;
import com.ljt.openapi.demo.vo.cs.CsRelSpouseVO;

/**
 * 
 * @Project : dcms-openapi-demo
 * @Program Name : com.ljt.openapi.demo.demos.CreditCpRelShareHolderDemo.java
 * @Description : 创建企贷关联人信息
 * @Author : lcy
 * @Creation Date : 2017年5月25日 下午2:10:58
 * @ModificationHistory Who When What ---------- ------------- -----------------------------------
 *                      lcy 2017年5月25日 create
 */
public class CreditCpRelShareHolderDemo {


  /********************* 以下信息请换成您获取到的密钥 **********************************/
  /**
   * aes加密密钥
   */
  private String key = "";
  /**
   * 产品Key
   */
  private String appKey = "";
  /**
   * 产品密钥
   */
  private String appSecret = "";

  /********************* 以上信息请换成您获取到的密钥 **********************************/


  /**
   * @Description : 创建法定代表关联人
   * @throws Exception
   * @Creation Date : 2017年5月26日 下午2:00:07
   * @Author : lcy
   */
  @Test
  public void credateCpRelShareHolderTest() throws Exception {
    String requestBody = loanCprelParam();
    String method = "loan_app:cif_cp_rel_shareholder:create";
    String aesKey = key;
    Request request = new Request();
    request.setMethod(Method.POST_STRING);
    /**
     * 测试环境，生产环境需要修改为 HttpSchema.HTTPS OFFICIAL_API_HOST
     */
    request.setHost(HttpSchema.HTTPS + ApiHost.DEV_API_HOST.getHost());
    request.setPath("/v1/gateway/" + method);
    request.setAppKey(appKey);
    request.setAppSecret(appSecret);
    request.setTimeout(Constants.DEFAULT_TIMEOUT);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_JSON);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Client.execute(request);
  }



  /**
   * 
   * @Description : 封装法定代表人信息
   * @return : String
   * @Creation Date : 2017年5月26日 下午2:01:19
   * @Author : lcy
   */
  private String loanCprelParam() {
    RelCpLoanParam cpLoanParam = new RelCpLoanParam();
    // 基本数据的封装
    CsRelSpouseVO relCpBase = new CsRelSpouseVO();
    relCpBase.setNm("法定代表关联人");
    relCpBase.setMtCifRelCd("IC008");
    relCpBase.setAppId("1107a7279d394ed2b6071ad09378c777");
    relCpBase.setIdNo("113671199702026086");
    relCpBase.setMtMaritalStsCd("02");
    relCpBase.setDtRegistered(new Date());
    relCpBase.setMtGenderCd("M");
    relCpBase.setMobileNo("18888888888");
    relCpBase.setMtIndvMobileUsageStsCd("01");
    cpLoanParam.setRelCpsBase(relCpBase);
    // 特有信息的封装
    cpLoanParam.setCpRelInfo(loanCpRelInfo());
    return JSONObject.toJSONString(cpLoanParam, SerializerFeature.WriteDateUseDateFormat);
  }

  /**
   * 
   * @Description : 封装法定代表人特有信息
   * @return : CpReInfo
   * @Creation Date : 2017年5月26日 下午2:01:57
   * @Author : lcy
   */
  private CpReInfo loanCpRelInfo() {
    CpReInfo cpReInfo = new CpReInfo();
    cpReInfo.setIsActualCtrl("Y");
    cpReInfo.setIsInvolvedMgmt("Y");
    cpReInfo.setDtInBizLineSince(new Date());
    cpReInfo.setDtInCompSince(new Date());;
    cpReInfo.setMgmtExperience("工作经历");
    cpReInfo.setMtMtPosHeldCd("003");
    return cpReInfo;
  }
}

package com.ljt.openapi.demo.demos;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ljt.openapi.demo.Client;
import com.ljt.openapi.demo.Request;
import com.ljt.openapi.demo.Response;
import com.ljt.openapi.demo.constant.Constants;
import com.ljt.openapi.demo.constant.ContentType;
import com.ljt.openapi.demo.constant.HttpHeader;
import com.ljt.openapi.demo.constant.HttpSchema;
import com.ljt.openapi.demo.constant.SystemHeader;
import com.ljt.openapi.demo.enums.ApiHost;
import com.ljt.openapi.demo.enums.Method;
import com.ljt.openapi.demo.util.AESUtil;
import com.ljt.openapi.demo.util.MessageDigestUtil;
import com.ljt.openapi.demo.util.PropertiesUtils;
import com.ljt.openapi.demo.vo.FaCifFinParaVO;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.junit.Test;

/**
 * @description : 财报保存示例
 * @auther : 迟长超
 * @version : 1.28
 * @date : 2018/9/3 下午6:20
 */
public class FinSaveDemo {

  /******************* 以下信息请换成您获取到的密钥 **************************/
  /**
   * aes加密密钥
   */
  private String key = PropertiesUtils.getAESKey();
  /**
   * 产品Key
   */
  private String appKey = PropertiesUtils.getAppKey();
  /**
   * 产品密钥
   */
  private String appSecret = PropertiesUtils.getAppSecret();

  /******************* 以上信息请换成您获取到的密钥 *************************/

  /**
   * @description : 财报保存示例
   * @return void
   * @auther : 迟长超
   * @version : 1.28
   * @date : 2018/9/3 下午6:21
   */
  @Test
  public void finSaveTest() throws Exception {
    String requestBody = finSaveParam();
    String method = "loan_app:earnings:save";
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
    request.setTimeout(Constants.DEFAULT_TIMEOUT_LONG);
    Map<String, String> headers = new HashMap<>();
    headers.put(SystemHeader.X_CA_NONCE, UUID.randomUUID().toString());
    // （必填）根据期望的Response内容类型设置
    headers.put(HttpHeader.HTTP_HEADER_ACCEPT, "application/json");
    // Body MD5,服务端会校验Body内容是否被篡改,建议Body非Form表单时添加此Header
    requestBody = AESUtil.encrypt(aesKey, requestBody);
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_MD5, MessageDigestUtil.base64AndMD5(requestBody));
    // （POST/PUT请求必选）请求Body内容格式
    headers.put(HttpHeader.HTTP_HEADER_CONTENT_TYPE, ContentType.CONTENT_TYPE_TEXT);
    request.setHeaders(headers);
    request.setStringBody(requestBody);
    Response response = Client.execute(request);
    if (response.getStatusCode() == 200) {
      System.out.println("decrypt response：" + AESUtil.decrypt(response.getBody(), key));
    }
  }

  /**
   * @description : 财报保存参数
   * @return java.lang.String
   * @auther : 迟长超
   * @version : 1.28
   * @date : 2018/9/3 下午6:22
   */
  public String finSaveParam() {
    FaCifFinParaVO faCifFinParaVO = new FaCifFinParaVO();
    faCifFinParaVO.setAppId("1e9aecdfc22341b3baffb30a263d767e");
    faCifFinParaVO.setMtFinFmtCd("004");
    faCifFinParaVO.setDtFin(new Date());
    faCifFinParaVO.setMtFinStsCd("001");
    faCifFinParaVO.setMtFinRptCatCd("1");
    faCifFinParaVO.setMtFinRptTypCd("1");
    Map<String, String> finItems = new HashMap<>();
    finItems.put("ANNEX026", "419144.7");
    finItems.put("ANNEX08", "3487368.34");
    finItems.put("ANNEX09", "438224.76");
    finItems.put("ANNEX10", "700377.53");
    finItems.put("ANNEX11", "5561095.45");
    finItems.put("ANNEX12", "0264711.04");
    finItems.put("ANNEX13", "3794328.73");
    finItems.put("ZCFZ01", "492629.65");
    finItems.put("ZCFZ06", "2971176.31");
    finItems.put("ZCFZ07", "5677808.08");
    finItems.put("ZCFZ13", "14648792.74");
    finItems.put("ZCFZ15", "13067606.95");
    finItems.put("ZCFZ23", "1807775");
    finItems.put("ZCFZ25", "2029539.18");
    finItems.put("ZCFZ26", "238526.81");
    finItems.put("ZCFZ31", "511494.29");
    finItems.put("ZCFZ32", "1479");
    finItems.put("ZCFZ34", "2119651.02");
    finItems.put("ZCFZ39", "9732200");
    finItems.put("ZCFZ45", "9306253.29");
    finItems.put("ZCFZ46", "4628251.08");
    finItems.put("ZCFZ49", "1626684.85");
    finItems.put("ZCFZ50", "-49974.36");
    finItems.put("ZCFZ53", "20761562.22");
    finItems.put("ZCFZ70", "14625000");
    finItems.put("ZCFZ71", "36375000");
    finItems.put("ZCFZ75", "-53438498.05");
    finItems.put("ANNEX01", "1966003.94");
    finItems.put("ANNEX03", "18111911.29");
    finItems.put("ANNEX17", "159573724.9");
    finItems.put("ANNEX18", "-27896401.85");
    finItems.put("SY01", "93256615.08");
    finItems.put("SY02", "93256615.08");
    finItems.put("SY06", "86100968.12");
    finItems.put("SY07", "86100968.12");
    finItems.put("SY15", "29975.83");
    finItems.put("SY16", "18111911.29");
    finItems.put("SY17", "5023370.43");
    finItems.put("SY18", "348100.38");
    finItems.put("SY25", "15035.79");
    finItems.put("SY26", "4391.21");
    finItems.put("ANNEX021", "-10494347.66");
    finItems.put("XJ01", "113297749.4");
    finItems.put("XJ12", "25192.93");
    finItems.put("XJ13", "47133565.98");
    finItems.put("XJ21", "11136529.71");
    finItems.put("XJ22", "197590.23");
    finItems.put("XJ23", "53998342.41");
    finItems.put("XJ32", "685605.66");
    finItems.put("XJ33", "1607775");
    finItems.put("XJ39", "5299578.74");
    finItems.put("XJ45", "28116942.36");
    finItems.put("XJ46", "309033.47");
    finItems.put("BS88", "0");
    faCifFinParaVO.setFinItems(finItems);
    return JSONObject.toJSONString(faCifFinParaVO, SerializerFeature.WriteDateUseDateFormat);
  }
}

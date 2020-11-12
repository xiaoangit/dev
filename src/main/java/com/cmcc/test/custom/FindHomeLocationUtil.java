package com.cmcc.test.custom;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import java.util.Date;

/*
 * @ClassName AscriptionUtils
 * @Description TODO  获取归属地
 * @Author 86158
 * @Date 2020/10/12
 * @Version 1.0
 */
public class FindHomeLocationUtil {
    public static String ascription(String mainPhone,String phone) throws Exception {
        Date date = new Date();
        System.out.println(date.getTime());

        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://premobilehall.cmpay.com:10680/autoH5GW/h5public/mobileinfo");



        // json方式
        String json = "{\"mainPhone\":\""+mainPhone+"\",\"rechargePhone\":\""+phone+"\"," +
                "\"operationFlg\":\"\",\"SIGN_DATA\":\"66e321f1cf418496da9ea19007c44433\"," +
                "\"CREDTENTIAL\":\"100169883853,1602490297,1602490897,1602490297,218.77.106.66,client.cmpay.com\"," +
                "\"t\":\"" + date.getTime() + "\"}";
//        System.out.println(json);
        Logger logger = Logger.getLogger(FindHomeLocationUtil.class);
        logger.info("查询归属地请求参数："+json);
        httpPost.setHeader("Referer", "//premobilehall.cmpay.com:10680/autoh5/pages/set/?hbmid=SFJXUlVTbk5iNFYyUjFjR3BOZVZWNVdYcFdSMUkxT1ZkWmJrcHFUV3gzYVUxNVZVTk5kMEZFVFhkQmFrMTVWV2xQZVVsVVNteFNNbUpFVWxoYVUyd3pZbWhrYlUxNVZVTk1jM2hYWkhWd2FrMTVWWGxpYlRWWFUzazViV041Vm0xTmVWVkRUSE40VjJSMWNHcE5lVlY1V25OYWEyTjJTbTVqYkVwcVRXeDNhVTE1VlZOUE5WVnBUVU5XYVU1R1ZtbFNRMVpUVGpWVlUwOUdWbWxOZVZWcFQzbEpWRW8xVWxoaGFrcHFUV3gzYVUxNVZWTk5lbU5xVFhsVmFVOTVTVlJLYkZJeVlrUnNTR1J3VG0xTmVWVkRUSGxKVkVvemExUktSV2hVU2pGVlZVb3lhMVJLTlVsVlNqSlZWVXA1U1ZSS05rbHFUV3hWTWxsMWJHMWtka3BJWTNsSlZFcHpTV3BOYkdkVVRYbEpWRW8yU1dwTmJGVkhXblpPVlZwcU5WZGhNamx0WTNkS2FrMXNkMmxOZVZWRFQwSldVMUUwVlZOT1JsWnBVVU5XZVU1Q1ZubE9SbFpwVFhsVmFVOTVTVlJLZVRsSFpHaEtXRnAzT1cxTmVWVkRUSGh2YWsxNVZWTmFkMnhJVm5rNVIyUm9TbGhhZHpsdFRYbFZRMHg1U1ZSS01GbDZUbmxKYWsxNVkycE5NRlZFV21wYWFrNTNhM3BOTUUxRVRUVk5hazU0U1ZSTmQwVkVUWGxKYWsxc2IycE5lVlY1WWs5NGJXTnNUbTVOZVZWRFRIbEpWRXAwT1RKWmRXdFlXWGN4TWxsMVVXNWliR3hIWW1wNGFVNHlOR2xPZDBWcVRETmpha3cwUldwTmMyTlVUM2xCVkU4d1NVUk5Na1ZFVEROclJFOTNhMFJPZVVGcVRuaDNlVTQxU1VSTk5WRnFUWGRaVkUxelRWUk9ORTFFVHpScmFrNTRRVVJOZUVscVRXeHZhazE1VlVOVVFteEZWazlXUlZaRlZtdFZSRXBxVFd4M2FVMTVWWGxOZWxGRVRqQk5NazUzUVZSUGVFVlhXalZGUjFveWEwUk9ORVZFVG0xT1YwMXRSbXBOZWxWdFRqSkphazFzYjJwTmVWVlRVVlZHUlZKbU5UQlNTazVzVFhsVlEweDVTVlJLZDFGRVQzcFZhazU1UVVSUE1VVnFUWGxWYVU5NVNWUktiSGhYWVdrNVYySjVTVlJLUTJSVVNnPT1p&protocol=SFBUMUJVak5iVmFVMTVWVk5OTkZWRFRVSldlVTVHVm5sT1ExWnBValJWVTA1R1ZrTk5RbFpUVVRSVlUwNUdWbWxSUTFaNVRrTldhVTVHVm1sTmVWVnBUM2xKVkVwdU9VZGlkbEp0VFhsVlEweDVTVlJLZDFGRVQzcFZhazU1UVVSUE1VVnFUWGxWYVU5NVNWUktiRFV5WW05Q2JHSndSbGRpZVVsVVNrTmtWRW89aQ==");
        httpPost.setHeader("Content-Type","application/json; charset=UTF-8");
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 5.0.2; Redmi Note 2 Build/LRX22G; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/57.0.2987.132 Mobile Safari/537.36 hebao/9.4.21 NetType/wifi");
        StringEntity entity = new StringEntity(json, "utf-8");//解决中文乱码问题
        httpPost.setEntity(entity);
        String province = null;
//        SsUtils.ignoreSsl();  //不进行证书校验
        CloseableHttpResponse resp = httpClient.execute(httpPost);  //发送post请求
        if (resp.getStatusLine().getStatusCode() == 200) {
            province = EntityUtils.toString(resp.getEntity(), "utf-8");
//            System.out.println(province);
        }
        return province;

    }
}

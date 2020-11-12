package com.cmcc.test.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/* @Author: XiaoAn
 * @Description: 获取driver
 * @Date: 2020/11/11
 */
public class AndroidDriverUtil {

    /* @Author: XiaoAn
     * @Description: 读取连接配置信息，并返回properties类
     * @Date: 2020/10/5
     */
    public static Properties properties() throws IOException {

        Properties properties = new Properties();
        InputStream resourceAsStream = AndroidDriverUtil.class.getClassLoader().getResourceAsStream("desired.properties");
        properties.load(resourceAsStream);
        return properties;
    }

    /* @Author: XiaoAn
     * @Description: 返回driver
     * @Date: 2020/10/5
     */
    public static AndroidDriver driver() throws IOException {
        Properties properties = properties();
        String platformName = properties.getProperty("platformName");
        String platformVersion = properties.getProperty("platformVersion");
        String deviceName = properties.getProperty("deviceName");
        String app = properties.getProperty("app");
        //properties文件读取默认使用ISO-8859-1读取，处理编码格式为读取前的gbk
        String app_gbk = new String(app.getBytes("ISO-8859-1"),"gbk");

        String appPackage = properties.getProperty("appPackage");
        String appActivity = properties.getProperty("appActivity");
        String noReset = properties.getProperty("noReset");
        String url = properties.getProperty("url");
        System.out.println(platformName+"--"+platformVersion+deviceName+"--"+deviceName+"--"+app_gbk+"--"+appPackage+"--"+
                appActivity+"--"+noReset+"--"+url);

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName",deviceName);
        desiredCapabilities.setCapability("platformName",platformName);
        desiredCapabilities.setCapability("platformVersion",platformVersion);
        desiredCapabilities.setCapability("app",app_gbk);
        desiredCapabilities.setCapability("appPackage",appPackage);
        desiredCapabilities.setCapability("appActivity",appActivity);
        desiredCapabilities.setCapability("noReset",noReset);

        AndroidDriver driver = new AndroidDriver(new URL(url),desiredCapabilities);
        return driver;
    }


}

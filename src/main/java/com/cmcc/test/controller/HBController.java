package com.cmcc.test.controller;

import com.cmcc.test.utils.ReaderFileUtil;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.util.Date;

/*
 * @ClassName HBController
 * @Description TODO
 * @Author 86158
 * @Date 2020/11/12
 * @Version 1.0
 */
@Listeners
public class HBController {

    private AndroidDriver driver;
    private WebDriverWait webDriverWait;
    private ReaderFileUtil readerFileUtil;
    private final Logger logger = Logger.getLogger(HBController.class);

    public void setDriver(AndroidDriver driver) {
        this.driver = driver;
    }

    public void setWebDriverWait(WebDriverWait webDriverWait) {
        this.webDriverWait = webDriverWait;
    }

    public void setReaderFileUtil(ReaderFileUtil readerFileUtil) {
        this.readerFileUtil = readerFileUtil;
    }

    /* @Author: XiaoAn
     * @Description: 判断操作元素并执行
     * @Date: 2020/11/12
     */
    public void heBao() throws Exception {
        BufferedReader bufferedReader = readerFileUtil.getReaderFile();

        String str;

        while ((str = bufferedReader.readLine()) != null){
            String[] split = str.split(",");

            /* @Author: XiaoAn
             * @Description: 判断元素
             * @Date: 2020/11/12
             */
            if ("byId".equals(split[0])){
                driver.findElementById(split[1]).click();
            }else if ("byXPath".equals(split[0])){
                driver.findElementByXPath(split[1]).click();
            }

            /* @Author: XiaoAn
             * @Description: 获取屏幕大小
             * @Date: 2020/11/12
             */
            int width = driver.manage().window().getSize().width;
            int height = driver.manage().window().getSize().height;
            /* @Author: XiaoAn
             * @Description: 判断滑动操作
             * @Date: 2020/11/12
             */
            if ("lswipe".equals(split[0])){
                logger.info("手机屏幕大小：" + width + "x" + height);
                Thread.sleep(2000);
                for (int i = 0; i < 3; i++) {
                    driver.swipe(width * 9 / 10, height / 2, width / 10, height / 2, 1000);
                    Thread.sleep(1000);
                }
            }
        }






    }
}

package com.cmcc.test;

import com.cmcc.test.controller.HBController;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

/*
 * @ClassName HebaoSpringTest
 * @Description TODO
 * @Author 86158
 * @Date 2020/11/11
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class HebaoSpringTest {

    @Test
    public void test01() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
        HBController hbController = (HBController) applicationContext.getBean("hbController");
        hbController.heBao();
    }

}

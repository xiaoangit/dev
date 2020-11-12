package com.cmcc.test.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * @ClassName ReaderFileUtils
 * @Description TODO  读取定位元素
 * @Author 86158
 * @Date 2020/11/11
 * @Version 1.0
 */
public class ReaderFileUtil {


    public BufferedReader getReaderFile(){
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("src/main/resources/data/android-driver.csv"));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }


}

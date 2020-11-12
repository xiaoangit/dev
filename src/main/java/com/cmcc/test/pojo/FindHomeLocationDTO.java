package com.cmcc.test.pojo;

/*
 * @ClassName Ascription
 * @Description TODO
 * @Author 86158
 * @Date 2020/10/12
 * @Version 1.0
 */
public class FindHomeLocationDTO {

    private FindHomeLocation biz;
    private String retcode;
    private String desc;
    private String serlNo;


    public FindHomeLocation getBiz() {
        return biz;
    }

    public void setBiz(FindHomeLocation biz) {
        this.biz = biz;
    }

    public String getRetcode() {
        return retcode;
    }

    public void setRetcode(String retcode) {
        this.retcode = retcode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSerlNo() {
        return serlNo;
    }

    public void setSerlNo(String serlNo) {
        this.serlNo = serlNo;
    }

    @Override
    public String toString() {
        return "Ascription{" +
                "biz=" + biz +
                ", retcode='" + retcode + '\'' +
                ", desc='" + desc + '\'' +
                ", serlNo='" + serlNo + '\'' +
                '}';
    }
}
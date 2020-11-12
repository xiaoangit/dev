package com.cmcc.test.pojo;

/*
 * @ClassName Ap
 * @Description TODO  归属地查询实体类
 * @Author 86158
 * @Date 2020/10/12
 * @Version 1.0
 */
public class FindHomeLocation {
    private String province;
    private String operator;
    private String serlNo;
    private String operatorType;
    private String provinceCode;
    private String cityCode;
    private String city;
    private String errorFlg;
    private String errorInfo;
    private String gaoyRetCode;
    private String gaoyDesc;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSerlNo() {
        return serlNo;
    }

    public void setSerlNo(String serlNo) {
        this.serlNo = serlNo;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getErrorFlg() {
        return errorFlg;
    }

    public void setErrorFlg(String errorFlg) {
        this.errorFlg = errorFlg;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getGaoyRetCode() {
        return gaoyRetCode;
    }

    public void setGaoyRetCode(String gaoyRetCode) {
        this.gaoyRetCode = gaoyRetCode;
    }

    public String getGaoyDesc() {
        return gaoyDesc;
    }

    public void setGaoyDesc(String gaoyDesc) {
        this.gaoyDesc = gaoyDesc;
    }

    @Override
    public String toString() {
        return "Ap{" +
                "province='" + province + '\'' +
                ", operator='" + operator + '\'' +
                ", serlNo='" + serlNo + '\'' +
                ", operatorType='" + operatorType + '\'' +
                ", provinceCode='" + provinceCode + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", city='" + city + '\'' +
                ", errorFlg='" + errorFlg + '\'' +
                ", errorInfo='" + errorInfo + '\'' +
                ", gaoyRetCode='" + gaoyRetCode + '\'' +
                ", gaoyDesc='" + gaoyDesc + '\'' +
                '}';
    }
}

package com.demisco.currencyconversionservice.request;

import java.util.List;

public class MadCashBoxRequest {
    private String code;
    private String clientSystemCode;
    private String name;
    private List<String> departmentListCode;
    private List<String> incomeTopicList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getClientSystemCode() {
        return clientSystemCode;
    }

    public void setClientSystemCode(String clientSystemCode) {
        this.clientSystemCode = clientSystemCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDepartmentListCode() {
        return departmentListCode;
    }

    public void setDepartmentListCode(List<String> departmentListCode) {
        this.departmentListCode = departmentListCode;
    }

    public List<String> getIncomeTopicList() {
        return incomeTopicList;
    }

    public void setIncomeTopicList(List<String> incomeTopicList) {
        this.incomeTopicList = incomeTopicList;
    }
}

package com.jgybzx.isworkday.entity;

import java.util.Date;

/**
 * @author jgybzx
 * @date 2020/11/23 21:50
 * @description
 */
public class LogSql {

    private String logId;
    private String methodName;
    private String sqlStr;
    private Date creatDate;
    private String requestUrl;
    private String methodUrl;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getSqlStr() {
        return sqlStr;
    }

    public void setSqlStr(String sqlStr) {
        this.sqlStr = sqlStr;
    }

    public Date getCreatDate() {
        return creatDate;
    }

    public void setCreatDate(Date creatDate) {
        this.creatDate = creatDate;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getMethodUrl() {
        return methodUrl;
    }

    public void setMethodUrl(String methodUrl) {
        this.methodUrl = methodUrl;
    }

    @Override
    public String toString() {
        return "LogSql{" +
                "logId='" + logId + '\'' +
                ", methodName='" + methodName + '\'' +
                ", sqlStr='" + sqlStr + '\'' +
                ", creatDate=" + creatDate +
                ", requestUrl='" + requestUrl + '\'' +
                ", methodUrl='" + methodUrl + '\'' +
                '}';
    }
}

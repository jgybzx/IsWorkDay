/**
 * Copyright 2021 bejson.com
 */
package com.jgybzx.isworkday.model;

import cn.hutool.json.JSONUtil;

import java.util.Date;


/**
 * @author Jgybzx
 */
public class DateList {

    private String uuid;
    private Date date;
    private String status;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
/**
 * Copyright 2021 bejson.com
 */
package com.jgybzx.isworkday.model;

import java.util.Date;
import java.util.List;


/**
 * @author Jgybzx
 */
public class Holiday_array {

    private String desc;
    private Date festival;
    private List<DateList> list;
    //    private int list#num#;
    private int list_num;
    private String name;
    private String rest;

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setFestival(Date festival) {
        this.festival = festival;
    }

    public Date getFestival() {
        return festival;
    }

    public void setList(List<DateList> list) {
        this.list = list;
    }

    public List<DateList> getList() {
        return list;
    }

    public void setList_num(int list_num) {
        this.list_num = list_num;
    }

    public int getList_num() {
        return list_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRest(String rest) {
        this.rest = rest;
    }

    public String getRest() {
        return rest;
    }

}
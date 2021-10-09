/**
 * Copyright 2021 bejson.com
 */
package com.jgybzx.isworkday.model;


import java.util.List;

/**
 * @author Jgybzx
 */
public class Data {

    private String holiday;
    private List<Holiday_array> holiday_array;
    private String year;

    //    private Date year-month;
    public void setHoliday(String holiday) {
        this.holiday = holiday;
    }

    public String getHoliday() {
        return holiday;
    }

    public void setHoliday_array(List<Holiday_array> holiday_array) {
        this.holiday_array = holiday_array;
    }

    public List<Holiday_array> getHoliday_array() {
        return holiday_array;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }


}
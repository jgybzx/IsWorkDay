package com.jgybzx.isworkday.utils;

/**
 * @author Jgybzx
 * @date 2021/10/9 9:46
 * des 星期枚举
 */
public enum WeekEnum {
    /**
     * 周一
     */
    MON(1, "星期一"),
    TUE(2, "星期二"),
    WED(3, "星期三"),
    THU(4, "星期四"),
    FRI(5, "星期五"),
    SAT(6, "星期六"),
    SUN(7, "星期日");
    private int value;
    private String name;

    WeekEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getNameByValue(int value) {
        for (WeekEnum weekEnum : WeekEnum.values()) {
            if (value == weekEnum.getValue()) {
                return weekEnum.getName();
            }
        }
        return null;
    }
}
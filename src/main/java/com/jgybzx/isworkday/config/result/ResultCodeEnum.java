package com.jgybzx.isworkday.config.result;

/**
 * @author jgybzx
 * @date 2021/3/3 17:19
 * @description
 */
public enum ResultCodeEnum {
    /**
     * 状态码
     */
    SUCCESS("200"),
    ERROR("500");

    private String code;

    ResultCodeEnum(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

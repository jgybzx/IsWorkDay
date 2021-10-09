package com.jgybzx.isworkday.config.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jgybzx
 * @date 2021/3/3 17:12
 * @description 接口返回消息类
 */
public class ResultMessage<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ResultMessage.class);

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态消息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    /**
     * 是否执行成功
     */
    private boolean ok;

    public ResultMessage() {
    }

    public ResultMessage(String code, String message) {
        this.code = code;
        this.message = message;
        LOGGER.info(toString());
    }

    public ResultMessage(String code, String message, boolean ok) {
        this.code = code;
        this.message = message;
        this.ok = ok;
        LOGGER.info(toString());
    }

    public ResultMessage(String code, String message, boolean ok, T data) {
        this.code = code;
        this.message = message;
        this.ok = ok;
        this.data = data;
        LOGGER.info(toString());
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public static ResultMessage success() {
        return new ResultMessage(ResultCodeEnum.SUCCESS.getCode(), "", true);
    }


    public static <T> ResultMessage<T> success(String message, T t) {
        return new ResultMessage(ResultCodeEnum.SUCCESS.getCode(), message, true, t);
    }

    public static <T> ResultMessage<T> success(T t) {
        return new ResultMessage(ResultCodeEnum.SUCCESS.getCode(), "", true, t);
    }

    public static ResultMessage error(String message) {
        return new ResultMessage(ResultCodeEnum.ERROR.getCode(), message, true);
    }

    public static <T> ResultMessage<T> error(String message, T t) {
        return new ResultMessage(ResultCodeEnum.SUCCESS.getCode(), message, false, t);
    }

}

package com.jgybzx.isworkday.config.result;

import cn.hutool.json.JSONUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author jgybzx
 * @date 2021/3/3 17:10
 * @description 接口返回值 统一格式处理
 */
@ControllerAdvice(basePackages = "com.jgybzx.isworkday.controller")
public class BaseResponseBodyAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        /**
         * String 类型 会报错，手动处理
         */
        if (body instanceof String) {
            return JSONUtil.toJsonPrettyStr(ResultMessage.success("成功", body));
        }
        return ResultMessage.success("成功", body);

    }
}

package com.sh.controller;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ShiroExceptionController {

    /**
     * 处理Shiro无法处理的异常
     * 比如：org.apache.shiro.authz.AuthorizationException: Not authorized to invoke method:
     *
     * @param request HttpServletRequest
     * @param e       Exception
     * @return 视图
     */
    @ResponseBody
    @ExceptionHandler(AuthorizationException.class)
    public Map<String, Object> authorizedErrorHandler(HttpServletRequest request, Exception e) {
        Map<String, Object> result = new HashMap<>();
        result.put("error", e.getMessage());
        return result;
    }

}

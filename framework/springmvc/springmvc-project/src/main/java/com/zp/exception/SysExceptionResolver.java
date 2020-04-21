package com.zp.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        if (ex instanceof SysException) {
            mv.addObject("errorMsg", ex.getMessage());
        } else {
            mv.addObject("errorMsg", "系统正在维护....");
        }
        mv.setViewName("error");
        return mv;
    }
}

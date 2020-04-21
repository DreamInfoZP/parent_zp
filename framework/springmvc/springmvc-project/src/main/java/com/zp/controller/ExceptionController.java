package com.zp.controller;

import com.zp.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExceptionController {

    @RequestMapping("/testException")
    public String testException() throws SysException {
        System.out.println("testException方法被执行了");
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("系统发生了异常");
        }
        return "success";
    }
}

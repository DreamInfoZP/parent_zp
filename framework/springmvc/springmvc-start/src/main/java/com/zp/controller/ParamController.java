package com.zp.controller;

import com.zp.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password) {
        System.out.println("testParam");
        System.out.println("用户名:" + username + " 密码:" + password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account) {
        System.out.println("testParam");
        System.out.println(account);
        return "success";
    }
}

package com.zp.controller;

import com.zp.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        User user = new User();
        user.setUsername("1e1231");
        user.setPassword("2312sdasdsa");
        user.setAge(18);
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * 默认值是Void
     * 请求转发一次，不用编写项目名称
     *
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("执行了方法");
        // 编写请求转发的程序
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);

        // 重定向
        //response.sendRedirect(request.getContextPath() + "/WEB-INF/pages/success.jsp");

        // 中文乱码问题
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        // 直接进行响应
        response.getWriter().print("您好");

    }

    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect() {

        // 转发
        //return "forward:/WEB-INF/pages/success.jsp";

        // 重定向

        return "redirect:index.jsp";
    }

    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body) {
        System.out.println(body);
    }
}

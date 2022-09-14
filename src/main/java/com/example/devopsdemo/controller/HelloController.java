package com.example.devopsdemo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * com.example.springsecuritydemo.controller
 *
 * @author xzwnp
 * 2022/8/22
 * 13:58
 */
@RestController
@RequestMapping("test")
public class HelloController {

    /**
     * 请求头不区分大小写,但是cookie区分
     */
    @GetMapping("hello")
    public String hello(
            @RequestHeader(required = false) String authorization,
            @CookieValue(required = false, value = "JSESSIONID") String jsessionId
    ) {
        return "成功访问,测试通过";
    }


}

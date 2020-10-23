package com.bjsxt.git.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @RequestMapping("/demo")
    public String demo(){
        return "aaa";
    }
    //修改了哈哈服务范围1232
}

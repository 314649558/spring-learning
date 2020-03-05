package com.hailong.spring.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2020/3/1.
 */
//@RestController()
@Controller
@RequestMapping("/product")
public class ProductController {

    @Secured("ROLE_PRODUCT")  //用户需要有这个角色才能访问成功
    @RequestMapping("/findAll")
    public String findAll(){
        return "product-list";
    }
}

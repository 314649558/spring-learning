package com.hailong.spring.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/3/1.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @RequestMapping("/findAll")
    public String findAll(){
        return "产品列表页";
    }
}

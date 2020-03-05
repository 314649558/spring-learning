package com.hailong.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2020/3/5.
 */
@SpringBootApplication
@MapperScan("com.hailong.spring.mapper")
public class SpringBootSecurityServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootSecurityServerApplication.class,args);
    }
}

package com.hailong.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2020/3/4.
 */
@SpringBootApplication
@MapperScan("com.hailong.spring.mapper")
public class ResourceSourceApplication {
    //http://localhost:9001/oauth/authorize?response_type=code&client_id=feifei


    public static void main(String[] args) {
        SpringApplication.run(ResourceSourceApplication.class,args);
    }
}

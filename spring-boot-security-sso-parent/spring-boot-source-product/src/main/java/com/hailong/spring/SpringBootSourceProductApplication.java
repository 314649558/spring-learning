package com.hailong.spring;

import com.hailong.spring.config.RsaKeyProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by Administrator on 2020/3/3.
 */
@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
@MapperScan("com.hailong.spring.mapper")
public class SpringBootSourceProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSourceProductApplication.class,args);
    }
}

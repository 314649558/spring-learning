package com.hailong.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hailong.spring.mapper")
public class SpringBootSecurityJspApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityJspApplication.class, args);
	}


	@Bean
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}



}

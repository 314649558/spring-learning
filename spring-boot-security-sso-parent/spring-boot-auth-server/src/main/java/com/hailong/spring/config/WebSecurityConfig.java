package com.hailong.spring.config;

import com.hailong.spring.filter.JwtLoginFilter;
import com.hailong.spring.filter.JwtVerifyFilter;
import com.hailong.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)  //开启方法的权限认证
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private UserService userService;

    @Autowired
    private RsaKeyProperties properties;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable()
            .authorizeRequests()
                .antMatchers("/product").hasAnyRole("USER")
                .anyRequest()
                .authenticated() //除了静态资源外，其他资源都需要经过认证
                .and()
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .permitAll()
                .and()
                .addFilter(new JwtLoginFilter(super.authenticationManager(),properties))
                .addFilter(new JwtVerifyFilter(super.authenticationManager(),properties))
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}


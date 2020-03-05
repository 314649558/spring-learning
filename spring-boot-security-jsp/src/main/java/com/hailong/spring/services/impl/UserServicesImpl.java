package com.hailong.spring.services.impl;

import com.hailong.spring.mapper.SysUserMapper;
import com.hailong.spring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2020/3/1.
 */
@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return sysUserMapper.findByUserName(s);
    }
}

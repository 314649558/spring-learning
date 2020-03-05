package com.hailong.spring.mapper;

import com.hailong.spring.domain.SysUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2020/3/1.
 */
public interface SysUserMapper {

    @Select("select * from sys_user where username=#{username}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "roles",column = "id",javaType = List.class,
            many = @Many(select = "com.hailong.spring.mapper.SysRoleMapper.findByUid"))
    })
    public SysUser findByUserName(String username);
}

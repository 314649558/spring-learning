package com.hailong.spring.mapper;

import com.hailong.spring.domain.SysRole;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2020/3/1.
 */
public interface SysRoleMapper extends Mapper<SysRole> {

    @Select("select " +
            "r.id," +
            "r.ROLE_NAME roleName," +
            "r.ROLE_DESC roleDesc " +
            "from sys_role r join sys_user_role ur " +
            "on (r.ID=ur.RID) where ur.UID=#{uid}")
    public List<SysRole> findByUid(Integer uid);

}

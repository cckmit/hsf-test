package com.hsf.mapper.shiro;

import com.hsf.model.UUserRole;

public interface UUserRoleMapper {
    int insert(UUserRole record);

    int insertSelective(UUserRole record);
}
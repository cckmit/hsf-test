package com.hsf.mapper.shiro;

import com.hsf.model.URolePermission;

public interface URolePermissionMapper {
    int insert(URolePermission record);

    int insertSelective(URolePermission record);
}
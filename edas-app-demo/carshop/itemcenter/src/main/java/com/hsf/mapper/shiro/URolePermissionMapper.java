package com.hsf.mapper.shiro;

import com.hsf.model.URolePermission;
import com.hsf.model.URolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URolePermissionMapper {
    long countByExample(URolePermissionExample example);

    int deleteByExample(URolePermissionExample example);

    int insert(URolePermission record);

    int insertSelective(URolePermission record);

    List<URolePermission> selectByExample(URolePermissionExample example);

    int updateByExampleSelective(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);

    int updateByExample(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);
}
package com.sh.service.impl;

import com.sh.entities.RolePermission;
import com.sh.mappers.RolePermissionDynamicSqlSupport;
import com.sh.mappers.RolePermissionMapper;
import com.sh.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public List<RolePermission> getRolePermissionByRoleId(BigInteger roleId) {
        return rolePermissionMapper.selectByExample()
                .where(RolePermissionDynamicSqlSupport.roleId, isEqualTo(roleId))
                .build()
                .execute();
    }
}

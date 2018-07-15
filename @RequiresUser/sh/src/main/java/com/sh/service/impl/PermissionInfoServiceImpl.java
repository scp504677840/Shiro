package com.sh.service.impl;

import com.sh.entities.PermissionInfo;
import com.sh.mappers.PermissionInfoDynamicSqlSupport;
import com.sh.mappers.PermissionInfoMapper;
import com.sh.service.PermissionInfoService;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

import static com.sh.mappers.PermissionInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class PermissionInfoServiceImpl implements PermissionInfoService {

    @Autowired
    private PermissionInfoMapper permissionInfoMapper;

    @Override
    public PermissionInfo getPermissionInfoById(BigInteger id) {
        SelectStatementProvider selectStatement = select(PermissionInfoDynamicSqlSupport.id, gmtCreate, gmtModified, name)
                .from(permissionInfo)
                .where(PermissionInfoDynamicSqlSupport.id, isEqualTo(id))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        return permissionInfoMapper.selectOne(selectStatement);
    }
}

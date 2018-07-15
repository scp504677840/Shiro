package com.sh.service.impl;

import com.sh.entities.RoleInfo;
import com.sh.mappers.RoleInfoDynamicSqlSupport;
import com.sh.mappers.RoleInfoMapper;
import com.sh.service.RoleInfoService;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

import static com.sh.mappers.RoleInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class RoleInfoServiceImpl implements RoleInfoService {

    @Autowired
    private RoleInfoMapper roleInfoMapper;

    @Override
    public RoleInfo getRoleInfoById(BigInteger id) {
        SelectStatementProvider selectStatement = select(RoleInfoDynamicSqlSupport.id, gmtCreate, gmtModified, name)
                .from(roleInfo)
                .where(RoleInfoDynamicSqlSupport.id, isEqualTo(id))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        return roleInfoMapper.selectOne(selectStatement);
    }
}

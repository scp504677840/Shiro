package com.sh.service.impl;

import com.sh.entities.UserRole;
import com.sh.mappers.UserRoleDynamicSqlSupport;
import com.sh.mappers.UserRoleMapper;
import com.sh.service.UserRoleService;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

import static com.sh.mappers.UserRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Override
    public UserRole getUserRoleByUserId(BigInteger userId) {
        SelectStatementProvider selectStatement = select(id, gmtCreate, gmtModified, UserRoleDynamicSqlSupport.userId, roleId)
                .from(userRole)
                .where(UserRoleDynamicSqlSupport.userId, isEqualTo(userId))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        return userRoleMapper.selectOne(selectStatement);
    }
}

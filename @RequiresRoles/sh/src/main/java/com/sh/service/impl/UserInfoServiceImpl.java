package com.sh.service.impl;

import com.sh.mappers.UserInfoDynamicSqlSupport;
import com.sh.mappers.UserInfoMapper;
import com.sh.service.UserInfoService;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sh.entities.UserInfo;

import static com.sh.mappers.UserInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public Boolean saveUserInfo(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo) > 0;
    }

    /**
     * 根据用户名查询用户
     *
     * @param name 用户名
     * @return
     */
    @Override
    public UserInfo getUserInfoByName(String name) {
        SelectStatementProvider statement = select(id, gmtCreate, gmtModified, UserInfoDynamicSqlSupport.name, password)
                .from(userInfo)
                .where(UserInfoDynamicSqlSupport.name, isEqualTo(name))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        return userInfoMapper.selectOne(statement);
    }
}

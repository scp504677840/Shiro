package com.sh.mappers;

import static com.sh.mappers.UserInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sh.entities.UserInfo;
import java.math.BigInteger;
import java.util.List;
import javax.annotation.processing.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.delete.DeleteDSL;
import org.mybatis.dynamic.sql.delete.MyBatis3DeleteModelAdapter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.MyBatis3SelectModelAdapter;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectDSL;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.MyBatis3UpdateModelAdapter;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface UserInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.839903+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.841858+08:00", comments="Source Table: user_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.842975+08:00", comments="Source Table: user_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=BigInteger.class)
    int insert(InsertStatementProvider<UserInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.84552+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserInfoResult")
    UserInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.847145+08:00", comments="Source Table: user_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR)
    })
    List<UserInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.849307+08:00", comments="Source Table: user_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.850406+08:00", comments="Source Table: user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.85113+08:00", comments="Source Table: user_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.851808+08:00", comments="Source Table: user_info")
    default int deleteByPrimaryKey(BigInteger id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.8533+08:00", comments="Source Table: user_info")
    default int insert(UserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userInfo)
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(name).toProperty("name")
                .map(password).toProperty("password")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.854894+08:00", comments="Source Table: user_info")
    default int insertSelective(UserInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(userInfo)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .map(password).toPropertyWhenPresent("password", record::getPassword)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.856102+08:00", comments="Source Table: user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, gmtCreate, gmtModified, name, password)
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.857358+08:00", comments="Source Table: user_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, gmtCreate, gmtModified, name, password)
                .from(userInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.858758+08:00", comments="Source Table: user_info")
    default UserInfo selectByPrimaryKey(BigInteger id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, gmtCreate, gmtModified, name, password)
                .from(userInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.8602+08:00", comments="Source Table: user_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(name).equalTo(record::getName)
                .set(password).equalTo(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.862316+08:00", comments="Source Table: user_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(name).equalToWhenPresent(record::getName)
                .set(password).equalToWhenPresent(record::getPassword);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.863797+08:00", comments="Source Table: user_info")
    default int updateByPrimaryKey(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(name).equalTo(record::getName)
                .set(password).equalTo(record::getPassword)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.864873+08:00", comments="Source Table: user_info")
    default int updateByPrimaryKeySelective(UserInfo record) {
        return UpdateDSL.updateWithMapper(this::update, userInfo)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(name).equalToWhenPresent(record::getName)
                .set(password).equalToWhenPresent(record::getPassword)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
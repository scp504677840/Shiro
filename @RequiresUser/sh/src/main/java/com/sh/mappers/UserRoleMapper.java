package com.sh.mappers;

import static com.sh.mappers.UserRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sh.entities.UserRole;
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
public interface UserRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.885876+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.886012+08:00", comments="Source Table: user_role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.886238+08:00", comments="Source Table: user_role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=BigInteger.class)
    int insert(InsertStatementProvider<UserRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.886436+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserRoleResult")
    UserRole selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.886649+08:00", comments="Source Table: user_role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserRoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="role_id", property="roleId", jdbcType=JdbcType.BIGINT)
    })
    List<UserRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.886917+08:00", comments="Source Table: user_role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887071+08:00", comments="Source Table: user_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(userRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887264+08:00", comments="Source Table: user_role")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, userRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887408+08:00", comments="Source Table: user_role")
    default int deleteByPrimaryKey(BigInteger id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, userRole)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887546+08:00", comments="Source Table: user_role")
    default int insert(UserRole record) {
        return insert(SqlBuilder.insert(record)
                .into(userRole)
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(userId).toProperty("userId")
                .map(roleId).toProperty("roleId")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887708+08:00", comments="Source Table: user_role")
    default int insertSelective(UserRole record) {
        return insert(SqlBuilder.insert(record)
                .into(userRole)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(userId).toPropertyWhenPresent("userId", record::getUserId)
                .map(roleId).toPropertyWhenPresent("roleId", record::getRoleId)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.887895+08:00", comments="Source Table: user_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserRole>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, gmtCreate, gmtModified, userId, roleId)
                .from(userRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.888195+08:00", comments="Source Table: user_role")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<UserRole>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, gmtCreate, gmtModified, userId, roleId)
                .from(userRole);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.888411+08:00", comments="Source Table: user_role")
    default UserRole selectByPrimaryKey(BigInteger id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, gmtCreate, gmtModified, userId, roleId)
                .from(userRole)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.888546+08:00", comments="Source Table: user_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(UserRole record) {
        return UpdateDSL.updateWithMapper(this::update, userRole)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(userId).equalTo(record::getUserId)
                .set(roleId).equalTo(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88873+08:00", comments="Source Table: user_role")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(UserRole record) {
        return UpdateDSL.updateWithMapper(this::update, userRole)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(roleId).equalToWhenPresent(record::getRoleId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.888926+08:00", comments="Source Table: user_role")
    default int updateByPrimaryKey(UserRole record) {
        return UpdateDSL.updateWithMapper(this::update, userRole)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(userId).equalTo(record::getUserId)
                .set(roleId).equalTo(record::getRoleId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.889093+08:00", comments="Source Table: user_role")
    default int updateByPrimaryKeySelective(UserRole record) {
        return UpdateDSL.updateWithMapper(this::update, userRole)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(userId).equalToWhenPresent(record::getUserId)
                .set(roleId).equalToWhenPresent(record::getRoleId)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
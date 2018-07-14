package com.sh.mappers;

import static com.sh.mappers.PermissionInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.sh.entities.PermissionInfo;
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
public interface PermissionInfoMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878234+08:00", comments="Source Table: permission_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878369+08:00", comments="Source Table: permission_info")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878504+08:00", comments="Source Table: permission_info")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=BigInteger.class)
    int insert(InsertStatementProvider<PermissionInfo> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878689+08:00", comments="Source Table: permission_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PermissionInfoResult")
    PermissionInfo selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878861+08:00", comments="Source Table: permission_info")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PermissionInfoResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<PermissionInfo> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.87913+08:00", comments="Source Table: permission_info")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.879266+08:00", comments="Source Table: permission_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<Long>> countByExample() {
        return SelectDSL.selectWithMapper(this::count, SqlBuilder.count())
                .from(permissionInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.87944+08:00", comments="Source Table: permission_info")
    default DeleteDSL<MyBatis3DeleteModelAdapter<Integer>> deleteByExample() {
        return DeleteDSL.deleteFromWithMapper(this::delete, permissionInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.879657+08:00", comments="Source Table: permission_info")
    default int deleteByPrimaryKey(BigInteger id_) {
        return DeleteDSL.deleteFromWithMapper(this::delete, permissionInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.879811+08:00", comments="Source Table: permission_info")
    default int insert(PermissionInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(permissionInfo)
                .map(gmtCreate).toProperty("gmtCreate")
                .map(gmtModified).toProperty("gmtModified")
                .map(name).toProperty("name")
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.879956+08:00", comments="Source Table: permission_info")
    default int insertSelective(PermissionInfo record) {
        return insert(SqlBuilder.insert(record)
                .into(permissionInfo)
                .map(gmtCreate).toPropertyWhenPresent("gmtCreate", record::getGmtCreate)
                .map(gmtModified).toPropertyWhenPresent("gmtModified", record::getGmtModified)
                .map(name).toPropertyWhenPresent("name", record::getName)
                .build()
                .render(RenderingStrategy.MYBATIS3));
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.880169+08:00", comments="Source Table: permission_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<PermissionInfo>>> selectByExample() {
        return SelectDSL.selectWithMapper(this::selectMany, id, gmtCreate, gmtModified, name)
                .from(permissionInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88037+08:00", comments="Source Table: permission_info")
    default QueryExpressionDSL<MyBatis3SelectModelAdapter<List<PermissionInfo>>> selectDistinctByExample() {
        return SelectDSL.selectDistinctWithMapper(this::selectMany, id, gmtCreate, gmtModified, name)
                .from(permissionInfo);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.880543+08:00", comments="Source Table: permission_info")
    default PermissionInfo selectByPrimaryKey(BigInteger id_) {
        return SelectDSL.selectWithMapper(this::selectOne, id, gmtCreate, gmtModified, name)
                .from(permissionInfo)
                .where(id, isEqualTo(id_))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.880712+08:00", comments="Source Table: permission_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExample(PermissionInfo record) {
        return UpdateDSL.updateWithMapper(this::update, permissionInfo)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(name).equalTo(record::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.880909+08:00", comments="Source Table: permission_info")
    default UpdateDSL<MyBatis3UpdateModelAdapter<Integer>> updateByExampleSelective(PermissionInfo record) {
        return UpdateDSL.updateWithMapper(this::update, permissionInfo)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(name).equalToWhenPresent(record::getName);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.881145+08:00", comments="Source Table: permission_info")
    default int updateByPrimaryKey(PermissionInfo record) {
        return UpdateDSL.updateWithMapper(this::update, permissionInfo)
                .set(gmtCreate).equalTo(record::getGmtCreate)
                .set(gmtModified).equalTo(record::getGmtModified)
                .set(name).equalTo(record::getName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.881325+08:00", comments="Source Table: permission_info")
    default int updateByPrimaryKeySelective(PermissionInfo record) {
        return UpdateDSL.updateWithMapper(this::update, permissionInfo)
                .set(gmtCreate).equalToWhenPresent(record::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(record::getGmtModified)
                .set(name).equalToWhenPresent(record::getName)
                .where(id, isEqualTo(record::getId))
                .build()
                .execute();
    }
}
package com.sh.mappers;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RolePermissionDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.892216+08:00", comments="Source Table: role_permission")
    public static final RolePermission rolePermission = new RolePermission();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.892658+08:00", comments="Source field: role_permission.id")
    public static final SqlColumn<BigInteger> id = rolePermission.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.892876+08:00", comments="Source field: role_permission.gmt_create")
    public static final SqlColumn<Timestamp> gmtCreate = rolePermission.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.893154+08:00", comments="Source field: role_permission.gmt_modified")
    public static final SqlColumn<Timestamp> gmtModified = rolePermission.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.89336+08:00", comments="Source field: role_permission.role_id")
    public static final SqlColumn<BigInteger> roleId = rolePermission.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.89356+08:00", comments="Source field: role_permission.permission_id")
    public static final SqlColumn<BigInteger> permissionId = rolePermission.permissionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.892449+08:00", comments="Source Table: role_permission")
    public static final class RolePermission extends SqlTable {
        public final SqlColumn<BigInteger> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Timestamp> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Timestamp> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<BigInteger> roleId = column("role_id", JDBCType.BIGINT);

        public final SqlColumn<BigInteger> permissionId = column("permission_id", JDBCType.BIGINT);

        public RolePermission() {
            super("role_permission");
        }
    }
}
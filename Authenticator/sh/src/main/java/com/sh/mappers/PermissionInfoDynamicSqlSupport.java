package com.sh.mappers;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PermissionInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876946+08:00", comments="Source Table: permission_info")
    public static final PermissionInfo permissionInfo = new PermissionInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.877402+08:00", comments="Source field: permission_info.id")
    public static final SqlColumn<BigInteger> id = permissionInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.877616+08:00", comments="Source field: permission_info.gmt_create")
    public static final SqlColumn<Timestamp> gmtCreate = permissionInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.877836+08:00", comments="Source field: permission_info.gmt_modified")
    public static final SqlColumn<Timestamp> gmtModified = permissionInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.878044+08:00", comments="Source field: permission_info.name")
    public static final SqlColumn<String> name = permissionInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.877201+08:00", comments="Source Table: permission_info")
    public static final class PermissionInfo extends SqlTable {
        public final SqlColumn<BigInteger> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Timestamp> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Timestamp> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public PermissionInfo() {
            super("permission_info");
        }
    }
}
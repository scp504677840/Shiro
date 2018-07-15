package com.sh.mappers;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.884051+08:00", comments="Source Table: user_role")
    public static final UserRole userRole = new UserRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.884513+08:00", comments="Source field: user_role.id")
    public static final SqlColumn<BigInteger> id = userRole.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.884781+08:00", comments="Source field: user_role.gmt_create")
    public static final SqlColumn<Timestamp> gmtCreate = userRole.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.885191+08:00", comments="Source field: user_role.gmt_modified")
    public static final SqlColumn<Timestamp> gmtModified = userRole.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88541+08:00", comments="Source field: user_role.user_id")
    public static final SqlColumn<BigInteger> userId = userRole.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.885648+08:00", comments="Source field: user_role.role_id")
    public static final SqlColumn<BigInteger> roleId = userRole.roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.884361+08:00", comments="Source Table: user_role")
    public static final class UserRole extends SqlTable {
        public final SqlColumn<BigInteger> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Timestamp> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Timestamp> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<BigInteger> userId = column("user_id", JDBCType.BIGINT);

        public final SqlColumn<BigInteger> roleId = column("role_id", JDBCType.BIGINT);

        public UserRole() {
            super("user_role");
        }
    }
}
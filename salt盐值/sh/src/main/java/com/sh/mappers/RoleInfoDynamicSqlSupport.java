package com.sh.mappers;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class RoleInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.867083+08:00", comments="Source Table: role_info")
    public static final RoleInfo roleInfo = new RoleInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.867522+08:00", comments="Source field: role_info.id")
    public static final SqlColumn<BigInteger> id = roleInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.867744+08:00", comments="Source field: role_info.gmt_create")
    public static final SqlColumn<Timestamp> gmtCreate = roleInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.867962+08:00", comments="Source field: role_info.gmt_modified")
    public static final SqlColumn<Timestamp> gmtModified = roleInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.868254+08:00", comments="Source field: role_info.name")
    public static final SqlColumn<String> name = roleInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.867333+08:00", comments="Source Table: role_info")
    public static final class RoleInfo extends SqlTable {
        public final SqlColumn<BigInteger> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Timestamp> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Timestamp> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public RoleInfo() {
            super("role_info");
        }
    }
}
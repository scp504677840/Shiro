package com.sh.mappers;

import java.math.BigInteger;
import java.sql.JDBCType;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserInfoDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.834863+08:00", comments="Source Table: user_info")
    public static final UserInfo userInfo = new UserInfo();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.836271+08:00", comments="Source field: user_info.id")
    public static final SqlColumn<BigInteger> id = userInfo.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.837426+08:00", comments="Source field: user_info.gmt_create")
    public static final SqlColumn<Timestamp> gmtCreate = userInfo.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.837734+08:00", comments="Source field: user_info.gmt_modified")
    public static final SqlColumn<Timestamp> gmtModified = userInfo.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.838101+08:00", comments="Source field: user_info.name")
    public static final SqlColumn<String> name = userInfo.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.838339+08:00", comments="Source field: user_info.password")
    public static final SqlColumn<String> password = userInfo.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.835506+08:00", comments="Source Table: user_info")
    public static final class UserInfo extends SqlTable {
        public final SqlColumn<BigInteger> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Timestamp> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Timestamp> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public UserInfo() {
            super("user_info");
        }
    }
}
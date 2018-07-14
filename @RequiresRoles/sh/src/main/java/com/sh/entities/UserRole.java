package com.sh.entities;

import java.math.BigInteger;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;

public class UserRole {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88184+08:00", comments="Source field: user_role.id")
    private BigInteger id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882299+08:00", comments="Source field: user_role.gmt_create")
    private Timestamp gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88271+08:00", comments="Source field: user_role.gmt_modified")
    private Timestamp gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883121+08:00", comments="Source field: user_role.user_id")
    private BigInteger userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883536+08:00", comments="Source field: user_role.role_id")
    private BigInteger roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882+08:00", comments="Source field: user_role.id")
    public BigInteger getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88218+08:00", comments="Source field: user_role.id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882429+08:00", comments="Source field: user_role.gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882561+08:00", comments="Source field: user_role.gmt_create")
    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882846+08:00", comments="Source field: user_role.gmt_modified")
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.882996+08:00", comments="Source field: user_role.gmt_modified")
    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883256+08:00", comments="Source field: user_role.user_id")
    public BigInteger getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883414+08:00", comments="Source field: user_role.user_id")
    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883678+08:00", comments="Source field: user_role.role_id")
    public BigInteger getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.883826+08:00", comments="Source field: user_role.role_id")
    public void setRoleId(BigInteger roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", userId=" + userId +
                ", roleId=" + roleId +
                '}';
    }
}
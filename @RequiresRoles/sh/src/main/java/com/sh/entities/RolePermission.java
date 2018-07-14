package com.sh.entities;

import java.math.BigInteger;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;

public class RolePermission {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.889605+08:00", comments="Source field: role_permission.id")
    private BigInteger id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.89028+08:00", comments="Source field: role_permission.gmt_create")
    private Timestamp gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.890727+08:00", comments="Source field: role_permission.gmt_modified")
    private Timestamp gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891163+08:00", comments="Source field: role_permission.role_id")
    private BigInteger roleId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891666+08:00", comments="Source field: role_permission.permission_id")
    private BigInteger permissionId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.88993+08:00", comments="Source field: role_permission.id")
    public BigInteger getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.890147+08:00", comments="Source field: role_permission.id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.890437+08:00", comments="Source field: role_permission.gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.890591+08:00", comments="Source field: role_permission.gmt_create")
    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.890883+08:00", comments="Source field: role_permission.gmt_modified")
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891031+08:00", comments="Source field: role_permission.gmt_modified")
    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891311+08:00", comments="Source field: role_permission.role_id")
    public BigInteger getRoleId() {
        return roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891449+08:00", comments="Source field: role_permission.role_id")
    public void setRoleId(BigInteger roleId) {
        this.roleId = roleId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891825+08:00", comments="Source field: role_permission.permission_id")
    public BigInteger getPermissionId() {
        return permissionId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.891988+08:00", comments="Source field: role_permission.permission_id")
    public void setPermissionId(BigInteger permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }
}
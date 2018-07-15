package com.sh.entities;

import javax.annotation.processing.Generated;
import java.math.BigInteger;
import java.sql.Timestamp;

public class PermissionInfo {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.874335+08:00", comments="Source field: permission_info.id")
    private BigInteger id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.875278+08:00", comments="Source field: permission_info.gmt_create")
    private Timestamp gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.875923+08:00", comments="Source field: permission_info.gmt_modified")
    private Timestamp gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876358+08:00", comments="Source field: permission_info.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.874733+08:00", comments="Source field: permission_info.id")
    public BigInteger getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.875059+08:00", comments="Source field: permission_info.id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.875619+08:00", comments="Source field: permission_info.gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.875784+08:00", comments="Source field: permission_info.gmt_create")
    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876072+08:00", comments="Source field: permission_info.gmt_modified")
    public Timestamp getGmtModified() {
        return gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876225+08:00", comments="Source field: permission_info.gmt_modified")
    public void setGmtModified(Timestamp gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876535+08:00", comments="Source field: permission_info.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2018-07-14T16:01:21.876709+08:00", comments="Source field: permission_info.name")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "PermissionInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", name='" + name + '\'' +
                '}';
    }
}
package com.sh.service;

import com.sh.entities.RolePermission;

import java.math.BigInteger;
import java.util.List;

public interface RolePermissionService {

    List<RolePermission> getRolePermissionByRoleId(BigInteger roleId);
}

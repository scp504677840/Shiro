package com.sh.service;

import com.sh.entities.PermissionInfo;

import java.math.BigInteger;

public interface PermissionInfoService {

    PermissionInfo getPermissionInfoById(BigInteger id);
}

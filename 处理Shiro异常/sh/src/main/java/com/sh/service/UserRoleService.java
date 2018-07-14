package com.sh.service;

import com.sh.entities.UserRole;

import java.math.BigInteger;

public interface UserRoleService {

    UserRole getUserRoleByUserId(BigInteger userId);
}

package com.sh.service;

import com.sh.entities.UserInfo;

public interface UserInfoService {

    Boolean saveUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByName(String name);
}

package com.sh.controller;

import com.sh.entities.UserInfo;
import com.sh.service.UserInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 获取用户信息
     *
     * 安全限制
     * 1.@RequiresRoles 角色限制
     * 2.@RequiresPermissions 权限限制
     *
     * @return
     */
    @RequiresRoles("VIP3")
    @RequiresPermissions("query")
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo() {
        return userInfoService.getUserInfoByName("Tom");
    }

    /**
     * 只需要指定自定义登录界面
     * 对于Android、IOS等其他终端来说，返回Json即可。
     *
     * @return
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 指定自定义错误页面
     *
     * @return
     */
    @PostMapping("/error")
    public String error() {
        return "error";
    }

}

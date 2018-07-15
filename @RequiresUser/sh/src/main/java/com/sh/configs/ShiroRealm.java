package com.sh.configs;

import com.sh.entities.*;
import com.sh.service.*;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 实现AuthorizingRealm接口用户用户认证
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private RoleInfoService roleInfoService;

    @Autowired
    private RolePermissionService rolePermissionService;

    @Autowired
    private PermissionInfoService permissionInfoService;



    /**
     * 角色权限和对应权限添加
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //获取登录用户名
        String name = (String) principals.getPrimaryPrincipal();
        //根据用户名查询用户
        UserInfo userInfo = userInfoService.getUserInfoByName(name);
        //根据用户Id查询相关联的角色Id
        UserRole userRole = userRoleService.getUserRoleByUserId(userInfo.getId());
        //根据角色Id查询角色信息
        RoleInfo roleInfo = roleInfoService.getRoleInfoById(userRole.getId());
        //根据角色Id查询相关联的权限Id列表
        List<RolePermission> permissions = rolePermissionService.getRolePermissionByRoleId(roleInfo.getId());
        //遍历权限Id列表依次查询权限信息
        ArrayList<PermissionInfo> permissionInfos = permissions.stream()
                .map(RolePermission::getPermissionId)
                .map(id -> permissionInfoService.getPermissionInfoById(id))
                .collect(Collectors.toCollection(ArrayList::new));
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加角色
        simpleAuthorizationInfo.addRole(roleInfo.getName());
        permissionInfos.forEach(permissionInfo -> {
            //添加权限
            simpleAuthorizationInfo.addStringPermission(permissionInfo.getName());
        });
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后再到请求
        if (token.getPrincipal() == null) {
            return null;
        }

        //获取用户信息
        String name = token.getPrincipal().toString();
        UserInfo userInfo = userInfoService.getUserInfoByName(name);
        if (userInfo == null) {
            //这里返回后会报出对应异常
            return null;
        }

        //这里验证authenticationToken和simpleAuthenticationInfo的信息
        //带盐值
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(name,userInfo.getPassword(), ByteSource.Util.bytes(name),getName());
        return info;
    }

}

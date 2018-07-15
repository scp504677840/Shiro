package com.sh.configs;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * TextRealm
 * 假设场景：多数据库，多种加密方式。例如下面两种情况：
 * ShiroRealm用的是mysql数据库，MD5加密。
 * TextRealm用的是oracle数据库，SHA1加密。
 * 这时就可以使用Shiro的多Realm解决。
 *
 * 需要注意的方法：
 * org.apache.shiro.authc.pam.ModularRealmAuthenticator#doAuthenticate(org.apache.shiro.authc.AuthenticationToken)
 * 获取多个Realm
 * Collection<Realm> realms = getRealms();
 * 多个Realm就存在认证问题，所以需要使用到认证策略：
 * ModularRealmAuthenticator认证器
 * 详情参看{@link ShiroConfig#authenticator()}
 *
 * @see ShiroConfig#authenticator()
 * @see ShiroConfig#securityManager()
 */
public class TextRealm extends AuthorizingRealm {

    /**
     * 角色权限和对应权限添加
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //添加角色
        simpleAuthorizationInfo.addRole("VIP1");
        //添加权限
        simpleAuthorizationInfo.addStringPermission("save");
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
        if (name == null || "".equals(name)) {
            //这里返回后会报出对应异常
            return null;
        }

        //这里验证authenticationToken和simpleAuthenticationInfo的信息
        //带盐值
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(name, "123456", ByteSource.Util.bytes(name), getName());
        return info;
    }

}

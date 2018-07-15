package com.sh.configs;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authc.pam.AtLeastOneSuccessfulStrategy;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Shiro配置类
 */
@Configuration
public class ShiroConfig {

    /**
     * 配置自定义Realm
     *
     * @return
     */
    @Bean
    public ShiroRealm shiroRealm() {
        ShiroRealm shiroRealm = new ShiroRealm();
        HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
        //指定MD5加密
        hcm.setHashAlgorithmName("MD5");
        //指定加密的次数
        hcm.setHashIterations(1024);
        shiroRealm.setCredentialsMatcher(hcm);
        return shiroRealm;
    }

    @Bean
    public TextRealm textRealm() {
        TextRealm textRealm = new TextRealm();
        HashedCredentialsMatcher hcm = new HashedCredentialsMatcher();
        //指定MD5加密
        hcm.setHashAlgorithmName("MD5");
        //指定加密的次数
        hcm.setHashIterations(1024);
        textRealm.setCredentialsMatcher(hcm);
        return textRealm;
    }

    /**
     * 认证器
     *
     * @return ModularRealmAuthenticator
     */
    @Bean
    public ModularRealmAuthenticator authenticator() {
        ModularRealmAuthenticator authenticator = new ModularRealmAuthenticator();
        authenticator.setRealms(Arrays.asList(shiroRealm(), textRealm()));
        //AllSuccessfulStrategy：都得验证通过
        //AtLeastOneSuccessfulStrategy：至少有一个认证通过
        //FirstSuccessfulStrategy：只要第一个验证通过，后面的就不再继续认证。
        authenticator.setAuthenticationStrategy(new AtLeastOneSuccessfulStrategy());
        return authenticator;
    }

    /**
     * Web工程返回类型及返回值必须是DefaultWebSecurityManager
     *
     * @return
     */
    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //设置了authenticator之后，就不必单独设置Realm。
        //securityManager.setRealm(shiroRealm());
        securityManager.setAuthenticator(authenticator());
        return securityManager;
    }

    /**
     * Filter工厂，设置对应的过滤条件和跳转条件
     *
     * @return
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilter() {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(securityManager());
        //登录
        shiroFilterFactoryBean.setLoginUrl("/login");
        //登录成功之后的页面
        shiroFilterFactoryBean.setSuccessUrl("/index");
        //无权限的URL，可以配置403页面
        shiroFilterFactoryBean.setUnauthorizedUrl("/error");

        //设置过滤规则
        Map<String, String> filterChainDefinitionMap = new HashMap<>();
        //登出请求
        filterChainDefinitionMap.put("/logout", "logout");
        //显示错误信息不拦截
        filterChainDefinitionMap.put("/error", "anon");
        //对其他所有请求都必须经过用户认证
        filterChainDefinitionMap.put("/**", "authc");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

        return shiroFilterFactoryBean;
    }


}

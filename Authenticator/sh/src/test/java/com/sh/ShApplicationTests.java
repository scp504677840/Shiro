package com.sh;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ShApplicationTests {

    @Test
    public void contextLoads() {
        try {
            List<String> warnings = new ArrayList<>();
            boolean overwrite = true;
            File configFile = new File("/Users/scp/Documents/Workspace/Java/sh/src/main/resources/mbg.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (IOException | SQLException | InterruptedException | XMLParserException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    /*@Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testSelectOne() {
        SelectStatementProvider ss = select(id, gmtCreate, gmtModified, name, password)
                .from(userInfo)
                .where(name, isEqualTo("Tom"))
                .build()
                .render(RenderingStrategy.MYBATIS3);
        UserInfo userInfo = userInfoMapper.selectOne(ss);
        System.out.println(userInfo);
    }*/

    /**
     * 为什么需要盐值？
     * 因为我们要求即使用户的密码相同，如tom和jack的密码都是123456，
     * 但他们但加密后的密码不一样（123456经过MD5加密后的结果是一样的），
     * 这就需要盐值。
     * 如何得到盐值？
     * Object salt = ByteSource.Util.bytes("Tom");
     * bytes参数是什么？
     * 用户名。因为每个用户的用户名都不同，所以这里放用户名再适合不过了。
     */
    @Test
    public void testMD5() {
        String algorithmName = "MD5";
        Object source = "123456";
        //盐值
        Object salt = ByteSource.Util.bytes("Tom");
        int hashIterations = 1024;
        SimpleHash simpleHash = new SimpleHash(algorithmName, source, salt, hashIterations);
        System.out.println(simpleHash);
    }

}

package com.zp.project.anno.service;


import com.zp.config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用Junit单元测试，测试配置
 * Spring整合Junit的配置
 * 1.导入spring整合junit的jar（坐标）spring-test
 * 2.使用junit整合一个注解把原有的main方法替换了，并说明位置
 * @RunWith <p></p>
 * 3.告知spring的运行容器，spring和ioc创建是基于xml还是注解，并说明位置
 * @ContextConfiguration <p></p>
 * locations:指定xml文件的位置，加上classpath关键字，表示在类路径下
 * classes：指定注解类所在的文件
 *
 * spring 5.x版本 要求junit的jar必须是4.12及以上版本
 *  * Caused by: java.lang.IllegalStateException: SpringJUnit4ClassRunner requires JUnit 4.12 or higher.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class TestAnno {

    @Autowired
    private IAccountService as;

    @Test
    public void testFindAllAccount() {
        as.findAllAccount().forEach(System.out::println);
    }
}

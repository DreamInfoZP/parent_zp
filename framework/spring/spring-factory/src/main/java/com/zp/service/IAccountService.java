package com.zp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 用于创建对象的
 *      类似xml中的<bean></bean>标签
 *      @Component
 *          作用：用于把当前类对象存入spring容器中
 *          属性：
 *              value：用于指定bean的id，当我们不写时，它默认是当前类名，且首字母小写
 *      @Controller
 *      @Service
 *      @Repository
 *      以上三个注解他们的作用和属性与Component是一摸一样的
 * 用于注入数据的
 *      类似xml中的bean标签中<propertie></propertie>标签
 *      @Autowired  [通过数据类型注入]
 *          作用：自动按照类型注入。只要容器中有唯一的bean对象类型和主要的变量类型匹配，就可以注入成功
 *                  如果ioc容器中有多个类型匹配时：再去匹配key如果一样那么就报错
 *          出现位置：
 *              可以是变量上也可以是方法上
 *          细节：
 *              在使用注解注入时，set方法就不是必须的了
 *       @Qualifier
 *          作用：在按照类中注入的基础上再按照名称注入。他再给类成员注入时不能单独使用。但是在给方法参数注入时可以
 *          属性：
 *              value 用于指定注入的bean的id
 *       @Resource
 *          作用：直接按照bean的id注入。它可以独立使用
 *          属性
 *              name：用于指定bean的属性id
 *       以上三个注解都只能注入其他的bean类型的数据，儿基本类型和String类型无法使用上述注解实现
 *       另外，集合类型的注入只能通过xml来实现
 *
 *       @Value
 *          作用：用于注入基本类型和String类型的数据
 *          属性：
 *              value：用于指定数据的值。它可以实现spring的spEl
 *                      spEl的写法：${表达式}
 *
 *
 * 用于改变作用范围的
 *      类似xml中的bean标签中的scpoe属性一样
 *      @Scope
 *          作用：用于指定bean的作用范围
 *          属性：
 *            value:指定范围的取值，常用的取值prototype、singleton
 * 和生命周期相关的注解
 *      类似xml中的bean标签中的init-method和destory-method作用一样
 *      @PreDestroy
 *          作用：用于指定销毁方法
 *      @PostConstruct
 *          作用：用于指定初始化方法
 */
@Component
public interface IAccountService {
    void saveAccount();
}

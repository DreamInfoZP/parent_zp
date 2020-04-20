package com.zp.proxy;

import java.lang.reflect.Proxy;

/**
 * 动态代理：
 *      特点：字节码随用随创建，随用随加载
 *      作用：不修改源码的基础上对方法进行增强
 *      分类：
 *          基于接口的动态代理
 *          基于子类的动态代理
 *      基于接口的动态代理
 *          涉及的类：Proxy
 *          提供者：JDK
 *      如何创建代理对象
 *          Proxy类中的newProxyInstance方法
 *      创建代理对象要求
 *          被代理的对象最少实现一个接口，如果没有则不能使用
 *      newProxyInstance方法参数
 *              ClassLoader loader,类加载器
 *                  它用于加载代理对象字节码和代理对象使用相同的类加载器。固定写法
 *              Class<?>[] interfaces,字节码数组
 *                  它用于代理对象和被代理对象相同的写法
 *              InvocationHandler h用于提供增强的代码
 *                  一般是写一个该接口的实现类，通常情况下都是匿名内部类，但不是必须的
 *                  谁用谁写
 */
public class Test {
    public static void main(String[] args) {
//        Proxy.newProxyInstance()newProxyInstance
    }
}

package com.zp.objects.reflect;

import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 写一个"框架"，不改变该类任何代码的前提下，可以帮助我们创建任意类对象，并执行其中的任意方法
 * 实现：
 * 1.配置文件
 * 2.反射
 * 步骤：
 * 1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 2.在程序中加载读取配置文件
 * 3.使用反射技术来加载类文件进内存
 * 4.创建对象
 * 5.执行方法
 *
 * @author zhoupeng
 */

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        // 类加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        pro.load(classLoader.getResourceAsStream("pro.properties"));
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls = Class.forName(className);
        Object obj = cls.newInstance();
        Method method = cls.getMethod(methodName, String.class);
        method.invoke(obj);


    }
}

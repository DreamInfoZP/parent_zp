package com.zp.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {
    private static Properties prop;

    // 定义一个Map，用于存放我们要创建的对象。称之为容器
    private static Map<String, Object> beans;

    static {
        try {
            prop = new Properties();
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            prop.load(in);
            Enumeration<Object> keys = prop.keys();
            beans = new HashMap<>();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                String beanPath = (String) prop.get(key);
                Object value = Class.forName(beanPath).newInstance();
                beans.put(key, value);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 此方法是单列
     *
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }

    /**
     * 此方法创建的是多例
     * @param beanName
     * @return
     */
//    public static Object getBean(String beanName) {
//        Object bean = null;
//        String beanPath = prop.getProperty(beanName);
//
//        try {
//            // 每次都会调用默认的构造函数创建对象
//            bean = Class.forName(beanPath).newInstance();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return bean;
//    }
}

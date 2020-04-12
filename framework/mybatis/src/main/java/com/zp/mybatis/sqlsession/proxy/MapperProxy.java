package com.zp.mybatis.sqlsession.proxy;

import com.zp.mybatis.cfg.Mapper;
import com.zp.mybatis.utils.Executor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.Map;

/**
 * @author zhoupeng
 */
public class MapperProxy implements InvocationHandler {

    private Map<String, Mapper> mappers;

    private Connection con;

    public MapperProxy(Map<String, Mapper> mappers, Connection con) {
        this.mappers = mappers;
        this.con = con;
    }

    public MapperProxy(Map<String, Mapper> mappers) {
        this.mappers = mappers;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 1.获取方法名
        String methodName = method.getName();
        // 2.获取方法所在类的名称
        String className = method.getDeclaringClass().getName();
        // 3.组合key
        String key = className + "." + methodName;
        // 4.获取mappers中的mapper对象
        Mapper mapper = mappers.get(key);
        if (mapper == null) {
            throw new IllegalArgumentException("传入的参数有误");
        }
        // 5.调用工具类执行查询所有

        return new Executor().selectList(mapper, con);
    }
}

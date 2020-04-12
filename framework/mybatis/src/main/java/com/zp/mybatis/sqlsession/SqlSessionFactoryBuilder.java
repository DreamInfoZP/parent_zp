package com.zp.mybatis.sqlsession;

import com.zp.mybatis.cfg.Configuration;
import com.zp.mybatis.sqlsession.defaults.DefaultSqlSessionFactoryImpl;
import com.zp.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @author zhoupeng
 * 用于创建SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     *
     * @param in
     * @return
     */
    public SqlSessionFactory build(InputStream in) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(in);
        return new DefaultSqlSessionFactoryImpl(cfg);
    }
}

package com.zp.mybatis.sqlsession.defaults;

import com.zp.mybatis.cfg.Configuration;
import com.zp.mybatis.sqlsession.SqlSession;
import com.zp.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author zhoupeng
 * <p>
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactoryImpl implements SqlSessionFactory {

    private Configuration cfg;

    public DefaultSqlSessionFactoryImpl(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     *
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSessionImpl(cfg);
    }
}

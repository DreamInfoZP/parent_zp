package com.zp.mybatis.sqlsession.defaults;

import com.zp.mybatis.cfg.Configuration;
import com.zp.mybatis.sqlsession.SqlSession;
import com.zp.mybatis.sqlsession.proxy.MapperProxy;
import com.zp.mybatis.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author zhoupeng
 * SqlSession接口的实现类
 */
public class DefaultSqlSessionImpl implements SqlSession {

    private Configuration cfg;

    private Connection con;

    public DefaultSqlSessionImpl(Configuration cfg) {
        this.cfg = cfg;
        this.con = DataSourceUtil.getConnection(cfg);
    }

    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        Proxy.newProxyInstance(daoInterfaceClass.getClassLoader(), new Class[]{daoInterfaceClass}, new MapperProxy(cfg.getMappers(), con));
        return null;
    }

    @Override
    public void close() {
        assert con != null;
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

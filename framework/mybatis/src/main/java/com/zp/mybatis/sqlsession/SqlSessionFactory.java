package com.zp.mybatis.sqlsession;

/**
 * @author zhoupeng
 * 用于创建一个SqlSession对象
 */
public interface SqlSessionFactory {

    /**
     * @return
     */
    SqlSession openSession();
}

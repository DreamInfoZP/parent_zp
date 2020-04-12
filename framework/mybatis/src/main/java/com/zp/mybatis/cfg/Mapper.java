package com.zp.mybatis.cfg;

import lombok.Data;

/**
 * @author zhoupeng
 * 用于封装执行的Sql语句和结果类型的全限定类名
 */
@Data
public class Mapper {

    /**
     * sql
     */
    private String queryString;

    /**
     * 实体类的全限定类名
     */
    private String resultType;
}

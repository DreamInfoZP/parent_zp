package com.zp.mybatis.cfg;

import lombok.Data;

import java.util.Map;

/**
 * @author zhoupeng
 * 存储数据库连接信息
 */
@Data
public class Configuration {

    private String driver;

    private String url;

    private String username;

    private String password;

    private Map<String, Mapper> mappers;

    public void setMappers(Map<String, Mapper> mappers) {
        // TODO 如果使用put
        this.mappers.putAll(mappers);
    }
}

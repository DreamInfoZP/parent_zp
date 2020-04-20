package com.zp.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @Configuration 作用：指定当前类是一个配置类
 * @ComponentScan 作用：用于通过注解指定spring在创建容器时需要扫描的包
 * 属性：
 * value：basePackage的作用是一样的，都是用于指定创建容器时要扫描的包
 * 等同于<context:componet-scan></context:componet-scan>
 * @Bean 作用：用于把当前方法的返回值作为bean对象存入spring的ioc容器中
 * 属性
 * name：用于指定bean的id，不写时，默认值是当前方法的名称
 * 细节：当我们使用注解方式配置方法时，如果方法有参数，spring框架会去容器中查找没有可用的bean对象
 * 查找的方式和Autowired注解是一样的
 * @Import 作用：用于导入其他的配置类
 * 属性：
 * value:用于指定其他配置类的字节码
 * 当我们使用Import的注解后，有Import注解的类是主配置类，而导入的都是子配置类
 * @PropertySource 作用：用于指定properties文件的位置
 * 属性：
 * value：用于指定其他配置类的字节码
 * 关键字：classpath，表示类路径
 */
@Configuration
@ComponentScan(basePackages = {"com.zp.project.anno"})
@Import(JdbcConfiguration.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration01 {

    @Bean(name = "runner")
    @Scope(value = "prototype")
    public QueryRunner createQueryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }

    @Bean
    public DataSource createDateSource() {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("com.mysql.cj.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/product_category?characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai");
            ds.setUser("root");
            ds.setPassword("root");
            return ds;
        } catch (Exception e) {
            throw new RuntimeException("创建数据库连接池失败");
        }
    }
}

## MyBatis

* 三层架构
  * 表现层：展示数据
  * 业务层：处理业务需求
  * 持久层：和数据库交互
* 持久层技术解决方案
  * JDBC技术
    * Connection
    * PreparedStatement
    * ResultSet
  * Spring的JdbcTemplate
    * Spring对Jdbc的简单封装
  * Apache的DBUtils
    * 它和Spring的JdbcTemplate类似，也是对Jdbc的简单封装
  * 但是这些都不是框架
    * JDBC是规范
    * Spring的JdbcTemplate和Apache的DBUtils都只是工具类

#### MyBatis的概述

* mybayis是一个持久层框架，用java编写
* 使用了ORM思想实现了对结果集的封装
  * ORM	Object Relational Mappping 对象关系映射

##### 注意事项

1. 创建IUserDao.xml和IUserDao.java时名称是为了保持一致，

   在MyBatis中他把持久层操作接口名称和映射文件也叫做：Mapper

   所以IUserDao和IUserMappper是一样的

2. 在idea中创建目录的时候，他和包不一样，

   包在创建的时：com.zp.dao它是三级目录

   目录在创建时：com.zp.dao它是一级目录

3. MyBatis的映射配置文件必须和dao接口的包结构相同

4. MyBatis的映射文件的mapper标签namespace属性的取值必须是dao接口的全限定类名

5. 映射配置文件的操作配置(select)，id属性的取值必须是dao接口的方法名

当我们满足3，4，5则不需要给接口体统实现类









* 

* 

* 

* ### JDBC

  **JDBC：**定义了一套操作所有关系型数据库的规则(接口)

  **数据库驱动：**对JDBC接口的实现

  步骤

  1. 倒入驱动
  2. 注册驱动
  3. 获取数据库连接对象Connection
  4. 定义sql
  5. 获取执行sql语句的对象Statement
  6. 执行sql，接受返回结果
  7. 处理结果
  8. 释放资源

* 

* 
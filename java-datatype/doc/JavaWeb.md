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



#### MyBatis中的连接池以及事务控制

1. 连接池

   * 实际开发时都会使用连接池，可以减少我们获取链接所消耗的时间

   * 连接池就是用于存储连接的一个容器
   * 容器其实就是一个集合对象，该集合必须是线程安全的，不能两个线程拿到一个统一连接
   * 集合具有队列的特新：先进先出

2. MyBatis连接池

   MyBatis连接池提供了3种方式

   ​	配置位置：主配置文件中SqlMapConfig.xml中的dataSource标签，type属性就是表示使用何种连接池方式

   * type属性取值
     * POOLED	采用传统javax.sql.DataSource规范中的连接池，mybatis中有针对规范的实现
     * UNPOOLED  采用传统的获取链接的方式，虽让也实现了javax.sql.DataSource接口，但是并没有使用池的思想
     * JNDI
       * 采用服务器提供的JNDI技术实现，来获取DataSource对象，不同的服务器所能拿到DataSource是不一样。
       * 注意：如果不是web或者maven的war工程，是不能使用的。

3. MyBatis中的事物

   事务的四大特性ACID、原子性，隔离性、一致性、持久性

4. 常用的标签

   resultMap组合多表查询信息

#### MyBatis延迟加载

















## Python

脚本解释性语言pythod在运行脚本之前

1. python现将脚本变异成字节码(pyc.pyo)
2. pythod虚拟机解释并运行字节码文件

编译性语言

1. 现将源代码编译成机器码(机器能读懂的代码)，生产可执行文件
2. 运行可执行文件











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
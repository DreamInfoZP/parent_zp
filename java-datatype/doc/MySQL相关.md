### 常用函数

#### 聚合函数

sum、max、min、avg、count

将一列数据作为一个整体，进行纵向的计算

**注意：**聚合函数的计算，排除null值

* ```sql
  -- 1.包含null的统计
  select count(ifnull(remark,0)) from bus_inport; 
  -- 2.非空的列
  ```

#### 分组查询

**注意：**

* 分组之后查询的字段：分组子段、聚合函数

  ```sql
  select sex,avg(math),count(id) from student groud by sex;
  ```

* where和having的区别

  ```sql
  select sex,avg(math),count(id) from student where math >65 groud by sex having count(id)>2;
  ```

  1. where在分组之前进行限定，如果不满足条件，则不参与分组。having在分组之后进行限定，如果不满足结果，则不会被查询出来
  2. where后不可以跟聚合函数，having可以进行聚合函数判断



#### 分页查询

开始的索引 = (当前页码-1)*每页显示条数

MySQL：limit

Oracle：rownum或者rowid



### 约束

* 概念：对表中的数据进行限定，保证数据的正确性，有效性和完整性
* 分类
  1. 主键约束：primary key
  2. 非空约束：not null
  3. 唯一约束：unique
  4. 外键约束：foreign key

#### 数据库的设计

1. 多表之间的关系

   * 一对一
   * 一对多(多对一)
   * 多对多(中间表)

2. 数据库设计的范式

   * 概念：设计数据库时，需要遵循一些规范。需要遵循后边的范式，必须先遵循前边所有的范式要求

     设计数据库时，遵从不同的规范要求，设计出合理的关系型数据库，这些不同规范的要求被称为不同范式，各种范式呈递次规范，越高的范式冗余越小

     目前关系型数据库有六种范式：第一范式(1NF)、第二范式(2NF)、第三范式(3NF)、巴斯-科德范式(BCNF)、第四范式(4NF)、第五范式(5NF、完美范式)

   * 分类：

     1. 第一范式:每一列都是不可分割的原子数据项

     2. 第二范式:在1NF基础上，非码属性必须完全依赖与候选码(在1NF基础上消除非主属性对主码部分函数依赖)

        概念

        * 函数依赖：A——>B，如果通过A属性(属性组)的值，可以却低估唯一B属性的值.则称B依赖于A

          例如：学好——>姓名		(学号，课程名)——>分数

        * 完全函数依赖：A——>B，如果A是一个属性组，则B属性值得确认依赖于A属性组中所有的属性值

          例如：(学号，课程名称)——>分数

        * 部分函数依赖：A——>如果A是一个属性组，则B属性值得确定只需要依赖A属性组中某一些值即可

          例如：(学号,课程名称)——>姓名

     3. 第三范式：在2NF基础上，任何非主属性不依赖于其他非主属性(在2NF基础上消除传递依赖)
   
3. 数据库的备份和还原

   * 语法：
     * 备份：mysqldump -u用户名 -p密码 数据库名称 > 保存路径
     * 还原
       1. 登录数据库
       2. 创建数据库
       3. 使用数据库
       4. 执行文件。 source 文件路径

4. 多表查询

   * 笛卡尔积

     * 有两个集合A，B取这两个集合的所有组成情况
     * 要完成多表查询，需要消除无用的数据

   * 多表查询的分类

     * 内连接查询

       1. 隐式内连接

          where条件进行两张表的筛选

       2. 显示内连接

          inner join on 条件

     **注意：**隐式内链接会先做笛卡尔积在根据条件筛选，显示先筛选在笛卡尔积数据量大的时候会有明显的性能差异

     * 外连接查询

       1. 左外连接	left [outer] join
       2. 右外连接    rift join

     * 子查询

       * 嵌套查询

         1. 单行单列

            ```sql
            select * from emp where emp.salary < (select avg(salary) from emp);
            ```

         2. 多行单列

            ```sql
            select * from emp where dept_id in(select id from where dept where name = '财务部' or name = '市场部');
            ```

         3. 多行多列

            ```sql
            select * from dept t1,(select * from emp where emp.join_date > '2011-11-11') t2 where t1.id = t2.id;
            ```

5. 事物

   * 事物的概念

     如果一个包含多个步骤的业务操作，被事务管理，那么这些操作要么同时成功，要么同时失败。

   * 操作

     1. 开启事物：start transaction
     2. 回滚：rollback
     3. 提交：commit

     ```sql
     -- 查询默认的提交状态	1-自动提交	0-手动提交
     select @@autocommit;
     -- 设置为手动提交
     set @@autocommit = 0;
     ```

     

   * 事物的四大特征

     原子性

     持久性

     隔离性

     一致性

   * 事物的隔离级别概念

     多个事物之间隔离，相互独立的。但是如果多个事物操作同一批数据，则会引发一些问题设置不同隔离级别就可以解决这些问题

     1. 脏读
     2. 不可重复读
     3. 幻读

     ```sql
     -- 查询数据库的隔离级别
     select @@tx_isolation;
     -- 设置隔离级别
     set global transaction isolation level @@tx_isolation = '隔离级别';
     ```

6. DCL

   SQL分类

   * DDL：操作数据库和表
   * DML：增删改表中数据
   * DQL：查询表中的数据
   * DCL：管理用户，授权

   DCL管理用户，授权

   1. 管理用户

      通配符 %表示可以在任意主机使用用户登录数据库

      ```sql
      -- 1.添加用户 主机名可以用%代替
      create user '用户名'@'主机名' identified by '密码';
      
      -- 2.删除用户
      drop user '用户名'@'主机名';
      
      -- 3.修改用户密码
      update user set password = password('新密码') where = '用户名';
      
      set password for '用户名'@'主机名' = password('新密码');
      ```

      mysql中忘记了root用户的密码

      1. cmd--> net stop mysql	停止mysql服务

         需要管理运行该cmd

      2. 使用无验证方式启动mysql服务：mysqld --skip-grant-tables

      3. 打开新的cmd窗口，直接输入mysql命令，敲回车

      4. use mysql

      5. update user set password = password('你的新密码') where user = '用户名';

      6. 打开任务管理器，手动结束mysqld进程

      7. 启动mysql服务

   2. 权限管理

      ```sql
      -- 1.查询权限
      show grants for '用户名'@'主机名';
      
      -- 2.授予权限
      grant 权限列表 on 数据库名称.表名 to '用户名'@'主机名';
      grant all on *.* to '用户名'@'主机名';
      --撤销权限
      ```

      

   3. 






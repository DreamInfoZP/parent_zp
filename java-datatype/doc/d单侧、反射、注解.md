## 标题

#### 1.Junit单元测试

* 测试分类

  * 黑盒测试：不需要写代码，给输入值，看程序是否能够输出期望值
  * 白盒测试：需要写代码。关注程序具体的执行流程

* Junit使用：白盒测试

  1. 定义一个测试类(测试用例)

     建议：

     * 测试类名：被测试的类名Test
     * 包名：xxx.xxx.xx.test

  2. 定义测试方法：可以独立运行

     建议：

     * 方法名：test测试的方法名
     * 返回值：void
     * 参数列表：空参

  3. 给方法加@Test

  4. 倒入junit依赖

* 判定结果

  * 一般会使用断言操作来处理结果

    Assert中的方法

* 前置和后置方法

  * @Before

    修饰的方法会在测试方法之前被自动执行

  * @After

    修饰的方法会在测试方法执行之后自动执行

#### 2.反射：框架的灵魂

* 框架：半成品软件。可以在框架的基础上进行软件开发商，简化编码

* 反射：将类的各个组成部分封装为其他对象，这就是反射机制

  好处：

  1. 可以在程序运行过程中，操作这些对象
  2. 可以解耦，提高程序扩展性

* 获取Class对象的方式

  1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象

     * 多用于配置文件，将类名定义在配置文件中。读取文件，加载类

  2. 类名.class:通过类名的属性class获取

     * 多用于参数的传递

  3. 对象.getClass()：getClass()方法在Objects对象中定义

     * 多用回对象的获取字节码的方式

     结论：同一个字节码文件(*.class)在一次运行过程中，只会被夹在一次，不论通过什么方式获取Class对象都是同一个

  ```java
  // 忽略访问权限修饰符的安全检查
  属性名.setAccessible(true);
  ```





#### 3.注解

生成文档 

根据类中的注释信息运行 javadoc命令可以生产文档信息

1. JDK定义的一些注解

   ```
   @Override           检测被该注解标注的方法是否是继承自父类(接口)的
   @Deprecated         该注解标注的内容，表示已经过时
   @SuppressWarnings   压制警告
   	*一般传递参数all	@SuppressWarning("all")
   ```

2. 自定义注解

   * 格式
     * 元注解
     * public @interface 注解名称{}
   * 本质：注解本质上就是一个接口，该接口默认继承Annotation接口
     * public interface com.zp.objects.MyAnno extends java.lang.annotation.Annotation {
       }
   * 属性：接口中可以定义的成员方法
     * 要求
       1. 属性的返回值类型有下列取值
          * 基本数据类型
          * String
          * 枚举
          * 注解
          * 以上类型的数组
       2. 定义了属性，在使用时需要给属性赋值
          * 如果定义属性时，使用了default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值
          * 如果只有一个属性需要复制，并且属性的名称是value，则value可以省略，直接定义值即可
          * 数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}省略
     * 元注解：用于描述注解的注解
       * @Target：描述注解能够作用的位置
       * @Retention：描述注解被保留的阶段
       * @Documented：描述注解是否被抽取到api文档中
       * @Inherited：描述注解是否被子类继承
       * 

   ```java
   // 编译文件
   javac MyAnno.java 
   // 反编译java文件
   javap MyAnno.class
   // 反编译结果
   public interface com.zp.objects.MyAnno extends java.lang.annotation.Annotation {
   }
   ```

3. 在程序使用(解析)注解:获取注解中定义的属性值

   * 获取注解定义的位置对象(Class,Method,Field)
   * 获取指定的注解
     * getAnnotation(Class)
     * 其实就是在内存中生成了一个该注解接口的子类实现对象
     * 调用哪个注解中的抽象方法获取配置的属性值
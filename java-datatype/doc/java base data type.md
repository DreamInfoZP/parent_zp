

## 疑问区

```tiki wiki
哈希冲突
红黑树结构
```



### java数据类型

#### 基本数据类型

* 整数型	byte short int long
* 浮点型    float double
* 字符型    char
* 布尔型    boolean

#### 引用数据类型

​	字符串、数组、类、接口、Lamdba

#### 注意事项

1. 浮点数当中默认类型时double，如果一定要使用float类型，需要加上一个后缀F

2. 如果是整数，默认为int类型，如果一定要使用float类型，需要加上一个后缀L

3. 强制类型转换一般不推荐使用，可能发生进度损失、数据溢出

4. byte/short/char着三种类型都可能发生数字运算，例如加法“+”

5. byte/short/char这三种类型在运算的时候，都会被首先提升为int类型，然后再计算

6. 48-'0'   65-'A'   97-'a'

7. 对于byte、short、char三种类型来说，如果右侧赋值的数值没有超过范围，那么对于javac编译器将会自动隐含地为我们补上一个(byte)(short)(char)

   ```java
   byte num1 = 30 ; 
   // 右侧确实是一个int数字，但是没有超过左侧的范围，完整的语句是
   byte num1 = (byte) 30;
   ```

   

#### 运算符注意事项

1. ++，--
   * 单独使用：不和其他操作混合，自己独立成为一个步骤
   * 呼和使用：和其他操作混合使用，赋值操作，打印操作混合
2. 使用区别
   * 在单独使用的时候，前++和后++没有任何区别
   * 在混合使用
     * 如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用
     * 如果是【后++】，那么变量使用本来的值，【然后再让变量+1】
3. <<、>>
   * 左移和右移 二进制编码
   * https://www.cnblogs.com/chuijingjing/p/9405598.html

#### 逻辑运算符

1. &&和&与||和|区别

   A&&B, 当A为false时，不去计算B的值而直接返回false；当A为true时，计算B的值。

   * &&和&都是表示与，区别是&&若第一个条件不满足，后面条件就不再判断。而&要对所有的条件都进行判断

   a||b：只有a与b都为false，结果才为false；有一个为true，结果为true。

   * || 和 | 都是表示与，区别是 || 若第一个条件不满足，后面条件就不再判断。而 | 要对所有的条件都进行判断

#### 三元运算符

1. 格式
   * 数据类型	变量名称	=	条件判断	？	表达式A	：	表达式B;



#### JShell小工具

1. JDK9有的特性
2. 执行执行命令语句不需要繁琐的固定格式



#### 编译器优化

1. 编译器常量优化
   * 如果右侧表达式中全部都是常量，没有任何变量编译器会直接将常量计算结果编译到字节码文件中
   * 一旦表达式中有变量参与，那么就不能进行这种优化了

#### 选择语句

1. switch
   * case中一旦有对应的值，就会执行相应的语句，在执行过程中，遇到break就会结束，否则会一直执行下去
   * default当case中没有匹配语句执行default逻辑

#### 循环语句

1. for、while、do-while
2. 三种循环的区别
   * 如果条件从来没有满足过，那么for和while循环将会执行0次，但是do-while循环至少执行一次
   * 作用域不同【for循环的变量在小括号中定义，只有循环内部才可以使用。while循环和do-while寻栓初始化语句本来就在外面，所以循环完成以后可以继续使用】

#### Java内存划分

1. 栈(Stack)：存放的都是方法的局部变量，方法运行一定是在栈中

   * 局部变量：方法的参数，或者是方法内部的变量
   * 作用域：一旦超出作用域，立刻从栈内存当中消失

2. 堆(Heap)：凡是new出来的东西，都在堆中。

   * 堆内存里面的东西都有一个地址值：16进制

   * 堆内存里面的数据都有默认值。规则

     如果是整数			默认值为0

     如果是浮点数		默认值为0.0

     如果是字符			默认为‘\u0000’

     如果是布尔值		默认是false

     如果是引用类型	默认为null

3. 方法区(Method Area)：存储.class相关信息，包含方法的信息

4. 本地方法栈(Native Method Stack)：与操作系统相关

5. 寄存器(pc Register)：与CPU相关



#### 什么是类

​	类：是一组相关属性和行为的集合。可以看成是一类事物的模板，使用事物的属性特征和行为特征来描述该

类事物。

#### 面向对象

​	面向过程：当需要实现一个功能的时候，每一个具体的步骤都要亲力亲为，详细处理每一个细节

​	面向对象：当需要实现一个功能的时候，不关心具体的步骤，而是找一个已经具有该功能的人，来帮我做事

​	对象的特征：封装、继承、多态

​	继承是多态的前提，如果没有继承，就没有多态

​	局部变量：				直接写员变量名

​	本类的成员变量：	 this.成员变量名

​	父类的成员变量：	 super.成员变量名

#### this关键字

1. 通过谁调用方法，谁就是this

#### 字符串

1. 特点
   * 字符串的内容永不可变
   * 正是因为字符串不可改变，所以字符串是可以共享的
   * 字符串效果上相当于是char[]字符数组，但是底层原理是byte[]字节

字符串常量池：程序当中直接写上的双引号字符串，就在字符串常量池中

 对于引用类型来说，==是进行数值的比较

 对于应用类型来说，==是进行地址值的比较

#### static

1. 一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。
2. 如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它
3. 无论成员变量，还是成员方法。如果有了static，都推荐使用类名称进行调用
4. 当第一次用到本类时，静态代码块执行唯一的一次
5. 静态内容总是优先于非静态，所以静态代码块比构造方法先执行

静态代码块的典型用途：用来一次性地对静态成员变量进行赋值

**注意：**根据类名称访问静态成员变量的时候，全程和对象没有关系，只和类有关系



#### Arrays

1. abs()获取绝对值
2. ceil()向上取整
3. floor()向下取整
4. round()四舍五入



#### 接口

* Java7接口定义

  * 常量
  * 抽象方法

* Java8

  * 默认方法

    [主要用来解决接口升级的问题]

    [接口的默认方法也可以被接口实现类进行覆盖重写]

    ```java
    public default 返回值类型 方法名称(参数列表){
      方法体;
    }
    ```

  * 静态方法

    ```java
    public static 返回值类型 方法名称(参数列表){
      方法体
    }
    ```

* Java9

  * 私有方法

    普通私有方法，解决多个默认方法之间重复代码问题

    静态私有方法，解决多个静态方法之间重复代码问题

**注意事项:**

1. 接口当中的常量，可以省略public static final,不写默认也是这个
2. 接口当中的常量，必须进行赋值，不能不赋值
3. 接口中常量的名称，使用完全大写的字母，用下划线分割

* 接口没有静态代码块或者构造方法
* 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
* 如果实现类所实现的多个接口当中，存在抽象方法，那么只需要重写任意一个即可
* 如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类
* 如果实现类实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写
* 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先使用父类当中的方法。**【继承优先于接口】**
* 多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写【而且带着default关键字】



#### 多态

extends继承或者implements实现，是多态性的前提

一个对象有多种形态

```java
// 代码中体现多态性，其实：父类引用只想子类对象
// 格式
父类名称 对象名 = new 子类名称();
接口名称 对象名 = new 实现类名称();
```

**成员方法**new的是谁就用谁，没有则向上找

**成员变量**左边是谁，优先用谁

* 向上转型一定是安全的，没有问题。但是也有一个缺点。对象一旦向上转型为父类，那么就无法调用子类原本特有的内容

  * 解决方案：用对象的向下转型【还原】instanceof

    ```java
    // 对象 instanceof 类名称
    if(animal instanceof Cat){
      Cat cat = (Cat) animal;
    }
    ```

    

#### Final

final关键字代表最终、不可变的

1. 可以用来修饰一个类
   * 被final修饰的类不能被继承
2. 可以用；来修饰一个方法
   * 被final修饰的方法不能被重写，该方法就是最终的方法
3. 可以修饰一个局部变量
4. 可以修饰一个成员变量

**注意点**

1. final和abstract不能修饰同一个类、方法···
2. 对于基本类型来说，不可变说的是变量当中的数据不可改变
3. 对于引用类型来说，不可变说的是变量当中的地址不可变
4. final修饰成员变量,之后必须手动赋值，不会再给默认值

​	

#### 内部类

```java
// 直接初始化内部类
// 外部类名称.内部类名称 = new 外部类名称().new 内部类名称()
Body.Heart heart = new Body().new Heart();
```

1. 如果出现了重名现象

   ```java
   public class Outer(){
     int num = 10;
     public class Inner(){
       int num = 20;
       public void methodInner(){
         int num = 30;
         // 局部变量
         System.out.println(num);
         // 内部类成员变量
         System.out,println(this.num);
         // 外部类成员变量
         System.out.println(Outer.this.num);
       }
     }
   }
   ```

2. 定义一个类的权限修饰符

   * 外部类：public / (default)
   * 成员内部类：public / protected / (default) / private
   * 局部内部类：什么都不用写

3. 匿名内部类

   ```java
   // 匿名内部类的定义格式
   接口名称 对象名称 = new 接口名称 (){
     // 覆盖抽象类所有抽象方法
   };
   ```

注意点：

* 匿名内部类，在【创建对象】的时候，只能使用唯一一次。如果希望使用多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类
* 匿名对象，在【调用方法】的时候，只能调用一次。如果希望同一个对象，调用多次方法，那么必须给杜喜庆起个名字
* 匿名内部类是省略了【实现类 / 子类名称】，但是匿名对象是省略了【对象名称】



#### JDK工具类

1. Objects

   * Objects.equals()方法防止NullPointException

2. Date

   * ```java
     // 获取当前时间毫秒数
     System.currentTimeMillis();
     // 日期格式 yyyy-MM-dd HH:mm:ss
     SimpleDateFormt sdf = new SimpleDateFormt("yyyy-MM-dd HH:mm:ss");
     Date date = new Date(sdf);
     String text = sdf.format(date);
     ```

   * Calender中的月份需要+1，西方日历的月份是0～11，中国是1～12

3. System

   * System.copyArray() 复制数组值

#### 单列Collection集合

1. 集合的所有父类都是Collection

2. 集合分为List和Set

   * List集合：有索引、可以存储重复元素、可以保证存取顺序
   * Set无索引、不可以存储重复元素、存取无序

3. 迭代器

   ```java
   Collection col = new ArrayList<String>;
   Iterator<String> ite = col.iterator();
   while(ite.hasNext()){
     String i = ite.next();
   }
   ```

4. 数据结构

   * 栈

     入栈、压站；出栈、弹栈	栈的结构出口和入口都在同一侧(子弹夹)

   * 队列

     队列先进先出

     入口和出口在两侧

   * 数组

     查询快：数组的地址是连续的，通过数组的首地址可以找到数组，通过数组的索引可以快速查找到某一个元素

     增删慢：数组的长度是固定的，我们想要增加/删除一个元素，必须创建一个新数组，把元素组的数据复制过来

   * 链表

     查询慢：链表中地址不是连续的，每次查询元素，都必须从头开始查询

     增删块：链表结构，增加/删除一个元素，对链表的整体结构没有影响，所以增删块

     * 单项链表

       链表中只有一条链子，不能保证元素的顺序(存储元素和取出元素的顺序可能不一致)

     * 双向链表

       链表中有两条链子，有一条链子专门记录元素的顺序，是一个有序的集合

   * 红黑树

     二叉树、排序树、查找树

     平衡树、不平衡树

     特点：趋近于平衡树，查询的速度非常快，查询叶子结点最大次数和最小次数不能超过2倍

     约束：

     * 结点可以是红色的或者是黑色的
     * 根结点必须黑色的
     * 叶子结点(空结点)是黑色的
     * 每个叶子节点的子结点都是黑色的
     * 任何一个结点到每一个叶子结点的所有路径上黑色节点数相同

   * 哈希表

     HashSet集合存储数据的结构(哈希表)

     jdk8之前：哈希表 = 数组 + 链表;

     jdk8之后：哈希表 = 数组 + 链表；

     ​					哈希表 = 数组 + 红黑树;

   * 可变参数数组

     ```java
     // 修饰符 返回值类型 方法名(数据类型 ...变量名){}
     
     private static int varArray(int ...arr){
             System.out.println(arr.length);
             return arr.length;
     }
     ```

     注意事项：

     * 一个方法的参数列表，只能有一个可变参数
     * 如果方法的参数有多个，那么可变参数必须卸载参数列表的末尾

#### 双列Map集合

1. 特点
   * Map集合是一个双列集合，一个元素包含两个值(一个key，一个value)
   * Map集合中的元素，key和value的数据类型可以相同，也可以不同
   * Map集合中的元素，key是不允许重复的，value可以重复
   * Map集合中的元素，key和value是一一对应的
2. Map中key为自定义类型
   * Map中的key必须是唯一的所以自定义类型必须重写hashCode和equals方法

总结：

* hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
* hashMap：底层是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
* HashMap：集合(之前的集合)可以存储null值，null键
* Hashtable集合，不能存储null值，null键
* Hashtable和Vector集合在jdk1.2之后被更先进的集合(HashMap,ArrayList)取代了
* Hashtable的子类Properties一让活跃，该集合是一个唯一和IO流结合的集合
* 

#### 泛型

**优点：**集合不适用泛型，默认类型是Object类型，可以存储人意类型的数据

**弊端：**不安全，会引发异常

**注意点：**泛型没有继承的概念

```java
// 含有泛型的类定义
修饰符 class 类名<代表泛型的变量>{}

// 含有泛型的方法

修饰符 <泛型> 返回值类型 方法名(参数列表(使用泛型)){
  方法体;
};

// 接受不知道什么类型的数据
public static void printArray(ArrayList<?> list){
  Iterator it = list.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }
}


// 泛型的上线：此时的泛型是？，必须是Number类型或者Number类型的子类
public static void getElement(Collection<? extends Number> coll){}

//泛型的下限：此时的泛型？，必须是Number类型或者Number的父类
public static void gerElement(Collection<? super Number> coll){}
```

#### 异常处理

* throw关键字

  作用：可以使用throw关键字在指定的方法中抛出指定的异常

  ```java
  // 使用格式
  throw new xxxException("异常产生原因");
  ```

  1. throw关键字必须卸载方法的内部
  2. throw关键字后边bew的对象必须是Execption或者Execption的子类对象
  3. theow关键字抛出指定的异常对象，我们就必须处理这个异常对象。
     * throw关键字后边创建的是RuntimeExecption或者是RuntimeExecption的子类对象，可以不处理交给JVM处理
     * throw关键字后边创建的是编译异常(写代码的时候报错)，我们必须处理这个异常要么throws或者try{...}catch

* throws 异常处理的第一种方式，交给别人处理

  作用：

  * 当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
  * 可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理(自己不处理-->交给别人处理),最终交给JVM处理--中断处理

  ```java
  // 使用格式
  修饰符 返回值类型 方法名(参数列表) throws AAAExecption,BBBExecption……{
    throw new AAAExecption("原因");
    throw new BBBExecption("原因");
  }
  ```

  注意：

  * throws关键字必须写在方法声明处
  * throws关键字后边声明的异常必须是Execption或者是Execption的子类
  * 方法内部如果抛出了多个异常对象，那么throws后边必须也声明过个异常如果抛出的多个异常对象有字父类关系，那么直接声明父类异常即可
  * 调用一个声明抛出的异常的方法，我们就必须的处理声明的异常要么继续使用throws声明抛出，叫个方法的调用者处理，最终交给JVM要么try{……}catch

* 多个异常使用捕获怎么处理

  * 多个异常分别处理
  * 多个异常一次捕获，多次处理
  * 多个异常一次捕获一次处理

* 子父类异常

  * 如果父类抛出多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出异常
  * 父类方法没有抛出异常，子类重写父类方法时也不可抛出异常。此时子类产生异常，只能捕获处理，不能声明抛出

#### 线程与线程

1. 进程

   **进程：**是指一个内存中运行的应用程序，每个进程都有一个独立的内存空间，一个应用程序可以同时运行多个进程；进程也是程序的一次执行过程，是系统运行程序的基本单位；系统运行一个程序即是一个进程从创建、运行、消亡的过程

   **并发：**指两个或多个事件在同一个时间段内发生

   **并行：**指两个或多个时间在同一时刻发生(同时发生)

2. 线程

   **线程：**线程时进程中的一个执行单元，负责当前进程中程序的执行，一个进程中至少有一个线程，一个进程中可以有多个线程的，这个应用程序也可以称之为多线程程序

* 线程调用

  * 分时调度

    所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间

  * 抢占式调度

    优先让优先级高的线程使用CPU，如果线程的优先级相同，那么会随机选择一个(线程随机性)，JAVA使用的是抢占式调度

* 实现Runnable接口创建多线程的好处：

  1. 避免了单继承的局限性

     一个类只能继承一个类，类继承了Thread类就不能继承其他的类

     实现Runnable接口，换可以继承其他的类，实现其他的接口

  2. 增强了程序的扩展性，降低了程序的耦合性

     实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离

     实现类中，重写run方法：用来设置线程任务

     创建Thread类对象，调用start方法：用来开启新线程

#### Lambda表达式标准格式

```java
// Lambad表达式的标准格式
a.一些参数;
b.一个箭头;
c.一段代码;
格式：
  (参数列表)->{一些重写方法的代码}
():接口中抽象方法的参数列表，没有参数，就空着；有参数就写出参数，多个参数使用,分割;
->:传递的意思，把参数传递给方法体{}
{}:重写接口的抽象方法的方法体
```



#### File类

1. 概念

   **java.io.File**类是文件和目录路径名的抽象表示，主要用于文件和目录的创建、查找、删除等操作

```java
 /**
         * static String pathSeparator 与系统有关的路径分隔符
         * static char pathSeparatorChar 与系统有关的路径分隔符
         *
         * static String separator 与系统有关的默认名称分隔符，为了方便，他被表示为一个字符串
         * static char separatorChar 与系统有关的默认路径分隔符
         */

        String pathSeparator = File.pathSeparator;

        // 路径分隔符    windows:分号; linux:冒号:
        System.out.println(pathSeparator);

        String separator = File.separator;

        // 文件名称分隔符  windows:反斜杠\    linux:正斜杠/
        System.out.println(separator);


/**
     * File类遍历(文件夹)目录功能
     *  public String[] list():返回一个String数组
     *  public File[] listFiles():返回一个File数组，表示该File目录中的所有子文件或目录
     */

```

```java

/**
 * @author zhoupeng
 * <p>
 * 写入数据的原理(内存-->硬盘)
 * java程序-->JVM(java虚拟机)-->OS(操作系统)-->调用OS写数据的方法-->把数据写到文件中
 * <p>
 * 字节输出流的使用步骤:
 * 1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
 * 2.调用FileOutputStream对象中的方法write,把数据写入到文件中
 * 3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率)
 * <p>
 * 换行写:写换行符号
 * windows:\r\n
 * linux:/n
 * mac:/r
 * <p>
 * <p>
 * 读取数据的原理(硬盘-->内存)
 * java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 * <p>
 * 字节输入流的使用步骤:
 * 1.创建FileInputStream对象，构造方法中绑定要读取的数据源
 * 2.使用FileInputStream对象中的方法read,读取文件
 * 3.释放资源
 */
public class OutputStreamTest {
    public static void main(String[] args) {
//        fileOutputStreamMethod();
        fileInputStreamMethod();
    }

    private static void fileInputStreamMethod() {
        try {
            FileInputStream fis = new FileInputStream("/Users/zhoupeng/Desktop/zp/a.txt");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.print((char) len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileOutputStreamMethod() {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/zhoupeng/Desktop/zp/a.txt");
            fos.write(97);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```



```java
/**
 * 
 * 读取和写入字符
 * 
 * 
 * flush方法是和close方法
 *      flush:刷新缓冲区，刘对象可以继续使用
 *      close:现刷新缓冲区，然后通知系统释放资源。刘对象不可以再继续使用
 * 
 * @author zhoupeng
 */
public class ReaderAndWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("路径+文件");

            fw.write("aa");

//            fw.close();
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```



注意事项：

File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法

重点：

file:文件

directory:目录/文件夹

path:路径

#### IO

* 一切皆为字节

  一切文件数据(文本、图片、视频等)在存储时，都是二进制的形式保存，都是一个一个字节，那么传输一样如此。所以，字节流可以传输任意文件数据。在操作流的时候，我们要时刻明确，无论使用什么样的流对象，底层传输的始终为二进制数据。

JDK7处理流异常

```java
package com.zp.objects.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7的新特新
 * 在try后边可以增加一个()，在括号中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try中的代码执行完毕，会自动把刘对象释放，不用写finally
 *      格式
 *          try(定义刘对象;定义刘对象...){
 *              可能会产生异常的代码
 *          }catch(异常类变量 变量名){
 *              异常处理逻辑
 *          }
 *
 * @author zhoupeng
 */
public class JDK7CopyFile {
    public static void main(String[] args) {
        String path = "/Users/zhoupeng/Desktop/zp";
        String fileName = "I_Tap102_20200217_001.xlsx";

        int index = fileName.lastIndexOf('.');
        String prefix = fileName.substring(0, index) + '1';
        String suffix = fileName.substring(index);

        String newFile = path + File.separator + prefix + suffix;
        File file = new File(newFile);
        try (
                FileInputStream fis = new FileInputStream(path + File.separator + fileName);
                FileOutputStream fos = new FileOutputStream(file)) {

//            if (file.createNewFile()) {


            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            // 先关闭写的后关闭读的
        } catch (IOException e) {
            System.out.println("异常情况请Debug分析");
            e.printStackTrace();
        }


    }
}
```

JDK9的新特性

```java
/**
 * JDK9的新特新
 *  try的前边可以定义刘对象
 *  在try后边的()中可以直接引入流对象的名称(变量名)
 *  在try代码执行完毕之后，流对象也可以释放掉,不用谢finally
 *  格式
 *      A a = new A();
 *      B b = new B();
 *      try(a,b){
 *          可能会产生异常的代码
 *      }catch(异常类变量 变量名){
 *          异常的处理逻辑
 *      }
 */
```

#### 序列化

对象和属性不能被static和transient(不参与序列化)关键字修饰

#### 网络编程

1. 软件架构

   BS、CS

2. 协议分类

   **UDP：**用户数据报协议(User Datagram Protocol)无连接通信协议

   特点：数据被限制在64kb，超过这个单位就不能发送了

   **TCP：**传输控制协议(Transmission Control Protocol)面向对象的通信协议

   三次握手

3. 端口号

   端口号：是一个逻辑端口,我们无法直接看到,可以使用一些软件查看端口

   当我们使用网络软件一打开，那么操作系统就会为网络分配一个随机 的端口号或者网络软件在打开的时候和系统要指定的端口号

   端口号是由两个字节组成，取值范围在0～65535之间

   注意：

   ​	1024之前的端口号我们不能使用，已经被系统分配给已知的网络软件了网络软件的端口号不能重复

#### 函数式接口

函数式接口在Java中是指：有且仅有一个抽象方法的接口

**备注：**"语法糖"是指使用更加方便，但是原理不变的语法代码。例如在遍历集合时使用forEach语法，其实底层的实现原理仍然是迭代器，这便是"语法糖 "。从应用层面来讲，Java中Lambda可以被当作匿名内部类的"语法糖"，但是二者在原理上是不同的。

```java
@FunctionInterface
// 该注解可以检验该接口是否是函数式接口

/**
* 函数式接口：有且仅有一个抽象方法的接口，
* 当然接口中可以包含其他的方法(默认，静态，私有)
*/
public interface MyFunctionInterface(){
  public abstract void method();
}
```

#### Lambda表达式

Supplier 生产型

Consumer 消费型

Predicate 判断型

Function 数据类型转换型



and、andThen、apply等方法



#### Stream流

"Stream流"其实是一个集合元素的函数模型，他并不是集合，也不是数据结构，其本身不存储任何的元素(或其他地址值)

Stream(流)是一个来自数据源的元素队列

* 元素是特定类型的对象，形成一个队列。Java中的Stream并不会存储元素，而是按需计算
* **数据源** 流的来源。可以是集合，数组等

基本步骤：

​	获取一个数据源(Source)——>数据转换——>执行操作回去想要的结果，每次转换原油Stream对象不改变，返回一个新的Stream对象(可以有多次转换),这就允许对其操作可以像链条一样排列，变成一个管道

常用方法

* 延迟方法：返回值类型仍然是Stream接口滋生类型的方法，因此支持链式调用。(除了终结方法外，其余方法均为延迟方法)

* 终结方法：返回值不在是Stream接口自身类型的方法，因此不在支持类似StringBuilder那样的链式调用

  例如：count、forEach

```java
/**
*Lambda表达式的目的，打印参数传递的字符串

把参数s,传递给了System.out对象，调用了对象中的方法prinln对字符串进行打印

注意：

1. System.out对象是已经存在的
2. println方法也是已经存在的

所以我们可以使用方法引用来优化Lambda表达式

System.out::println
*/
```
















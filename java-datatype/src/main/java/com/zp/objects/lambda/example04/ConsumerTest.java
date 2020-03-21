package com.zp.objects.lambda.example04;

import java.util.function.Consumer;

/**
 * Consumer<t>接口正好与Supplier接口相反
 * 它不是生产一个数据，而是消费一个数据，其数据剋行由泛型决定
 * <p>
 * Consumer接口是一个消费型接口，泛型执行什么类型，就可以使用accept方法消费什么类型的数据
 * 至于具体怎么消费(使用)，需要自定义(输出，计算……)
 *
 * @author zhoupeng
 */
public class ConsumerTest {

    public static void method(String name, Consumer<String> con) {
        con.accept(name);
    }


    public static void main(String[] args) {
        method("赵丽颖", System.out::println);

        // 将字符串反转
        method("迪丽热巴",(n)-> System.out.println(new StringBuffer(n).reverse().toString()));
    }
}

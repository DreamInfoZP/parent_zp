package com.zp.objects.lambda.example04;

import java.util.function.Consumer;

/**
 * Consumer接口的默认方法andThen
 * 作用：需要两个Consumer接口，可以把两个Consumer接口组合到一起，在对数据进行消费
 * <p>
 * 例如：
 * Consumer<String> con1
 * Consumer<String> con2
 * <p>
 * String s = "hello";
 * <p>
 * con1.accept(s);
 * con2.accept(s);
 * <p>
 * 连接两个Consumer接口  在进行消费
 * con1.andThen(con2).accept(s);谁写前边谁先消费
 *
 * @author zhoupeng
 */
public class AndThenConsumer {

    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(s);
//        con2.accept(s);

        // 使用andThen方法，把两个Consumer接口连接到一起，在消费数据
        con1.andThen(con2).accept(s);
    }

    public static void main(String[] args) {
        method("Hello", (s) -> System.out.println(s.toUpperCase()), (s) -> System.out.println(s.toLowerCase()));
    }
}

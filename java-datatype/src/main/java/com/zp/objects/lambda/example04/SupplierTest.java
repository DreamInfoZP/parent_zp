package com.zp.objects.lambda.example04;

import java.util.function.Supplier;

/**
 * Suppler<T>接口被称之为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
 *
 * @author zhoupeng
 */
public class SupplierTest {

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void main(String[] args) {
        System.out.println(getString(() -> "胡歌"));
    }
}

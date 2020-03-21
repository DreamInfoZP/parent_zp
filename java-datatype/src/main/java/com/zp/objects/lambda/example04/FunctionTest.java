package com.zp.objects.lambda.example04;

import java.util.function.Function;

/**
 * java.util.function.Function<T,R>接口用来根据一个类型的数据得到另一个类型的数据，
 * 前者称为潜质条件，后者称为后置条件
 * <p>
 * Function接口 apply(T,R)
 * 使用场景：将String类型转为Integer类型
 *
 * @author zhoupeng
 */
public class FunctionTest {
    public static void change(String str, Function<String, Integer> fun) {
        System.out.println(fun.apply(str));
    }

    public static void changeAndThen(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        System.out.println(fun1.andThen(fun2).apply(str));
    }

    public static void main(String[] args) {
        String s = "1234";

        change(s, Integer::parseInt);

        changeAndThen(s, (m) -> Integer.parseInt(s) + 10, (m) -> m + "");

    }
}

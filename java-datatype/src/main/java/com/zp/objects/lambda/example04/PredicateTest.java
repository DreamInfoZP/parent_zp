package com.zp.objects.lambda.example04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * java.util.Predicate<T>接口
 * 作用对某种数据类型的数据进行判断，结果返回一个boolean值
 * <p>
 * Predicate接口中包含一个抽象方法
 * boolean test(T t):用来指定数据类型进行判断的方法
 *
 * @author zhoupeng
 */
public class PredicateTest {
    public static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }


    /**
     * 数组中有多条"姓名+性别"的信息如下
     * String[] array = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男", "赵丽颖,女"};
     * 通过Predicate接口拼接符合要求的字符串筛选到集合ArrayList中
     * 需满足
     * 1.必须为女生
     * 2.姓名为4个子的
     * <p>
     * 使用and 等同于 &&
     *
     * @param str  筛选的数组
     * @param pre1 条件1
     * @param pre2 条件2
     * @return 满足条件的数据
     */
    public static ArrayList<String> filter(String[] str, Predicate<String> pre1, Predicate<String> pre2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : str) {
            if (pre1.and(pre2).test(s)) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(checkString("abcd", (s) -> s.length() > 5));

        String[] array = {"迪丽热巴,女", "古力娜扎,女", "玛尔扎哈,男", "赵丽颖,女"};

        System.out.println(filter(array,
                (s) -> "女".equals(s.split(",")[1]),
                (s) -> s.split(",")[0].length() == 4));
    }
}

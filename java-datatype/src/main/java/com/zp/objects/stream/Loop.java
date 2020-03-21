package com.zp.objects.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoupeng
 */
public class Loop {

    /**
     * 传统方式
     *
     * @param l 数据
     */
    public static void filterLoopData(List<String> l) {
        // 筛选所有姓张的人
        ArrayList<String> listA = new ArrayList<>();
        for (String s : l) {
            if (s.startsWith("张")) {
                listA.add(s);
            }
        }

        // 筛选名字有三个字的人
        ArrayList<String> listB = new ArrayList<>();
        for (String s : listA) {
            if (s.length() == 3) {
                listB.add(s);
            }
        }

        for (String s : listB) {
            System.out.println(s);
        }
    }


    /**
     * 使用Stream流的方式，遍历几个，对集合中的数据进行过滤
     * Stream流是JDK1.8之后出现的
     * 关注的是做什么，而不是怎么做
     *
     * @param l 数据
     */
    public static void loopStreamData(List<String> l) {
        l.stream()
                .filter((name) -> name.startsWith("张"))
                .filter((name) -> name.length() == 3)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        filterLoopData(list);

        System.out.println("====================");
        loopStreamData(list);
    }
}

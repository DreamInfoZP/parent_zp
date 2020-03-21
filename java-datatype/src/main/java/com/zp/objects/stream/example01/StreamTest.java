package com.zp.objects.stream.example01;

import com.zp.objects.interfaces.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zhoupeng
 */
public class StreamTest {

    /**
     * 练习:集合元素处理（传统方式）
     * 现在有两个ArrayList集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）依次进行以下若干操作步骤：
     * 1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
     * 2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
     * 3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
     * 4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
     * 5. 将两个队伍合并为一个队伍；存储到一个新集合中。
     * 6. 根据姓名创建Person对象；存储到一个新集合中。
     * 7. 打印整个队伍的Person对象信息。
     *
     * @param p1 p1
     * @param p2 p2
     */
    public static void normalMethod(List<String> p1, List<String> p2) {

        ArrayList<String> one = new ArrayList<>();
        for (String s : p1) {
            if (s.length() == 3) {
                one.add(s);
            }
        }

        ArrayList<String> one1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            one1.add(one.get(i));
        }

        ArrayList<String> two = new ArrayList<>();
        for (String s : p2) {
            if (s.startsWith("张")) {
                two.add(s);
            }
        }

        ArrayList<String> two1 = new ArrayList<>();
        for (int i = 2; i < two.size(); i++) {
            two1.add(two.get(i));
        }

        ArrayList<String> all = new ArrayList<>();
        all.addAll(one1);
        all.addAll(two1);

        ArrayList<Person> list = new ArrayList<>();
        for (String s : all) {
            list.add(new Person(s));
        }

        for (Person person : list) {
            System.out.println(person);
        }

    }

    public static void lambdaMethod(ArrayList<String> s1, ArrayList<String> s2) {
        List<Person> list = Stream.concat(
                s1.stream().filter((s) -> s.length() == 3).limit(3),
                s2.stream().filter((s) -> s.startsWith("张")).skip(2))
                .map(Person::new).collect(Collectors.toList());
        list.forEach(System.out::println);

    }

    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        normalMethod(one, two);

        System.out.println("=====================");

        lambdaMethod(one, two);
    }
}

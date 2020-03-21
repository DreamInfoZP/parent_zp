package com.zp.objects.stream;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author zhoupeng
 */
public class StreamTransaction {
    public static void main(String[] args) {

        // 把集合转换为Stream流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> stream1 = set.stream();

        HashMap<String, String> map = new HashMap<>();
        // 获取键，存储到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream2 = keySet.stream();

        // 获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream3 = values.stream();

        // 获取简直对(键与值的映射关系 entrySet)
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream4 = entries.stream();

        // 把数组转换为Stream流
        Stream<Integer> stream5 = Stream.of(1, 2, 3, 4, 5);

        // 可变参数可以传递的数组
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        Stream<Integer> stream6 = Stream.of(arr);


    }
}

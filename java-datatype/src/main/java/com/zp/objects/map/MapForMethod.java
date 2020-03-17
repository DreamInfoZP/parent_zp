package com.zp.objects.map;

import java.util.HashMap;
import java.util.Map;

public class MapForMethod {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(4);
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("夏冰", "夏冬");
        map.put("唐三", "小舞");

        map.forEach((key, value) -> System.out.println(key + "=" + value));

        System.out.println("===================");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }


        System.out.println("===================");

        for (String k : map.keySet()) {
            System.out.println(k + "=" + map.get(k));
        }

        System.out.println("===================");
        map.keySet().forEach((key) -> System.out.println(key + "=" + map.get(key)));
    }
}

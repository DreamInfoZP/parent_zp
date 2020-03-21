package com.zp.objects.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * java.util.Properties集合 extends HashTable<k,v> implements Map<k,v>
 * Properties 类表示了一个持久的属性集。Properties可保存在六种或从流中家在
 * Properties 集合是一个唯一和IO流相结合的集合
 * 可以使用Properties集合中的方法store，把集合中的临时数据保存，持久化写入硬盘中存储
 * 可以使用properties集合中的方法load，把硬盘中保存的文件(键值对),读取到集合中使用
 * <p>
 * 属性列表中每个键及七对应的值都是一个字符串
 * Properties集合是一个双列集合，key和value默认都是字符串
 *
 * @author zhoupeng
 */
public class PropertiesList {
    public static void main(String[] args) {
//        show01();

//        show02();
        show03();

    }

    private static void show03() {
        Properties prop = new Properties();
        try (FileReader fr = new FileReader("/Users/zhoupeng/Desktop/zp/prop.txt")) {

            prop.load(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        prop.stringPropertyNames().forEach(s -> System.out.println(s + "=" + prop.get(s)));
    }

    private static void show02() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "178");
        prop.setProperty("古力娜扎", "188");

        try (FileWriter fw = new FileWriter("/Users/zhoupeng/Desktop/zp/prop.txt")) {
            prop.store(fw, "save data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("赵丽颖", "168");
        prop.setProperty("迪丽热巴", "178");
        prop.setProperty("古力娜扎", "188");

        Set<String> set = prop.stringPropertyNames();
        set.forEach(s -> System.out.println(s + "=" + prop.get(s)));
    }
}

package com.zp.objects.io;

import java.io.*;
import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 * 对文本中的内容进行排序
 * <p>
 * 实现:
 * 1.创建一个HashMap集合对象,可以:存储美航文本的序号(1,2,3,...)；value:存储每行的文本
 * 2.创建字符缓冲输入流对象，构造方法中绑定字符输入流
 * 3.创建字符缓冲输出流对象，否早方法中绑定字符输出流
 * 4.使用字符缓冲输入流中的方法readLine,逐行读取文本内容
 * 5.对读取到的文本进行切割，获取行中的序号和文本内容
 * 6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的，会自动排序)
 * 7.遍历HashMap几个，获取每一个简直对
 * 8.把每个简直对，凭借为一个文本行
 * 9.把拼接好的文本，使用字符缓冲输出流中的方法write,写入到文件中
 * 10.释放资源
 *
 * @author zhoupeng
 */
public class SortFile {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(4);
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/zhoupeng/Desktop/zp/in.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/zhoupeng/Desktop/zp/out.txt"))) {

            String len;
            while ((len = br.readLine()) != null) {
                String[] arr = len.split("\\.");
                map.put(arr[0], arr[1]);
            }

            map.forEach((k, v) -> {
                try {
                    bw.write(k + "." + v);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.zp.objects.io;

import java.io.*;

/**
 * 使用步骤：
 * 1.创建ObjectOutputStream对象，构造方法中传递字节输入流
 * 2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
 * 3.释放资源
 *
 * @author zhoupeng
 */
public class ObjectStream {
    public static void main(String[] args) {
//        show01();

        show02();
    }

    private static void show02() {

        try (FileInputStream fis = new FileInputStream("/Users/zhoupeng/Desktop/zp/person.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void show01() {
        try (FileOutputStream fos = new FileOutputStream("/Users/zhoupeng/Desktop/zp/person.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(new Person("赵丽颖", "19"));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

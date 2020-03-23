package com.zp.objects.io;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 序列化和反序列化的时候，会抛出NotSerializableException没有序列化异常
 * 类通过实现 java.io.Serializable接口以启用其序列化功能。为实现此接口的类将无法使用任何状态序列化或反序列化
 * Serializable接口也叫标记接口
 * 要进行序列化和反序列化的类必须实现Serializable接口，就会给类添加一个标记
 * 当我们进行序列化和反序列化的时候，就会检测类上是否有这个标记
 * 有：就可以序列化和反序列化
 * 没有就会抛出NotSerializableException异常
 *
 * @author zhoupeng
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {

    private String name;
    private String age;

    public void print(String name) {
        System.out.println("你好: " + name);
    }
}

package com.zp.objects.stream;

import java.util.stream.Stream;

/**
 * @author zhoupeng
 */
public class Stream_Concat {

    /**
     * stream中limit获取流中的前几个元素
     * stream中skip获取流中指定的之后的元素没有则为空流
     * <p>
     * stream中concat将两个流合并为一个流
     *
     * @param args
     */
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "张翠山", "赵敏", "周芷若", "张无忌");
        Stream<String> stream1 = Stream.of("美羊羊", "喜洋洋", "懒洋洋", "灰太狼", "红太狼");
        Stream<String> stream2 = Stream.concat(stream, stream1);
        stream2.forEach(System.out::println);
    }
}

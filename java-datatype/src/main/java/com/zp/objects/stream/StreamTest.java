package com.zp.objects.stream;

import java.util.stream.Stream;

/**
 * @author zhoupeng
 */
public class StreamTest {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
//        Stream<Integer> stream1 = stream.map(Integer::parseInt);
//        stream1.forEach(System.out::println);

        Stream.of("1", "2", "3", "4", "5")
                .map(Integer::parseInt)
                .forEach(System.out::println);


    }
}

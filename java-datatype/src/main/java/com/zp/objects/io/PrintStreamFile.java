package com.zp.objects.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 可以改变输出语句的目的地(打印流的流向)
 * 输出语句，默认在控制台输出
 * 使用System.setOut方法改变输出语句的目的地改为参数中床底的打印目的地
 * static void setOut(PrintStream out)
 * 重新分配"标准"输出流
 *
 * @author zhoupeng
 */
public class PrintStreamFile {
    public static void main(String[] args) {
        System.out.println("我是控制台输出");
        try (PrintStream ps = new PrintStream("/Users/zhoupeng/Desktop/zp/print.txt")) {
            System.setOut(ps);
            System.out.println("我在打印目的地中输出");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

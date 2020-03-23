package com.zp.objects.annotation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author zhoupeng
 */
public class CheckTest {
    public static void main(String[] args) throws IOException {
        Calculator c = new Calculator();
        Class<? extends Calculator> cls = c.getClass();

        Method[] methods = cls.getMethods();

        int number = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));
        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    number++;
                    bw.write(method.getName() + " 方法出异常了");
                    bw.newLine();
                    bw.write(e.getCause().getClass().getSimpleName() + " 异常名称");
                    bw.newLine();
                    bw.write(e.getCause().getMessage() + " 异常原因");
                    bw.newLine();
                }
            }
        }
        bw.write("===========================");
        bw.newLine();
        bw.write("异常数量 " + number);
        bw.flush();
        bw.close();
    }
}

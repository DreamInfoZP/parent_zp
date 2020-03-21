package com.zp.objects.lambda.example03;

/**
 * 日志
 * 发现有些性能浪费
 * <p>
 * 调用showLog方法，传递的第二个参数是一个拼接后的字符串
 * 先把字符串拼接好，让后在调用showLog方法
 * showLog方法中如果传递的日志等级不是1
 * 那么就不会是如此拼接后的字符串
 * 所以感觉字符串白拼接了，存在浪费
 *
 * @author zhoupeng
 */
public class TestLogger {
    public static void showLog(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, msg1 + msg2 + msg3);
    }
}

package com.zp.objects.lambda.example03;

/**
 * Lambda的特点：延迟加载
 * Lambda的使用前提，必须存在函数式接口
 *
 *
 * 使用Lambda表达式作为参数传递，仅仅是把参数传递到showLog方法中
 * 只有满足条件，日志等级是1级
 *  才会调用接口MessageBuilder中的方法builderMessage
 *  才会进行字符串的拼接
 * 如果不满足，日志等级不是1级
 *  那么接口MessageBuilder接口中的方法builderMessage也不会执行
 *  所以拼接字符串的代码也不会执行
 * 所以不会存在性能浪费
 *
 *
 *
 * @author zhoupeng
 */
public class TestLoggerLambda {

    public static void showLog(int level, MessageBuilder mb) {
        if (level == 1) {
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(1, () -> msg1 + msg2 + msg3);
    }
}

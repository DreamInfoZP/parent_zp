package com.zp.objects.stream.example02;

/**
 * @author zhoupeng
 */
public class MethodStatic {
    public static int method(int n, Cacleable c) {
        return c.caclAbs(n);
    }


    public static void main(String[] args) {
        int a = -10;
        System.out.println(method(a, (n) -> Math.abs(n)));


        /*
            通过类名引用静态成员方法
            类已经存在，静态成员方法也已经存在
            就可以通过类名直接用静态成员方法
         */
        System.out.println("================");
        System.out.println(method(a, Math::abs));


    }
}

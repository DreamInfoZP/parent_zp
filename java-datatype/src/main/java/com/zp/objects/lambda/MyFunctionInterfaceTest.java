package com.zp.objects.lambda;

/**
 * @author zhoupeng
 */
public class MyFunctionInterfaceTest {
    public static void show(MyFunctionInterface mfi) {
        mfi.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionInterfaceImpl());

        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("我实现了匿名内部类");
            }
        });

        show(() -> System.out.println("我实现了Lambda表达式"));
    }
}

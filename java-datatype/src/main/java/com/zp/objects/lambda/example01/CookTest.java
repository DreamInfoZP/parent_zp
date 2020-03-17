package com.zp.objects.lambda.example01;

/**
 * @author zhoupeng
 */
public class CookTest {

    public static void main(String[] args) {

        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了");
            }
        });

        invokeCook(() -> System.out.println("吃饭了"));


    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}

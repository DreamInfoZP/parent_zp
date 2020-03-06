package com.zp.objects.abstracts.example1;

import java.util.ArrayList;

/**
 * @author zhoupeng
 */
public class DemoRedPack {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员A", 0.0);
        Member two = new Member("成员b", 0.0);
        Member three = new Member("成员c", 0.0);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("====================");

        ArrayList<Integer> redMoney = manager.send(20, 3);
        one.receive(redMoney);
        two.receive(redMoney);
        three.receive(redMoney);


        manager.show();
        one.show();
        two.show();
        three.show();
    }
}

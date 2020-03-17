package com.zp.objects.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author zhoupeng
 */
public class example1 {

    public static void main(String[] args) {
        // 准备扑克
        ArrayList<String> poker = new ArrayList<>();

        // 准备花色 和牌
        String[] colors = {"♥️", "♦️", "♣️", "♠️"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        // 将花色和牌组合到poker中

        for (String color : colors) {
            for (String number : numbers) {
                poker.add(color + number);
            }
        }

        // 大小王添加到poker
        poker.add("大王");
        poker.add("小王");

        // 进行洗牌
        Collections.shuffle(poker);

        // 定义玩家和底牌

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                dipai.add(poker.get(i));
            } else if (i % 3 == 0) {
                player1.add(poker.get(i));
            } else if (i % 3 == 1) {
                player2.add(poker.get(i));
            } else {
                player3.add(poker.get(i));
            }
        }


        System.out.println("玩家: player1 的牌：" + player1);
        System.out.println("玩家: player2 的牌：" + player2);
        System.out.println("玩家: player3 的牌：" + player3);
        System.out.println("底牌：" + dipai.toString());
    }
}

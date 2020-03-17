package com.zp.objects.abstracts.example1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author zhoupeng
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Member extends User {

    public Member(String name, double money) {
        super(name, money);
    }

    /**
     * 收取红吧
     */
    public void receive(ArrayList<Integer> list) {

        // 随机抽取红包
        int i = new Random().nextInt(list.size());
        int m = list.remove(i);

        super.setLeftMoney(super.getLeftMoney() + m);
    }
}

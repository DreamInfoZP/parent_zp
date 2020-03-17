package com.zp.objects.abstracts.example1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @author zhoupeng
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Manager extends User {
    public Manager(String name, double money) {
        super(name, money);
    }

    /**
     * 发送红包
     *
     * @param money 金额
     * @param count 数量
     * @return 红包
     */
    public ArrayList<Integer> send(int money, int count) {

        ArrayList<Integer> list = new ArrayList<>();

        if (money > super.getLeftMoney()) {
            System.out.println("群主余额不足!");
            return list;
        }

        super.setLeftMoney(super.getLeftMoney() - money);

        int avg = money / count;
        int mod = money % count;

        for (int i = 0; i < count - 1; i++) {
            list.add(avg);
        }
        list.add(avg + mod);

        return list;
    }
}

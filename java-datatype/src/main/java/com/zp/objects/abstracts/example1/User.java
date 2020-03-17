package com.zp.objects.abstracts.example1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhoupeng
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private double leftMoney;

    public void show() {
        System.out.println("我叫: " + name + ", 余额为：" + leftMoney);
    }
}

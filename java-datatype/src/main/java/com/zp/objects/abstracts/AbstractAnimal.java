package com.zp.objects.abstracts;

/**
 * 抽象方法：加上abstract关键字，然后去掉打括号，直接分号结束
 * 抽象类：抽象方法所在的类，必须是抽象类。在class之前协商abstract
 * <p>
 * 子类必须重写父类中的抽象方法
 *
 * @author zhoupeng
 */
public abstract class AbstractAnimal {

    /**
     * 吃的抽象方法
     */
    public abstract void eat();

    public String go() {
        System.out.println("动物都是会动的");
        return "abstract";
    }
}

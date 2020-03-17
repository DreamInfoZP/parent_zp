package com.zp.objects.threads;

/**
 * @author zhoupeng
 */
public class Ticket01Test {

    public static void main(String[] args) {
        Ticket01 run = new Ticket01();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}

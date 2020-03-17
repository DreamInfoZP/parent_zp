package com.zp.objects.interfaces.example1;

public class DemoComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        // 多态的写法
        USB usb = new Mouse();
        computer.useDevice(usb);

        // 使用Usb设备
        Keyborad keyborad = new Keyborad();

        computer.useDevice(keyborad);

        computer.powerOff();
    }
}

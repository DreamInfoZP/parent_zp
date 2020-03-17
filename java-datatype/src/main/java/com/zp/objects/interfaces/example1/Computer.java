package com.zp.objects.interfaces.example1;

/**
 * @author zhoupeng
 */
public class Computer {

    /**
     * 打开电脑
     */
    public void powerOn() {
        System.out.println("打开电脑");
    }

    /**
     * 关闭电脑
     */
    public void powerOff() {
        System.out.println("关闭电脑");
    }

    /**
     * usb设备
     *
     * @param usb 接口
     */
    public void useDevice(USB usb) {
        usb.open();

        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }

        if (usb instanceof Keyborad) {
            Keyborad keyborad = (Keyborad) usb;
            keyborad.input();
        }
        usb.close();
    }
}

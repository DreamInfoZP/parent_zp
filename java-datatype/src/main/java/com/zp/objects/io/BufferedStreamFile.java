package com.zp.objects.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhoupeng
 */
public class BufferedStreamFile {
    public static void main(String[] args) {
//        show01Output();

        show01Input();
    }

    private static void show01Input() {

    }

    /**
     * 使用步骤
     * 1.创建FileOutputStream对象，构造方法中绑定要输出的目的地
     * 2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象
     * 3.使用BufferedOutputStream对象中的write，把数据写入到内部缓冲去
     * 4.使用BufferedOutputStream对象中的方法flush,把内部缓冲区中的数据，刷新到文件中
     * 5.释放资源(会先调用flush方法刷新数据，第四部可以省略)
     */
    private static void show01Output() {
        try (FileOutputStream fos = new FileOutputStream("/Users/zhoupeng/Desktop/zp/output.txt")) {

            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("我要把这些数据写入到文件中".getBytes());

            bos.flush();
//            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

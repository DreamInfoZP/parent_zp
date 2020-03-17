package com.zp.objects.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author zhoupeng
 * <p>
 * 写入数据的原理(内存-->硬盘)
 * java程序-->JVM(java虚拟机)-->OS(操作系统)-->调用OS写数据的方法-->把数据写到文件中
 * <p>
 * 字节输出流的使用步骤:
 * 1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
 * 2.调用FileOutputStream对象中的方法write,把数据写入到文件中
 * 3.释放资源(流使用会占用一定的内存，使用完毕要把内存清空，提高程序的效率)
 * <p>
 * 换行写:写换行符号
 * windows:\r\n
 * linux:/n
 * mac:/r
 * <p>
 * <p>
 * 读取数据的原理(硬盘-->内存)
 * java程序-->JVM-->OS-->OS读取数据的方法-->读取文件
 * <p>
 * 字节输入流的使用步骤:
 * 1.创建FileInputStream对象，构造方法中绑定要读取的数据源
 * 2.使用FileInputStream对象中的方法read,读取文件
 * 3.释放资源
 */
public class OutputStreamTest {
    public static void main(String[] args) {
//        fileOutputStreamMethod();
        fileInputStreamMethod();
    }

    private static void fileInputStreamMethod() {
        try {
            FileInputStream fis = new FileInputStream("/Users/zhoupeng/Desktop/zp/a.txt");
            int len;
            while ((len = fis.read()) != -1) {
                System.out.print((char) len);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void fileOutputStreamMethod() {
        try {
            FileOutputStream fos = new FileOutputStream("/Users/zhoupeng/Desktop/zp/a.txt");
            fos.write(97);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

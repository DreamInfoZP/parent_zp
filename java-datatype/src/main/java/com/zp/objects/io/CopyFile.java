package com.zp.objects.io;

import java.io.*;

/**
 * 文件复制：一读一写
 * <p>
 * 明确：
 * 数据源：
 * 数据的目的地：
 * <p>
 * 文件复制的步骤：
 * 1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
 * 2.创建一个字节输入流对象，构造方法中绑定要写入的目的地
 * 3.使用字节输入流对象中的方法read读取文件
 * 4.使用字节输入出流中的方法write,把读取到的字节写入到目的地的文件中
 * 5.释放资源
 *
 * @author zhoupeng
 */
public class CopyFile {
    public static void main(String[] args) {
        String path = "/Users/zhoupeng/Desktop/zp";
        String fileName = "I_Tap102_20200217_001.xlsx";

        int index = fileName.lastIndexOf('.');
        String prefix = fileName.substring(0, index) + '1';
        String suffix = fileName.substring(index);

        String newFile = path + File.separator + prefix + suffix;

        try {
            File file = new File(newFile);

            if (file.createNewFile()) {
                FileInputStream fis = new FileInputStream(path + File.separator + fileName);
                FileOutputStream fos = new FileOutputStream(file);

                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }

                // 先关闭写的后关闭读的
                fos.close();
                fis.close();
            } else {
                System.out.println("异常情况请Debug分析");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

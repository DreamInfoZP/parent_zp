package com.zp.objects.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK9的新特新
 *  try的前边可以定义刘对象
 *  在try后边的()中可以直接引入流对象的名称(变量名)
 *  在try代码执行完毕之后，流对象也可以释放掉,不用谢finally
 *  格式
 *      A a = new A();
 *      B b = new B();
 *      try(a,b){
 *          可能会产生异常的代码
 *      }catch(异常类变量 变量名){
 *          异常的处理逻辑
 *      }
 * @author zhoupeng
 */
public class JDK9CopyFile {
    public static void main(String[] args) {
        String path = "/Users/zhoupeng/Desktop/zp";
        String fileName = "I_Tap102_20200217_001.xlsx";

        int index = fileName.lastIndexOf('.');
        String prefix = fileName.substring(0, index) + '1';
        String suffix = fileName.substring(index);

        String newFile = path + File.separator + prefix + suffix;
        File file = new File(newFile);
        try (
                FileInputStream fis = new FileInputStream(path + File.separator + fileName);
                FileOutputStream fos = new FileOutputStream(file)) {

//            if (file.createNewFile()) {


            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            // 先关闭写的后关闭读的
        } catch (IOException e) {
            System.out.println("异常情况请Debug分析");
            e.printStackTrace();
        }


    }
}

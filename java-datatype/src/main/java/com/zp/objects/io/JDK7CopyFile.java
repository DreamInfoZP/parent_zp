package com.zp.objects.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7的新特新
 * 在try后边可以增加一个()，在括号中可以定义流对象
 * 那么这个流对象的作用域就在try中有效
 * try中的代码执行完毕，会自动把刘对象释放，不用写finally
 *      格式
 *          try(定义刘对象;定义刘对象...){
 *              可能会产生异常的代码
 *          }catch(异常类变量 变量名){
 *              异常处理逻辑
 *          }
 *
 * @author zhoupeng
 */
public class JDK7CopyFile {
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

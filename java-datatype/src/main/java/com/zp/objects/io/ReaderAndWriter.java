package com.zp.objects.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 读取和写入字符
 *
 *
 * flush方法是和close方法
 *      flush:刷新缓冲区，刘对象可以继续使用
 *      close:现刷新缓冲区，然后通知系统释放资源。刘对象不可以再继续使用
 *
 * @author zhoupeng
 */


public class ReaderAndWriter {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("路径+文件");

            fw.write("aa");

//            fw.close();
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

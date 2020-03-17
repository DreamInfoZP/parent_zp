package com.zp.objects.files;

import java.io.File;

/**
 * @author zhoupeng
 */
public class FileStaticFinal {

    public static void main(String[] args) {
        /**
         * static String pathSeparator 与系统有关的路径分隔符
         * static char pathSeparatorChar 与系统有关的路径分隔符
         *
         * static String separator 与系统有关的默认名称分隔符，为了方便，他被表示为一个字符串
         * static char separatorChar 与系统有关的默认路径分隔符
         */

        String pathSeparator = File.pathSeparator;

        // 路径分隔符    windows:分号; linux:冒号:
        System.out.println(pathSeparator);

        String separator = File.separator;

        // 文件名称分隔符  windows:反斜杠\    linux:正斜杠/
        System.out.println(separator);
    }


}

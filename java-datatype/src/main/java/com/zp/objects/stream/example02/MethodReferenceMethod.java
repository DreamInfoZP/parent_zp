package com.zp.objects.stream.example02;


/**
 * 通过对象名引用成员方法
 * 使用前提是对象名已经存在，成员方法也是已经存在
 * 就可以使用对象名来引用成员方法
 *
 * @author zhoupeng
 */
public class MethodReferenceMethod {

    public static void printString(PrintTable p) {
        p.print("Hello");
    }

    public static void main(String[] args) {
        printString((s) -> {
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });


        /*
             使用方法引用优化Lambda
             对象已经存在的MethodRerObject
             成员方法也是已经存在的printUpperCaseString
             所以我们可以使用对象吗引用成员方法
         */
        printString(new MethodRerObject()::printUpperCaseString);

        printString(new MethodRerObject()::printLowerCaseString);
    }
}

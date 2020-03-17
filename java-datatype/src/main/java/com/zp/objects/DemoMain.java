package com.zp.objects;

import com.zp.objects.generic.GenericClass;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoMain {
    public static void main(String[] args) {

        Object aa = null;
        if (StringUtils.isNotEmpty((CharSequence) aa)) {
            System.out.println("12132");
        }

//        TGenericMethodTest();
        System.out.println(varArray(1, 2, 3));

    }

    private static int varArray(int... arr) {
        System.out.println(arr.length);
        return arr.length;
    }

    private static void TGenericMethodTest() {
        Collection<String> col = new ArrayList<>();
        Iterator<String> ite = col.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }
        System.out.println();


        GenericClass<String> gc = new GenericClass<>();
        String name1 = gc.getName();
        GenericClass gc1 = new GenericClass();

        Object name = gc1.getName();
    }
}

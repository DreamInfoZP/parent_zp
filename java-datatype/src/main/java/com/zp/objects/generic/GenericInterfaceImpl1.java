package com.zp.objects.generic;

import sun.security.x509.GeneralNameInterface;

public class GenericInterfaceImpl1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}

package com.hss.pattern.struct.adapterpattern;

import com.hss.pattern.struct.adapterpattern.classadapter.Adapter;
import com.hss.pattern.struct.adapterpattern.classadapter.Targetable;

public class Client {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}

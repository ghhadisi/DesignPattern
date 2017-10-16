package com.hss.pattern.struct.adapterpattern.classadapter;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

package com.hss.pattern.struct.adapterpattern.classadapter;

import com.hss.pattern.struct.adapterpattern.Source;
import com.hss.pattern.struct.adapterpattern.Targetable;

public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

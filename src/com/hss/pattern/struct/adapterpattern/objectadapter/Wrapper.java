package com.hss.pattern.struct.adapterpattern.objectadapter;

import com.hss.pattern.struct.adapterpattern.Source;
import com.hss.pattern.struct.adapterpattern.Targetable;

/**
 * Created by Administrator on 2017/10/16.
 */
public class Wrapper implements Targetable {
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

package com.hss.pattern.struct.adapterpattern;

import com.hss.pattern.struct.adapterpattern.classadapter.Adapter;
import com.hss.pattern.struct.adapterpattern.interfaceadapter.SourceSub1;
import com.hss.pattern.struct.adapterpattern.interfaceadapter.SourceSub2;
import com.hss.pattern.struct.adapterpattern.interfaceadapter.Sourceable;
import com.hss.pattern.struct.adapterpattern.objectadapter.Wrapper;

public class Client {
    public static void main(String[] args) {
//        Targetable target = new Adapter();


//        Source source = new Source();
//        Targetable target = new Wrapper(source);
//
//
//        target.method1();
//        target.method2();


        Sourceable source1 = new SourceSub1();
        Sourceable source2 = new SourceSub2();


        source1.method1();
        source1.method2();
        source2.method1();
        source2.method2();


    }
}

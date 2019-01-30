package com.hss.pattern.struct.proxypattern;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Source  implements Sourceable {

    @Override
    public void method() {
        System.err.println("the original method!");
    }
}

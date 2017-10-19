package com.hss.pattern.struct.proxypattern;

/**
 * Created by Administrator on 2017/10/19.
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        this.source = new Source();

    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }
    private void before() {
        System.out.println("before proxy!");
    }
}

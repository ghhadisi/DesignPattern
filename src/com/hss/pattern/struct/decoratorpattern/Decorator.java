package com.hss.pattern.struct.decoratorpattern;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @java.lang.Override
    public void method() {
        System.out.println("before decorator!");
        source.method();
        System.out.println("after decorator!");
    }
}

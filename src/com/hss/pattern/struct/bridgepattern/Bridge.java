package com.hss.pattern.struct.bridgepattern;

/**
 * Created by Administrator on 2017/10/23.
 */
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}

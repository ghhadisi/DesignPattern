package com.hss.pattern.struct.proxypattern;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Client {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}

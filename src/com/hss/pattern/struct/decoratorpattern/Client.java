package com.hss.pattern.struct.decoratorpattern;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Client {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decorator = new Decorator(source);
        decorator.method();
    }
}

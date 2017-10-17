package com.hss.pattern.struct.decoratorpattern;

/**
 * Created by Administrator on 2017/10/17.
 */
public class Source  implements Sourceable  {

    @java.lang.Override
    public void method() {
        System.out.println("the original method!");
    }
}

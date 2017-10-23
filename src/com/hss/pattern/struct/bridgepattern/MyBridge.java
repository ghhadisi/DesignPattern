package com.hss.pattern.struct.bridgepattern;

/**
 * Created by Administrator on 2017/10/23.
 */
public class MyBridge extends Bridge {

    @Override
    public void method() {
        getSource().method();


    }
}

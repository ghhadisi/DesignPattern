package com.hss.pattern.create.factorypattern;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SmsSend implements ISend {
    @Override
    public void send() {
        System.out.println("SmsSend send");

    }
}

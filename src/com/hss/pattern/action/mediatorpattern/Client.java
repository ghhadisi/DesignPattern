package com.hss.pattern.action.mediatorpattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}

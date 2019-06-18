package com.hss.pattern.action.mediatorpattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 exe!");
    }
}

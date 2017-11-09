package com.hss.pattern.action.mediatorpattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public class User2 extends User {

    public User2(Mediator mediator){
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exe!");
    }
}

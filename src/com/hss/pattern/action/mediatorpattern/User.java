package com.hss.pattern.action.mediatorpattern;

/**
 * Created by Administrator on 2017/11/9.
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator(){
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}

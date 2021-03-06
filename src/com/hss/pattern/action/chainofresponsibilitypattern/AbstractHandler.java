package com.hss.pattern.action.chainofresponsibilitypattern;

/**
 * Created by Administrator on 2017/11/1.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}

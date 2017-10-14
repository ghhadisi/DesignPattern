package com.hss.pattern.create.builderpattern;

/**
 * Created by Administrator on 2017/10/14.
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}

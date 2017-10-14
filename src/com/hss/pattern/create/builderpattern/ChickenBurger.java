package com.hss.pattern.create.builderpattern;

/**
 * Created by Administrator on 2017/10/14.
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

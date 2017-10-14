package com.hss.pattern.create.builderpattern;

/**
 * Created by Administrator on 2017/10/14.
 */
public class VegBurger extends Burger {

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}

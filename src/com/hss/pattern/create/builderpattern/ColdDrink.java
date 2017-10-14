package com.hss.pattern.create.builderpattern;

/**
 * Created by Administrator on 2017/10/14.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

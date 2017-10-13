package com.hss.pattern.create.abstractfactorypattern;

public class Blue implements  IColor {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}

package com.hss.pattern.create.abstractfactorypattern;

public abstract class AbstractFactory {
    public abstract IShape getShape(String shape) ;
    public abstract IColor getColor(String color);
}

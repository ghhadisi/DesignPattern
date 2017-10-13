package com.hss.pattern.create.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public IShape getShape(String shape) {
        return null;
    }

    @Override
    public IColor getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}

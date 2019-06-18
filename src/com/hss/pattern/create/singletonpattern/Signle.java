package com.hss.pattern.create.singletonpattern;

public enum Signle {
    INSTANCE;

    public int getAge() {
        return 20;
    }

    public static void main(String[] args) {
        System.out.println(Signle.INSTANCE.getAge());
    }
}

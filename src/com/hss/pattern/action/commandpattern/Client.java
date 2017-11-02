package com.hss.pattern.action.commandpattern;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new MyCommand(new Receiver()));
        invoker.action();
    }
}

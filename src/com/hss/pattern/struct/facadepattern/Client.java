package com.hss.pattern.struct.facadepattern;

/**
 * Created by Administrator on 2017/10/23.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}

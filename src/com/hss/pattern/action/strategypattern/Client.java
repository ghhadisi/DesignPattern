package com.hss.pattern.action.strategypattern;

/**
 * Created by Administrator on 2017/10/29.
 */
public class Client {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}

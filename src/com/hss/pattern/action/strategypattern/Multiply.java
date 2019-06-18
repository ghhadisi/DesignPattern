package com.hss.pattern.action.strategypattern;

/**
 * Created by Administrator on 2017/10/29.
 */
public class Multiply extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}

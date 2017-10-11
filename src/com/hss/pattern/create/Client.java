package com.hss.pattern.create;

import com.hss.pattern.create.factorypattern.commomfactory.SendFactory;

/**
 * Created by Administrator on 2017/10/11.
 */
public class Client {
    public static void main(String[] args) {
        // 普通工厂
        SendFactory sendFactory = new SendFactory();
        sendFactory.produce("sms").send();
        //多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，
        com.hss.pattern.create.factorypattern.mutifactory.SendFactory sendFactory1= new com.hss.pattern.create.factorypattern.mutifactory.SendFactory();
        sendFactory1.produceMail().send();

        //静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
        com.hss.pattern.create.factorypattern.staticfactory.SendFactory.produceSms().send();
    }
}

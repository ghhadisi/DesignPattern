package com.hss.pattern.create.abstractfactorypattern;

import com.hss.pattern.create.ISender;

/**
 * Created by Administrator on 2017/10/14.
 */
public class Client {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        ISender sender = provider.produce();
        sender.send();
    }

//    其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
}

package com.hss.pattern.create.abstractfactorypattern;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.SmsSender;

/**
 * Created by Administrator on 2017/10/14.
 */
public class SendSmsFactory implements Provider {

    @Override
    public ISender produce() {
        return new SmsSender();
    }
}
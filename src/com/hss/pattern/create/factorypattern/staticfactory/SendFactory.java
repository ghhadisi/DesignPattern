package com.hss.pattern.create.factorypattern.staticfactory;

import com.hss.pattern.create.factorypattern.ISend;
import com.hss.pattern.create.factorypattern.MailSend;
import com.hss.pattern.create.factorypattern.SmsSend;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public static ISend produceSms(){
        return new SmsSend();
    }
    public static ISend produceMail(){
        return new MailSend();
    }
}

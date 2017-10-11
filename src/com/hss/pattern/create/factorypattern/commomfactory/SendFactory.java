package com.hss.pattern.create.factorypattern.commomfactory;

import com.hss.pattern.create.factorypattern.ISend;
import com.hss.pattern.create.factorypattern.MailSend;
import com.hss.pattern.create.factorypattern.SmsSend;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public ISend produce(String type){
        switch (type){
            case "mail":
                return new MailSend();
            case "sms":
                return new SmsSend();
        }
        return null;
    }
}

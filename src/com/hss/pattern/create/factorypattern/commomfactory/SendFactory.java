package com.hss.pattern.create.factorypattern.commomfactory;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.MailSender;
import com.hss.pattern.create.SmsSender;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public ISender produce(String type){
        switch (type){
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
        }
        return null;
    }
}

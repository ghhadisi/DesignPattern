package com.hss.pattern.create.factorypattern.staticfactory;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.MailSender;
import com.hss.pattern.create.SmsSender;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public static ISender produceSms() {
        return new SmsSender();
    }

    public static ISender produceMail() {
        return new MailSender();
    }
}

package com.hss.pattern.create.abstractfactorypattern;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.MailSender;

/**
 * Created by Administrator on 2017/10/14.
 */
public class SendMailFactory implements Provider {
    @Override
    public ISender produce() {
        return new MailSender();
    }
}

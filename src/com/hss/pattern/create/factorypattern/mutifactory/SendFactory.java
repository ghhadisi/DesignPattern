package com.hss.pattern.create.factorypattern.mutifactory;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.MailSender;
import com.hss.pattern.create.SmsSender;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public ISender produceSms(){
        return new SmsSender();
    }
    public ISender produceMail(){
        return new MailSender();
    }
}

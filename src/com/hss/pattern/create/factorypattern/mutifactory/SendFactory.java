package com.hss.pattern.create.factorypattern.mutifactory;

import com.hss.pattern.create.factorypattern.ISend;
import com.hss.pattern.create.factorypattern.MailSend;
import com.hss.pattern.create.factorypattern.SmsSend;

/**
 * Created by Administrator on 2017/10/11.
 */
public class SendFactory {
    public ISend produceSms(){
        return new SmsSend();
    }
    public ISend produceMail(){
        return new MailSend();
    }
}

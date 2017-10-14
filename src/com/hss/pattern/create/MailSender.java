package com.hss.pattern.create;

/**
 * Created by Administrator on 2017/10/11.
 */
public class MailSender implements ISender {
    @Override
    public void send() {
        System.out.println("Mail send");
    }
}

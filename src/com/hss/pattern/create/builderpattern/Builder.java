package com.hss.pattern.create.builderpattern;

import com.hss.pattern.create.ISender;
import com.hss.pattern.create.MailSender;
import com.hss.pattern.create.SmsSender;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/10/14.
 */
public class Builder {
    private List<ISender> list = new ArrayList<ISender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

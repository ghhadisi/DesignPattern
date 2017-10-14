package com.hss.pattern.create.abstractfactorypattern;

import com.hss.pattern.create.ISender;

/**
 * Created by Administrator on 2017/10/14.
 */
public interface Provider {
    public ISender produce();
}

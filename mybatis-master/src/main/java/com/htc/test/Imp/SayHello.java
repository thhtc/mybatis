package com.htc.test.Imp;

import com.htc.test.Say;

/**
 * Created by Administrator on 2019/1/18.
 */
public class SayHello implements Say {
    @Override
    public String say(String name) {
        return "hello！"+name;
    }
}

package com.htc.test.Imp;

import com.htc.proxy.HtcProxyFactory;
import com.htc.test.Person;

/**
 * Created by Administrator on 2019/1/18.
 */
public class LiuDeHuaProxy {
    private Person ldh = new LiuDeHua();

    public Person getProxy() {
        HtcProxyFactory proxy=new HtcProxyFactory(ldh);
        return  (Person)proxy.newInstance();
    }

}

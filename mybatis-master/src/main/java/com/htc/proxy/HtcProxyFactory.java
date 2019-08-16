package com.htc.proxy;

import com.htc.test.Person;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2019/1/18.
 */
public class HtcProxyFactory<T> {
    private final T htcInterface;
    public HtcProxyFactory(T htcInterface){
        this.htcInterface = htcInterface;
    }

    public T newInstance(){
        return (T) Proxy.newProxyInstance(this.htcInterface.getClass().getClassLoader()
                ,this.htcInterface.getClass().getInterfaces(),new HtcInvocationHandler(this.htcInterface));


    }

    public T newInstanceByInterface(Class<T> type){
        return (T) Proxy.newProxyInstance(type.getClassLoader()
                ,new Class[]{type},new HtcInvocationHandler(this.htcInterface));


    }

    /*
    Say 为一个接口
    Say say= (Say) Proxy.newProxyInstance(Say.class.getClassLoader()
            ,new Class[]{Say.class},new HtcInvocationHandler(null));*/


}

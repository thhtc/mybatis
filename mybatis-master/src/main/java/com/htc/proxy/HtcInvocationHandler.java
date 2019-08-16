package com.htc.proxy;

import com.htc.test.Person;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/1/18.
 */
public class HtcInvocationHandler<T> implements InvocationHandler , Serializable {
    private static final long serialVersionUID = -68L;

    private final T htcInterface;
    public HtcInvocationHandler(T htcInterface){
        this.htcInterface = htcInterface;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return " proxy handler ";
        //return method.invoke(htcInterface,args);
    }
}

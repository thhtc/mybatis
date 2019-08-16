package com.htc;

import com.htc.mybatis.TmpTables;
import com.htc.mybatis.TmpTablesMapper;
import com.htc.proxy.HtcInvocationHandler;
import com.htc.proxy.HtcProxyFactory;
import com.htc.test.Imp.LiuDeHuaProxy;
import com.htc.test.Imp.SayHello;
import com.htc.test.Person;
import com.htc.test.Say;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2019/1/14.
 */
public class Main {

    public static void main(String[] arg){
        try {
            org.apache.ibatis.logging.LogFactory.useLog4JLogging();
            String resource = "resources/mybatis.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            try {

                //TmpTables tab = (TmpTables) session.selectOne("com.htc.mybatis.htcMapper.selectTables", 1);

                TmpTablesMapper mapper=session.getMapper(TmpTablesMapper.class);
                TmpTables tab = mapper.selectTmpTables(1);


                        System.out.println(tab.toString());

            } finally {
                session.close();
            }


            String rs="";
           /* LiuDeHuaProxy p=new LiuDeHuaProxy();
            rs=p.getProxy().dance("sssss");
            System.out.println(rs);
            rs=p.getProxy().sing("xxx");
            System.out.println(rs);*/

            /*Say say= new SayHello();
            HtcProxyFactory proxy=new HtcProxyFactory(say);
            rs=((Say)proxy.newInstance()).say("htc");
            System.out.println(rs);*/



            /*Say say= (Say) Proxy.newProxyInstance(Say.class.getClassLoader()
                    ,new Class[]{Say.class},new HtcInvocationHandler(null));
            rs=say.say("htc");
            System.out.println(rs);


            HtcProxyFactory proxy=new HtcProxyFactory(null);
            rs=((Say)proxy.newInstanceByInterface(Say.class)).say("htc");
            System.out.println(rs);*/




        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}

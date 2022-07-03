package com.holden.spring.proxy;

import com.holden.spring.service.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName sheji-JDKProxy
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月23日22:48 - 周四
 * @Describe
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        Class[] interfaces = {PersonDao.class};
        PersonDao instance = (PersonDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new PersonDaoProxy(new PersonDaoImpl()));

        System.out.println(instance.add(1, 2));

    }
}

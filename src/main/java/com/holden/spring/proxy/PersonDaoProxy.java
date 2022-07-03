package com.holden.spring.proxy;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName sheji-PersonDaoProxy
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月23日23:12 - 周四
 * @Describe
 */
public class PersonDaoProxy implements InvocationHandler {
    // 把创建的是谁的代理对象，把谁传进来
    //通过有参构造进行传递
    private Object obj;

    public PersonDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前
        System.out.println(method.getName() + "||" + Arrays.toString(args));
        Object[] args2 = {4,5};

        //给传参中的每一个数+1再交给add，这样就可以不直接改变PersonDaoImpl中的代码了
        for (int i = 0; i < args.length; i++) {
            args[i] = Integer.parseInt(args[i].toString()) + 1;
        }


        //被增强的方法执行,将(1,2)=>(2,3)再传给PersonDaoImpl中的add方法
        //这里才是真正传参的地方
        Object invoke = method.invoke(obj, args);


        //方法之后
        System.out.println("方法之后执行" + obj);

        return invoke;
    }
}

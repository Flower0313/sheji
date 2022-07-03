package com.holden.spring.proxy;

/**
 * @ClassName sheji-PersonDaoImpl
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月23日22:46 - 周四
 * @Describe
 */
public class PersonDaoImpl implements PersonDao {
    @Override
    public int add(int a, int b) {
        //如何在不改变这个源码的情况下，在a+b前或后新增功能呢
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}

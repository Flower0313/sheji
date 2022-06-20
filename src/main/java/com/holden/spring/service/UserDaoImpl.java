package com.holden.spring.service;

import org.springframework.stereotype.Repository;

/**
 * @ClassName sheji-UserDaoImpl
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月20日22:12 - 周一
 * @Describe
 */

@Repository(value = "userDaoImpl")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add...");
    }
}

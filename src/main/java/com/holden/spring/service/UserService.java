package com.holden.spring.service;

import org.springframework.stereotype.Service;

/**
 * @ClassName sheji-UserService
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月20日00:12 - 周一
 * @Describe
 */

//等价于<bean id='userService' class='全路径'>
//value可以省略，默认就是类名称，然后首字母小写
@Service(value = "userService")
public class UserService {

    public void add() {
        System.out.println("user_add...");
    }
}

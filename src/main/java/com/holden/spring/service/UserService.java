package com.holden.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    //不需要添加set方法
    //添加注入
    //根据类型不好找，因为若有多个实现类呢
    @Autowired//更建议使用此种方式
    @Qualifier(value="userDaoImpl")//要配合AutoWired使用，可以找到具体的类
    private UserDao userDao;

    //@Resource //根据类型进行注入
    @Resource(name = "userDaoImpl") //根据名称注入
    private UserDao userDao2;

    @Value(value = "xiaohua")//普通类型属性的注入
    private String name;

    public void show() {
        System.out.println("service add...");
        userDao2.add();
        System.out.println(name);
    }
}

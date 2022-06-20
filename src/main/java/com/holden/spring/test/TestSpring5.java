package com.holden.spring.test;

import com.holden.spring.bean.Book;
import com.holden.spring.bean.Order;
import com.holden.spring.bean.User;
import com.holden.spring.config.SpringConfig;
import com.holden.spring.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName sheji-TestSpring5
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月18日10:50 - 周六
 * @Describ
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        //1.加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象,这里的user就是配置文件中id名
        User user = context.getBean("user", User.class);

        //3.调用方法
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //基于xml的set方式依赖注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.show();
    }

    @Test
    public void testOrder(){
        //基于xml的有参构造的依赖注入
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);

        order.show();
    }

    @Test
    public void TestService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.show();
    }

    @Test
    public void TestService2(){
        //将扫描配置文件改为配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.show();
    }
}

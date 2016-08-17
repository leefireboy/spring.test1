/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test;

import java.sql.Connection;
import java.util.Calendar;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.libing.test.dao.ExampleBean;
import com.libing.test.dao.JDBCDataSource;
import com.libing.test.dao.User;
import com.libing.test.dao.UserDAO;
import com.libing.test.dao.UserService;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月17日下午11:03:47
 */
public class TestCase {

    @Ignore
    @Test
    public void testInitContext() {

        // 实例化Spring容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

    }

    @Ignore
    @Test
    public void testCreateBeanObject() {

        // 实例化Spring容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 1.用构造器来实例化的方式
        // 利用Spring调用构造器GregorianCalendar创建Calendar实例
        // Calendar cal1 = (Calendar)ac.getBean("calendarObj1");// 方式1
        Calendar cal1 = ac.getBean("calendarObj1", Calendar.class);// 方式2
        System.out.println("cal1:" + cal1);

        // 2.用静态工厂方法来实例化的方式
        // 利用Spring调用Calendar的静态工厂方法getInstance()创建Calendar实例
        Calendar cal2 = ac.getBean("calendarObj2", Calendar.class);
        System.out.println("cal2:" + cal2);

        // 3.用实例工厂方法来实例化的方式
        // 利用Spring调用GregorianCalendar对象作为工厂，调用getTime()方法创建Date类型对象实例
        Date date = ac.getBean("dateObj", Date.class);
        System.out.println("date:" + date);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();

    }

    @Ignore
    @Test
    public void testExampleBean() {

        // 实例化Spring容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 获取ExampleBean对象
        ExampleBean bean1 = ac.getBean("exampleBean", ExampleBean.class);
        ExampleBean bean2 = ac.getBean("exampleBean", ExampleBean.class);
        System.out.println(bean1 == bean2);

        // 关闭Spring容器，注意AbstractApplicationContext类型定义了close()方法
        AbstractApplicationContext ctx = (AbstractApplicationContext) ac;
        ctx.close();

    }

    @Ignore
    @Test
    public void testJDBCDataSource() throws Exception {

        // 实例化Spring容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        JDBCDataSource ds = ac.getBean("dataSource", JDBCDataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);

    }

    @Ignore
    @Test
    public void testMysqlUserDAO() {

        /** 构造器参数注入 */
        // 实例化Spring容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);

        // 获取 MysqlUserDAO 的实例
        UserDAO userDAO = ac.getBean("userDAO", UserDAO.class);
        // 查询客户对象
        User libing = userDAO.findByName("libing");
        System.out.println(libing);

    }

    @Test
    public void testUserService() {
        // 实例化 Spring 容器示例
        String conf = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);

        // 获取 UserService 实例
        UserService userService = ac.getBean("userService", UserService.class);
        // 调用登录方法测试自动注入结果
        User user = userService.login("libing", "123456");
        System.out.println(user);

        AbstractApplicationContext aac = (AbstractApplicationContext) ac;
        aac.close();
    }

}

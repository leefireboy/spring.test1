/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test.dao;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月18日下午4:02:30
 */
public class UserService {

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User login(String name, String pwd) {
        User user = userDAO.findByName(name);
        if (user.getPwd().equals(pwd)) {
            System.out.println("密码正确，登录成功！");
            return user;
        }
        return null;
    }

}

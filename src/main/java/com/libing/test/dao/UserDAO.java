/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test.dao;

/**
 * <P>
 * Description:用户数据对象访问接口
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月18日下午2:20:21
 */
public interface UserDAO {
    public User findByName(String name);
}


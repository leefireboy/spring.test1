/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test.dao;

/**
 * <P>
 * Description:TODO
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月17日下午11:45:49
 */
public class ExampleBean {

    public ExampleBean() {
        super();
        System.out.println("实例化ExampleBean");
    }

    public void execute() {
        System.out.println("执行ExampleBean处理");
    }

    public void init() {
        System.out.println("初始化ExampleBean对象");
    }

    public void destroy() {
        System.out.println("销毁ExampleBean对象");
    }

}

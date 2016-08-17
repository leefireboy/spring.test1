/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <P>
 * Description:
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月18日上午1:00:25
 */
public class JDBCDataSource {

    private String driver;
    private String url;
    private String user;
    private String pwd;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        try {
            // 注册数据库驱动
            Class.forName(driver);
            this.driver = driver;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, user, pwd);
        return conn;
    }

    public void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}

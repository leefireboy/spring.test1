/*
 * Copyright (c) 2015 Sohu TV. All rights reserved.
 */
package com.libing.test.dao;

/**
 * <P>
 * Description:User表实体类
 * </p>
 * @author "libing"
 * @version 1.0
 * @Date 2015年12月18日下午2:22:04
 */
public class User {

//            create table users(
//            id bigint(20) NOT NULL AUTO_INCREMENT,
//            name varchar(20) NOT NULL,
//            pwd varchar(20) NOT NULL,
//            phone varchar(11) NOT NULL,
//            PRIMARY KEY(id),
//            UNIQUE KEY(name)
//            ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='用户表';
//
//            insert into users(name,pwd,phone) values('libing','123456','15620230370');

    private int id;
    private String name;
    private String pwd;
    private String phone;

    public User() {
        super();
    }

    public User(int id, String name, String pwd, String phone) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
    }

    public User(String name, String pwd, String phone) {
        super();
        this.name = name;
        this.pwd = pwd;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        } else if (!phone.equals(other.phone))
            return false;
        if (pwd == null) {
            if (other.pwd != null)
                return false;
        } else if (!pwd.equals(other.pwd))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + ", phone=" + phone + "]";
    }

}

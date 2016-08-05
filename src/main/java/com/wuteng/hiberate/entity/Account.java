package com.wuteng.hiberate.entity;

import javax.persistence.Entity;
import java.sql.Date;

/**
 * Created by wuteng1 on 2016/8/4.
 */

public class Account {
    private Integer id;
    private String name;
    private Integer balance;
    private Date date;

    public Account(String name, Integer balance, Date date) {
        this.name = name;
        this.balance = balance;
        this.date = date;
    }

    public Account() {
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}

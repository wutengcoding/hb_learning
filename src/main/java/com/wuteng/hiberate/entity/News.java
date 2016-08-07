package com.wuteng.hiberate.entity;

import java.util.Date;

/**
 * Created by wuteng1 on 2016/8/5.
 */
public class News {

    private Integer id;
    private String name;
    private Date date;

    public News() {
    }

    public News(String name, Date date) {

        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

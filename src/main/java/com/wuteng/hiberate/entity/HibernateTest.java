package com.wuteng.hiberate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * Created by wuteng1 on 2016/8/5.
 */
public class HibernateTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        sessionFactory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }

    @After
    public void destroy(){
        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void testDelete(){
        News news = new News("xiix", new Date());
        news.setId(4);
        session.delete(news);
        System.out.println(news);
    }
    @Test
    public void testUpdate(){
        News news = new News("helloworld", new Date());
        news.setId(1);
        session.saveOrUpdate(news);
    }
    @Test
    public void testLoad(){
        News news = session.load(News.class, 1);
        System.out.println(news.getClass().getName());
        session.close();
        System.out.println(news);
    }

    @Test
    public void testGet(){
        News news = session.get(News.class, 10);
        System.out.println(news);
    }
    @Test
    public void test(){
//        News news = new News("oracle", new Date());
//        session.save(news);
//        News news1 = session.get(News.class, 1);
//        session.refresh(news1);
//        News news2 = session.get(News.class, 1);

        News news = new News("java", new Date());
        System.out.println(news);

//        news.setId(12);
        session.save(news); //setId is not working

//        session.persist(news);
        System.out.println(news);

    }
}

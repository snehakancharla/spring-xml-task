package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
public class Main {

        public static void main(String ar[]) {
            // Task-1 using Application context
            ApplicationContext bean=new ClassPathXmlApplicationContext("constructorbean.xml");
            /*Movie movie =(Movie)bean.getBean("beanbytype");
            System.out.println(movie.getActor());*/


            Movie movie1 =(Movie)bean.getBean("beanbyname");
            System.out.println(movie1.getActor());




        }
}

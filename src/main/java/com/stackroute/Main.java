package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main(String ar[]) {

            ApplicationContext applicationContext3=new ClassPathXmlApplicationContext("constructor.xml");
            Movie movie1=(Movie)applicationContext3.getBean("movie1");
            System.out.println(movie1.toString());



        }
}

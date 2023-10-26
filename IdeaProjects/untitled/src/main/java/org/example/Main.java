package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("bean.xml");

        Books b=ap.getBean(Books.class);
        b.displayBookName();

        }
    }


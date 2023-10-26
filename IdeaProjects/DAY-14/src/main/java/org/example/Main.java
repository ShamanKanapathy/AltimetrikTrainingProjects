package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        Bill b=ac.getBean(Bill.class);
        b.payBill();
        Payment p=ac.getBean(Payment.class);
        p.makePayment();



    }
}

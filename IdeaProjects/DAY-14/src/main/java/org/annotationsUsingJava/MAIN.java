package org.annotationsUsingJava;

import org.example.Bill;
import org.example.Payment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
    public static void main(String[] args) {
            ApplicationContext ac=new ClassPathXmlApplicationContext(String.valueOf(Beans.class));
            Bill b=ac.getBean(Bill.class);
            b.payBill();
            Payment p=ac.getBean(Payment.class);
            p.makePayment();



        }
    }



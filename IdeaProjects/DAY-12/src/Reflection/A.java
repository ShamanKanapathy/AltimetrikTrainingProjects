package Reflection;

import Generics.DEMO;

public class A {

        public static void main(String[] args) {
            Generics.DEMO<String> s=new Generics.DEMO<>();
            s.setI("CHENNAI");
            System.out.println(s.getI());

            Generics.DEMO<Double> d=new Generics.DEMO<>();
            d.setI(34567897654d);
            System.out.println(d.getI());

        }
    }



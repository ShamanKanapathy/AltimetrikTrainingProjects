package Generics;

import java.util.ArrayList;

public class Main {

//    static void print(Integer i){
//        System.out.println(i+" "+i.getClass());
//
//    }
//
//    static void print(Float i){
//        System.out.println(i+" "+i.getClass());
//    }

    //instaed of all the commented line we just have to men tion this one syntax:

    static<T, U> T print(T i1,U i2){
        return i1;
    }

        public static void main(String[] args) {

        Main.print(45,56f);
        Main.print(45f,5);
        students s=new students();
            System.out.println(print(12,12.6));

            ArrayList<Integer> al = new ArrayList<>();

    }
}

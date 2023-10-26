package Generics;

import java.util.ArrayList;

public class HI {
    public static void main(String[] args) {


//        ArrayList alist = new ArrayList();
//        alist.add("Altimetrik");
//        alist.add("Suiii");
//       alist.add(4567890);
//
//        Object obj=alist.get(0);
//        String str=(String)obj;
//        System.out.println(str);
//        Object obj2=alist.get(2);
//        Integer in=(Integer)obj2;
//        System.out.println(in);



        //simplified code by specifying the Generics

        ArrayList <String>alist = new ArrayList();
        alist.add("Altimetrik");
        alist.add("Suiii");


        String str=alist.get(0);
        System.out.println(str);

        String str1=alist.get(1);
        System.out.println(str1);

    }
}
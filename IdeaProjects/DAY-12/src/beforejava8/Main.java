package beforejava8;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);
        System.out.println(System.currentTimeMillis());

        java.sql.Date d1=new java.sql.Date(System.currentTimeMillis());
        System.out.println(d1);
    }
}
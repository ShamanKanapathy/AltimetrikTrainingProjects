package Enumeration;
//inside enum we can declare variable,constructor,method(static,instance and abstract).

public enum Days {//declaring enum
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    int myname=123;//declaring variable

    Days(){//declaring constructor
        System.out.println("days constructor is called!");
    }


    void display(){
        System.out.println("Display is called*!!!");

    }

}

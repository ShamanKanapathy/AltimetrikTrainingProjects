package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JREF {
    public static <Reflection> void main(String[] args) throws ClassNotFoundException {
       Class<?> c= Class.forName("A");

       Method[] m=c.getDeclaredMethods();

        for (Method method:m) {
            System.out.println(method);

        }
        Field[] f=c.getDeclaredFields();

        for (Field field:f) {
            System.out.println(field);

        }
    }
}
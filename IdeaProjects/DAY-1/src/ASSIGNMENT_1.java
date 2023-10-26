/*
a)Declare 2 int variables miles and yards and one double variable for kilometers
b) Initialize the variables to hold the number of miles and yards in marathon repectively
(miles to 26 and yards to 385)
c) Write an expression to calculate kilometers from miles and yards
d) save the result of expression in the variable kilometers.
one mile is 1.609 kilometers. There are 1760.0 yards in a mile */

public class ASSIGNMENT_1 {
    public static void main(String [] args){
        int miles=26;
        int yards=385;
        double km=1;

        double x=miles*1.609;
        double y=yards/1760.0*1.609;
        km=x+y;
        System.out.println("kilometer is:"+km);
    }
    }

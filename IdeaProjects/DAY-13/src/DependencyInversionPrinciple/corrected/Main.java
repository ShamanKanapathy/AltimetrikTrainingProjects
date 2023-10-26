package DependencyInversionPrinciple.corrected;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter the payment method");
        System.out.println("1. Card Payemnt");
        System.out.println("2. upi payment");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        if(i==1){
            Cardpayment cd=new Cardpayment();
            airtel a=new airtel(cd);
            a.recharge();
        }
        if(i==2) {
            Upipayment up = new Upipayment();
           airtel  a = new airtel(up);
            a.recharge();
        }
    }
}

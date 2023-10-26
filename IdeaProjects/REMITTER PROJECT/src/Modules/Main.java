package Modules;

import controller.RemitterController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
///REMITTER INFO///
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        System.out.println("ENTER YOUR ACCOUNT NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int ac = sc.nextInt();
        System.out.println("ENTER YOUR PASSWORD:");
        String ps = sc.next();

        RemitterController remitterController = new RemitterController();

       if(remitterController.login(ac,ps)){

           System.out.println("1.Register Beneficiary");
           System.out.println("2.Fund Transfer.");
           System.out.println("3.Exit.");

           System.out.println("Enter value between 1,2 and 3!");
           int i=sc.nextInt();
           switch (i){

               case 1:
                   System.out.println("Entering into the Register Beneficiary");


                   ///BENEFICIARY INFO///

                   System.out.println("ENTER YOUR ACCOUNT NUMBER:");
                   Scanner an= new Scanner(System.in);
                   int account = an.nextInt();

                   System.out.println("ENTER YOUR NAME:");
                   String name = an.next();

                   System.out.println("Bank name:");
                   String bankName=an.next();

                   System.out.println("IFSC:");
                   String  ifsc =an.next();

                   System.out.println("Current balance:");
                   int cb=an.nextInt();

                   System.out.println("Email Id:");
                   String email=an.next();
                   Beneficiary_Info bi=new Beneficiary_Info();
                   bi.setAccount_number(account);
                   bi.setName(name);
                   bi.setBank_name(bankName);
                   bi.setIFSC_Code(ifsc);
                   bi.setCurrent_balance(cb);
                   bi.setEmail_id(email);




               case 2:
                   System.out.println("Entering into the Fund Transfer");

                   ////FUND TRANSFER////

                   System.out.println("Enter Beneficiary Account Number:");
                   Scanner s=new Scanner(System.in);
                   int ban=s.nextInt();


                   System.out.println("Enter Remitter Account Number:");
                   int ran=s.nextInt();

                   System.out.println("Enter the Amount to be Transferred:");
                   int at=s.nextInt();
                   Fund_transfer ft=new Fund_transfer();
                   ft.setBeneficiary_account_number(ban);
                   ft.setTransaction_amount(String.valueOf(ran));
                   ft.setRemitter_account_number(at);

               default:
                   System.exit(1);

           }
       }
       else{
           System.out.println("Invalid Credentials!!");
       }


    }
}

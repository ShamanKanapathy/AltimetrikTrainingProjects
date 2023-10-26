import java.util.Scanner;

public class CreditCardPayment {
    public static void main(String[] args) throws InvalidCardNumberException {
        Scanner sc=new Scanner(System.in);
        String s="Check if you have entered 16 digits number";
        System.out.println("Enter the number:");
        String cardNumber=sc.next();
        if(cardNumber.length()!=16){
            throw new InvalidCardNumberException(s);
        }else{
            System.out.println("Transaction is successful");
        }


        System.out.println("Enter the Cardholder name:");
        String name= sc.next();
        System.out.println(name);

    }
}

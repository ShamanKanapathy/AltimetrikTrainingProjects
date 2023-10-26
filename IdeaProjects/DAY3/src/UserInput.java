import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter the loan amount");
        int loan=sc.nextInt();
        System.out.println("Enter the tenture");
        int  tenture=sc.nextInt();
        System.out.println("Enter the interest amount:");
        float interestAmount=sc.nextFloat();


        EmiCalculator emiCal= new EmiCalculator();
        float finalEmi= emiCal.calculateEmi(34,4,5
        );
        System.out.println(finalEmi);





    }
}

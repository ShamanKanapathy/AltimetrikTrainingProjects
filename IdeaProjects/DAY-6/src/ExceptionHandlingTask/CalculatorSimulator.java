package ExceptionHandlingTask;

import java.util.Scanner;

public class CalculatorSimulator{

    public static void main(String[] args) throws CountryNotValidException, UserNameNotValid, TaxNotEligibleException {
        String empName;
        boolean isIndian;
        Double empSal;

        Scanner sc=new Scanner(System.in);
        empName=sc.next();
        isIndian=sc.nextBoolean();
        empSal=sc.nextDouble();

        TaxCalculator Tc=new TaxCalculator();
        Double TaxAmount =Tc.calculateTax(empName,isIndian,empSal);

        System.out.println(TaxAmount);






        }
    }






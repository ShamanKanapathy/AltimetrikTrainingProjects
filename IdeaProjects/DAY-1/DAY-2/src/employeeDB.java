import java.util.Scanner;

public class employeeDB {

    public employeeDB() {

        System.out.println("Enter the value for the the employee database:");
        Scanner sc=new Scanner(System.in);
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();
        sc.nextInt();

    }

    public static void main(String []args) {

        employeeDB e1 = new employeeDB();
        employeeDB e2 = new employeeDB();
        employeeDB e3 = new employeeDB();
        employeeDB e4 = new employeeDB();

        employeeDB[] employeeList = {e1,e2,e3,e4};
    }
}

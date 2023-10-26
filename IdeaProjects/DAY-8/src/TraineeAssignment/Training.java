package TraineeAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Training extends Trainee {
    public static void main(String[] args) {
        ArrayList<Trainee> al = new ArrayList<>();

        for (int i = 0; i <6 ; i++) {


            Scanner sc = new Scanner(System.in);
            Trainee t1 = new Trainee();
            System.out.println("Enter Trainee name:");
            t1.setName(sc.nextLine());
            System.out.println("Enter Trainee Email:");
            t1.setEmail(sc.nextLine());
            System.out.println("Enter Trainee Id:");
            t1.setPrivateid(sc.nextLine());
            al.add(t1);


        }

        for (Trainee t:al) {
            System.out.println(t);

        }
    }

}

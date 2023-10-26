import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values");
        for (double i = 0; i < 5; i++) {
            sc.nextDouble();

            ArrayList<Double> db = new ArrayList<>();
            Iterator l = db.iterator();
            while (((Iterator<?>) l).hasNext()) {
                System.out.println(l.next());

            }

        }
    }
}

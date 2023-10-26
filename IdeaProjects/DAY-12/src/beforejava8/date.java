package beforejava8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class date {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the DOB(dd-MM-yyyy):");
        String dob=sc.nextLine();
        System.out.println(dob);
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date d=sdf.parse(dob);
            System.out.println(d);
            SimpleDateFormat sdf1=new SimpleDateFormat("E,MMMM dd,yyyy");
            String str=sdf1.format(d);
            System.out.println(str);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}

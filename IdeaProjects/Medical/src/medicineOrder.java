import java.util.*;

public class medicineOrder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the total no of users");
        int a =sc.nextInt();
        medicalShopData [] mSdList= new medicalShopData[a];
        for (int i = 0; i < a; i++) {

            System.out.println("Enter your name:");
            String name = sc.next();

            System.out.println("Enter your age:");
            String age = sc.next();

            System.out.println("Enter the medicine name you want to buy:");
            String medicine = sc.next();

            System.out.println("Enter the quantity");
            int quantity = sc.nextInt();

            medicalShopData mSd = new medicalShopData();
            mSd.setMedicineName(name);
            mSd.setAge(age);
            mSd.setName(medicine);
            mSd.setQuantity(quantity);

            mSdList[i]=mSd;
        }

        medicalShop ms=new medicalShop();
        ms.getMediData(mSdList);
    }
}

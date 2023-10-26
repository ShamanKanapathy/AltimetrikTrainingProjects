package polymorphism.overloading;

public class overLoading {



    public boolean billPayment(int amount) {

        System.out.println("representative will visit your house");
        System.out.println("collects cash");
        System.out.println(" receipt");
        System.out.println("done");


        return true;
    }

    public boolean billPayment(int amount, String upi) {

        System.out.println("upi id");
        System.out.println("total amount");
        System.out.println(" pay");
        System.out.println("pin");


        return true;
    }

    public boolean billPayment(String onlineBanking, int amount) {

        System.out.println("enter your name and password:");
        System.out.println("amount");
        System.out.println(" otp");
        System.out.println("PAYMENT");

        return true;
    }
}

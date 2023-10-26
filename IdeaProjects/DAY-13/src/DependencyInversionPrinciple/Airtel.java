package DependencyInversionPrinciple;

public class Airtel {
    private Payment p;
    public Airtel(Payment p) {
        this.p = p;
    }



    public void recharge(){
        p.cardPayment();

    }
}

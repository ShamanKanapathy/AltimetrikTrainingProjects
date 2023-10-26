package DependencyInversionPrinciple;

public class M {
    public static void main(String[] args) {
        Payment p=new Payment();
        Airtel a=new Airtel(p);
        a.recharge();

    }
}

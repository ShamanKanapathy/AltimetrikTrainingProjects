package DependencyInversionPrinciple.corrected;

public class Cardpayment implements Pay {

    @Override
    public void payment() {
        System.out.println("cardpay");
    }
}

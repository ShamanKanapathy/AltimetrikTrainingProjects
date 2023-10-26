package DependencyInversionPrinciple.corrected;

public class Upipayment implements Pay{


    @Override
    public void payment() {
        System.out.println("gpay");
    }
}

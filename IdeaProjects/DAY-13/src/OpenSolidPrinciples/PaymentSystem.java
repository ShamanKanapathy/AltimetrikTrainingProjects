package OpenSolidPrinciples;

public interface PaymentSystem {
    public default void payment(PaymentSystem p) {
        if (p instanceof Crd) {
        }
        if (p instanceof OnlineBnaking) {

        }
        if (p instanceof Upi) {
        }
    }
}


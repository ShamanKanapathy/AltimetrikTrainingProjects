package ExceptionHandlingTask;

public class TaxNotEligibleException extends Exception{
    public TaxNotEligibleException(String Tnv) {
        super(Tnv);
    }
}

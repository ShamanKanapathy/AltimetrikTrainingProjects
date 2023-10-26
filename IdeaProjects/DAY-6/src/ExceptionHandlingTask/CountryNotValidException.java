package ExceptionHandlingTask;

public class CountryNotValidException extends Exception{
    public CountryNotValidException(String CnV) {
        super(CnV);
    }
}

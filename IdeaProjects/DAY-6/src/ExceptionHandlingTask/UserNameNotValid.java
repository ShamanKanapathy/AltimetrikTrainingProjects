package ExceptionHandlingTask;

public class UserNameNotValid extends Exception{
    public UserNameNotValid(String UnV) {
        super(UnV);
    }
}

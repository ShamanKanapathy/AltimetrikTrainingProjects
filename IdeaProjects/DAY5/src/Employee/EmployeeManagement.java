package Employee;

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee emp=null;

        TemporaryEmployee te=new TemporaryEmployee();
        te.xyz();
        PermanentEmployee pe=new PermanentEmployee();
        pe.xyz();
        SupportEmployee sp=new SupportEmployee();
        sp.xyz();

    }
}

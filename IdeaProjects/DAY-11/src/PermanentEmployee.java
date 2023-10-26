public abstract class PermanentEmployee implements Employee {
//    @Override
//    public void calculateSalary() {
//        int basicPay=446;
//        System.out.println("Salary:"+basicPay);
//
//    }
public static void main(String[] args) {
    int basicPay = 446;
    Employee e=() -> System.out.println("Employee salary is :"+basicPay);
    e.calculateSalary();

}
}

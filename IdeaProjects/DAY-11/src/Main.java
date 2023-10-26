import java.util.Comparator;

@FunctionalInterface
interface altimetrik {
    void payroll(); //ABSTRACT METHOD


}
public class Main {
    public static void main(String[] args) {
//        altimetrik alt = new altimetrik() {//NORMAL METHOD IMPLEMETATION
//
//            @Override
//            public void payroll() {
//
//            }


        altimetrik alt=() -> System.out.println("PAYROLL IS IMPLEMENTED"); //LAMBDA IMPLEMENTATION:
        alt.payroll();
//        Runnable r=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread task");
//            }
        Runnable r=() -> System.out.println("Thread task"+Thread.currentThread().getName());
        r.run();

        Comparator<Integer>c=( o1,o2) -> o1 - o2;
        c.compare(45,88);
    }
    }

//lambda implementation can only be assigned to functional interface.//
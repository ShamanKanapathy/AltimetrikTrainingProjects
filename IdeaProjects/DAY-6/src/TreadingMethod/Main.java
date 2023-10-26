package TreadingMethod;

public class Main {
    public static void main(String[] args) {

        String name=Thread.currentThread().getName();
        System.out.println(name);

        long id=Thread.currentThread().getId();
        System.out.println(id);

        int priority=Thread.currentThread().getPriority();
        System.out.println(priority);

        Thread t1=new Thread();

        System.out.println(t1.getName());
        System.out.println(t1.getId());
        System.out.println(t1.getPriority());

    }
}

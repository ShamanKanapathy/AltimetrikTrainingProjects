import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("jijiijiijiijiij");
        al.add(45);
        al.add(7.8f);
        al.add(true);
        System.out.println(al);
        for(Object i:al){
            System.out.println(i);
        }

    }
}

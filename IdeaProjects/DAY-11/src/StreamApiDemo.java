import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(456, 32, 35, 54, 43, 34, 65, 876);
//        Predicate<Integer> p=(Integer e)->{return e%2==0;};
//        Consumer<Integer> c=e-> System.out.println(e);

       // list.stream()
        // .filter(e-> e%2==0)
          //      .map(e->e*e).filter(e->e%2=0);
             //   .forEach (e-> System.out.println(e));
                list.stream().filter(e->e%2==0).forEach(System.out::println);

    }
}


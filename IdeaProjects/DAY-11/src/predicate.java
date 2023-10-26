    import java.util.function.Function;
    import java.util.function.Predicate;

       public interface predicate {

        public static void main(String[] args) {
            Predicate<Integer> p=e-> e>0;
            boolean result =p.test(-4545);
            System.out.println(result);
            Predicate<String> p1=(String e)->{return e.equals("Chennai");};
            boolean ans=p1.test("Chennai");
            System.out.println(ans);

            Function <Integer,String> func=(Integer e)->{return e+" chennai";};
            System.out.println(func.apply(345));
        }
    }


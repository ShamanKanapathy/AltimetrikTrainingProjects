package polymorphism.overriding;

public class Pay1 extends Pay{


        @Override
        public int amountt(int am,String bgf) {
            System.out.println("s");
            System.out.println("s");
            System.out.println("s");
            return 67;

        }
        @Override

        public int amountt(int am) {
            System.out.println("D");
            System.out.println("E");
            System.out.println("F");
            return 56;
        }

    public static void main(String[] args) {
            Pay pj=new Pay1();
            System.out.println(pj.amountt(89));
    }





}


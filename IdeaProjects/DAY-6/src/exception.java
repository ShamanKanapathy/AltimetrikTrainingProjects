public class exception {

    void display(){
        System.out.println("1");
        System.out.println("3");
        System.out.println("5");
        try {
            int a=100/0;
        } catch (Exception e) {
            System.out.println("try with different denominator value:");
        }
        System.out.println("7");
        System.out.println("9");
        System.out.println("10");


    }

    public static void main(String[] args) {
        exception ex=new exception();
        ex.display();

        System.out.println("..............END................");
    }
}

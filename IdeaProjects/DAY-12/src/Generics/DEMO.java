package Generics;

public class DEMO <T> {
    T i;

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }

    public static void main(String[] args) {
        DEMO <String> s=new DEMO<>();
        s.setI("CHENNAI");
        System.out.println(s.getI());

        DEMO <Double> d=new DEMO<>();
        d.setI(34567897654d);
        System.out.println(d.getI());

    }
}

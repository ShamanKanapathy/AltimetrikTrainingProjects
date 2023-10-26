package DependencyInversionPrinciple;

public class Main {
    public static void main(String[] args) {
        travel t=new travel();
        Passanger p=new Passanger(t);
        p.travel();

    }
}

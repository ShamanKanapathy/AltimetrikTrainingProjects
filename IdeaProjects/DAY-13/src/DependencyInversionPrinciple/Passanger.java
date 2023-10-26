package DependencyInversionPrinciple;

public class Passanger {

    private travel t;

    public Passanger(travel t){
        this.t=t;
    }

    public void travel(){
        t.ticket();
    }



}

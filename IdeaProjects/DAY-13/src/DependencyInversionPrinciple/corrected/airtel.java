package DependencyInversionPrinciple.corrected;

public class airtel {
    private Pay p;

    public airtel(Pay p){
        this.p=p;
    }

    public void recharge(){
        p.payment();
    }}

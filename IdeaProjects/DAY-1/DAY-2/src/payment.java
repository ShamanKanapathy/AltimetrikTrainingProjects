public class payment {
    public int payid;
    public int paydate;

    public int billamount;

    public boolean paystatus;

    public payment(){
        System.out.println("Enter payid,billamount,paydate and paystatus");
    }


    public payment(int payid, int paydate, int billamount, boolean paystatus) {
        this.payid = payid;
        this.paydate = paydate;
        this.billamount = billamount;
        this.paystatus = paystatus;
    }

    public static void main(String[]args){
        payment pay1=new payment();
        payment pay2=new payment(33,99,90,true);
        System.out.println(pay2.billamount+" "+ pay2.paydate+" "+pay2.payid+" "+pay2.paystatus );

    }
}

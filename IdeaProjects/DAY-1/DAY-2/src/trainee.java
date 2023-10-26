public class trainee {
        int id;
        int phoneno;
        String name;
        String email;




        void display(){
             System.out.println(id+" "+phoneno+" "+name+" "+email);
        }


    public static void main(String[] args) {

            trainee t1=new trainee();
            t1.display();
            t1.id=1;
            t1.phoneno=129876456;
            t1.name="gow";
            t1.email="sjdjnqj@email.com";
            t1.display();

        trainee t2=new trainee();
        t2.display();
        t2.id=1;
        t2.phoneno=129876456;
        t2.name="g";
        t2.email="sjdjnqj@email.com";
        t2.display();

        trainee t3=new trainee();
        t3.display();
        t3.id=1;
        t3.phoneno=129876456;
        t3.name="gw";
        t3.email="sdjnqj@email.com";
        t3.display();

        trainee t4=new trainee();
        t4.display();
        t4.id=1;
        t4.phoneno=129876456;
        t4.name="ow";
        t4.email="djnqj@email.com";
        t4.display();








        }

    }

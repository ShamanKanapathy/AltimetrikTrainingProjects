import java.util.ArrayList;

public class Trainee {
    String traineeId;
    String traineeName;
    String traineeEmail;

    public Trainee(String traineeId, String traineeName, String traineeEmail) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeEmail = traineeEmail;
    }

    public static void main(String[] args) {
        Trainee t1=new Trainee("21bce5890","shamssn","hcf@gmail.com");

        Trainee t2=new Trainee("21","sn","kf@gmail.com");

        Trainee t3=new Trainee("2e5890","shssn","cf@gmail.com");

        Trainee t4=new Trainee("21b0","hassn","k@gmail.com");

        Trainee t5=new Trainee("21bce5","s","f@gmail.com");

        ArrayList<String> t= new ArrayList<>();


        t.add(t1.traineeId);
        t.add(t1.traineeName);
        t.add(t1.traineeEmail);

        t.add(t2.traineeId);
        t.add(t2.traineeName);
        t.add(t2.traineeEmail);

        t.add(t3.traineeId);
        t.add(t3.traineeName);
        t.add(t3.traineeEmail);

        t.add(t4.traineeId);
        t.add(t4.traineeName);
        t.add(t4.traineeEmail);

        t.add(t5.traineeId);
        t.add(t5.traineeName);
        t.add(t5.traineeEmail);
        for (String a:t) {
            System.out.println(a);

        }


    }
}

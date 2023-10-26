package TraineeAssignment;

public class Trainee {
   private String privateid;
    public String getPrivateid() {
        return privateid;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "privateid='" + privateid + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setPrivateid(String privateid) {
        this.privateid = privateid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;
    private String email;

}

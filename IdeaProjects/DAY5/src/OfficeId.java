import java.util.Objects;

public class OfficeId {

    int id;
    String str;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeId officeId = (OfficeId) o;
        return id == officeId.id && Objects.equals(str, officeId.str);
    }

    public OfficeId(int id, String str) {
        this.id = id;
        this.str = str;
    }

    @Override
    public String toString() {
        return "OfficeId{" +
                "id=" + id +
                ", str='" + str + '\'' +
                '}';
    }




    @Override
    public int hashCode() {
        return Objects.hash(id, str);
    }

    public static void main(String[] args) {
            OfficeId oi=new OfficeId(12,"alti");
            System.out.println(oi);

    }


}

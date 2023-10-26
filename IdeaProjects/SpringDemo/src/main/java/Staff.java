public class Staff {
    public int staffId;
    public  String staffName;
    public Employee e;

    public Staff(Employee e) {
        this.e = e;
    }
//    public int getStaffId() {
//        return staffId;
//    }
//
//    public void setStaffId(int staffId) {
//        this.staffId = staffId;
//    }
//
//    public String getStaffName() {
//        return staffName;
//    }
//
//    public void setStaffName(String staffName) {
//        this.staffName = staffName;
//    }

    void displayStaff(){
        e.displayEmployee();
    }
}

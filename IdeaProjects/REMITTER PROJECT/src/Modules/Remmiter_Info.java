package Modules;

public class Remmiter_Info {
   int Account_number;
   String Name;
    String Email_id;
    String password;
    double balance;
    int Account_status;
    String IFSC_Code;

    public int getAccount_number() {
        return Account_number;
    }

    public void setAccount_number(int account_number) {
        Account_number = account_number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccount_status() {
        return Account_status;
    }

    public void setAccount_status(int account_status) {
        Account_status = account_status;
    }

    public String getIFSC_Code() {
        return IFSC_Code;
    }

    public void setIFSC_Code(String IFSC_Code) {
        this.IFSC_Code = IFSC_Code;
    }
}

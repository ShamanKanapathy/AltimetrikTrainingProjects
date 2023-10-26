package Modules;

public class Beneficiary_Info {
    long account_number;
    String Name;
    String Bank_name;
    String IFSC_Code;
    long Current_balance;

    String Email_id;

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBank_name() {
        return Bank_name;
    }

    public void setBank_name(String bank_name) {
        Bank_name = bank_name;
    }

    public String getIFSC_Code() {
        return IFSC_Code;
    }

    public void setIFSC_Code(String IFSC_Code) {
        this.IFSC_Code = IFSC_Code;
    }

    public long getCurrent_balance() {
        return Current_balance;
    }

    public void setCurrent_balance(long current_balance) {
        Current_balance = current_balance;
    }

    public String getEmail_id() {
        return Email_id;
    }

    public void setEmail_id(String email_id) {
        Email_id = email_id;
    }
}

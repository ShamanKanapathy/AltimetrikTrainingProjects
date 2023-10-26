package Modules;

import java.util.Date;

public class Fund_transfer {
   long TransactionId;
   long Beneficiary_account_number;
    String Transaction_amount;
    long Remitter_account_number;
    String Transaction_status;
    Date Transaction_date;

    public long getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(long transactionId) {
        TransactionId = transactionId;
    }

    public long getBeneficiary_account_number() {
        return Beneficiary_account_number;
    }

    public void setBeneficiary_account_number(long beneficiary_account_number) {
        Beneficiary_account_number = beneficiary_account_number;
    }

    public String getTransaction_amount() {
        return Transaction_amount;
    }

    public void setTransaction_amount(String transaction_amount) {
        Transaction_amount = transaction_amount;
    }

    public long getRemitter_account_number() {
        return Remitter_account_number;
    }

    public void setRemitter_account_number(long remitter_account_number) {
        Remitter_account_number = remitter_account_number;
    }

    public String getTransaction_status() {
        return Transaction_status;
    }

    public void setTransaction_status(String transaction_status) {
        Transaction_status = transaction_status;
    }

    public Date getTransaction_date() {
        return Transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        Transaction_date = transaction_date;
    }
}

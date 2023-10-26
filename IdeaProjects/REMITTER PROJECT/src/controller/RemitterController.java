package controller;

import jdbcDb.JdbcConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

import static java.time.chrono.JapaneseEra.values;

public class RemitterController {

    JdbcConfig con = new JdbcConfig();

    public Boolean login(int ac, String ps) throws SQLException, ClassNotFoundException {
        Connection con1 = con.connect();
        boolean userExist=false;
        PreparedStatement preparedStatement = con1.prepareCall("select * from remitter_info where Account_Number=? and Password=?");
        preparedStatement.setInt(1,ac);
        preparedStatement.setString(2,ps);

        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()) {
            userExist = true;
        }
        return userExist;
        }

   void registerBeneficiary (int account_number,String Name,String Bank_name,String IFSC_Code, long Current_balance, String Email_id) throws SQLException,ClassNotFoundException{
        Connection con2=con.connect();
            PreparedStatement preparedStatement=con2.prepareStatement("insert into beneficiary_info(account_number,Name,Bank_name,IFSC_Code,Current_balance,Email_id)values (?,?,?,?,0,?)");
            preparedStatement.setInt(1,account_number);
            preparedStatement.setString(2,Name);
            preparedStatement.setString(3,Bank_name);
            preparedStatement.setString(4,IFSC_Code);
//          preparedStatement.setLong(5,Current_balance);
            preparedStatement.setString(6,Email_id);

            int resultSet = preparedStatement.executeUpdate();
            if(resultSet==1){
                System.out.println("Values are inserted into the Database!");
            }

            else{
                System.out.println("Invalid values entered");
            }


    }

    public void transferFunds (int Transaction_Id, String Beneficiary_Account_Number, int Transaction_amount , String Remitter_Account_Number, int Transaction_status, Date Tansaction_Date) throws SQLException,ClassNotFoundException{
            Connection con3=con.connect();
            PreparedStatement preparedStatement=con3.prepareStatement("insert into fund_transfer(Transaction_Id,Beneficiary_Account_Number,Transaction_amount,Remitter_Account_Number,Transaction_status, Tansaction_Date)values (?,?,?,?,?,?)");
            preparedStatement.setInt(1,Transaction_Id);
            preparedStatement.setString(2,Beneficiary_Account_Number);
            preparedStatement.setInt(3,Transaction_amount);
            preparedStatement.setString(4,Remitter_Account_Number);
            preparedStatement.setLong(5,Transaction_status);
            preparedStatement.setDate(6, (java.sql.Date) Tansaction_Date);

            int resultSet = preparedStatement.executeUpdate();
            if(resultSet==1){
                System.out.println("The transaction has been done!");
            }

            else{
                System.out.println("Invalid values entered");
            }


        }


    }






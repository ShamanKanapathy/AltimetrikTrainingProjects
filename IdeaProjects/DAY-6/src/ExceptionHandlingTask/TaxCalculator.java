package ExceptionHandlingTask;

import java.util.Scanner;

public class TaxCalculator {
    String CnV = "The employee should be an Indian citizen for calculating tax”";
    String UnV = "The employee name cannot be empty";
    String TnV = "The employee does not need to pay tax";


    public double calculateTax(String empName, boolean isIndian, Double empSal) throws TaxNotEligibleException, UserNameNotValid, CountryNotValidException {

        Double taxAmount;


        if (!isIndian) {
            throw new CountryNotValidException(CnV);
        } else if (empName.isEmpty()) {
            throw new UserNameNotValid(UnV);
        } else if (empSal > 100000 && isIndian) {
            taxAmount = empSal * 8 / 100;
        } else if (empSal >= 50000 && empSal <= 100000 && isIndian) {
            taxAmount = empSal * 6 / 100;
        } else if ((empSal >= 30000 && empSal <= 50000) && isIndian) {
            taxAmount = empSal * 5 / 100;
        } else if ((empSal >= 10000 && empSal <= 30000 && isIndian)) {
            taxAmount = empSal * 5 / 100;
        } else {
            throw new TaxNotEligibleException(TnV);
        }

    return taxAmount;
    }
}



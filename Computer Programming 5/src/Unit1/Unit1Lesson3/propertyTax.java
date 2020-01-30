package Unit1Lesson3;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class propertyTax {

    public static void main(String[] args) {
        
        String output = propertyTax.calculate(250000);
        System.out.println(output);
        
    }
    
    public static String calculate(int value) {
        double taxable = value*.92;
        double taxPerHundred = 1.05;
        double total = (taxable/100 * taxPerHundred);
        
        String format = "$###,###.00";
        DecimalFormat df = new DecimalFormat(format);
        
        String valForm = df.format(value);
        String taxableForm = df.format(taxable);
        String totalForm = df.format(total);
        
        String taxPer100Form = df.format(taxPerHundred);
        
        String full = "Assed Value:\t\t\t" + valForm + "\nTaxable Amount:\t\t\t" + taxableForm + "\nTax Rate For Each $100.00:\t" + taxPer100Form + "\nProperty Tax:\t\t\t" + totalForm;
        
        return full;
    }
    
}

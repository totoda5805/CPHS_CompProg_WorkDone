package Unit1Lesson3;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class Milk {

    public static void main(String[] args) {
        
        // Calculate and print
       String out = Milk.calculate(240);
       System.out.println(out);
       
    }
    
    public static String calculate(int value) {
        
        // Declare all later used variables
        double cost = 0.38;
        double profit = 0.27;
        double holdsL = 3.78;
        
        // Make the format thing
        String format = "###,###.00";
        DecimalFormat df = new DecimalFormat(format);
        
        // Calculations & formatting.
        double production = value/holdsL;
        String prod = df.format(production);
        String expenses = df.format(value*cost);
        String profitt = df.format(production*profit);
        
        // Do the string thing
        // Turn it to a human readable output, because I don't know how to return JSON
        String output = "Liters produced\t\t" + value +"\nCartons prodcued\t" + prod + "\nProductions cost\t" + expenses + "\nProfit per carton\t" + profitt;
        return output;
        
    }
    
}

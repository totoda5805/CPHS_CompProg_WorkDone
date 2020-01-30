package Unit1Lesson3;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class eggs {

    public static void main(String[] args) {
        
        // Calculate and print
       String out = eggs.calculate(241, 293);
       System.out.println(out);
       
    }
    
    public static String calculate(int day1, int day2) {
        
        int cartonMax = 12;
        
        // Declare all later used Day 1 variables
        int cartonsFullD1 = day1/12;
        int remainderD1 = day1%12;
        
        String totalD1 = "Day collected:\t\tMonday\nNo. of eggs collected\t" + day1 + "\nNo. of full cartons\t" + cartonsFullD1 + "\nRemaining eggs\t\t" + remainderD1;
        
        int cartonsFullD2 = day2/12;
        int remainderD2 = day2%12;
        
        String totalD2 = "\nDay collected:\t\tTuesday\nNo. of eggs collected\t" + day2 +"\nNo. of full cartons\t" + cartonsFullD2 + "\nRemaining eggs\t\t" + remainderD2;
        
        return totalD1 + totalD2;
        
    }
    
}


package Unit1Lesson4;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class mathMethods {

    public static void main(String[] args) {
       
        final double N1 = 1875, N2 = 3842;
        
        DecimalFormat df = new DecimalFormat("###,###,###.00");
        
        // Square root/absolute value
        System.out.println("The square root of " + N1 + " = " + df.format(Math.sqrt(N2) ) + "\nThe square root of " + N2 + " = " + df.format(Math.sqrt(N2) ) );
        System.out.println("The absolute value of " + N1 + " = " + df.format(Math.abs(N1) ) + "\nThe absolute value of " + N2 + " = " + df.format(Math.abs(N2) ) );
        
        // Min/max
        System.out.println("The minimum of " + N1 + " and " + N2 + " = " + df.format(Math.min(N2, N1) ) );
        System.out.println("The maximum of " + N1 + " and " + N2 + " = " + df.format(Math.min(N2, N1) ) );
        
        // rounding
        System.out.println(N1 + " rounded up =" + Math.ceil(N1) + "\n" + N2 + " rounded up = " + Math.ceil(N2) );
        System.out.println(N1 + " rounded down =" + Math.floor(N1) + "\n" + N2 + " rounded down = " + Math.floor(N2) );
        System.out.println(N1 + " rounded = " + Math.round(N1) + "\n" + N2 + " rounded = " + Math.round(N2) );
        
    }
    
}

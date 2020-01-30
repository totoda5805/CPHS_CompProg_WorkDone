package Unit1Lesson3;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class Formatting {

    public static void main(String[] args) {
       
        double testNum = 5847.2268;
        String pattern = "##,###.##";
        DecimalFormat df = new DecimalFormat(pattern);
        
        System.out.println(df.format(testNum) ); // Round testNum to 5,847.23
        
        testNum = 5368.8742;
        pattern = "###,###.##";
        df.applyPattern(pattern);
        
        System.out.println(df.format(testNum) ); // Round testNum to 5,368.87
        
        testNum = 5368.876;
        System.out.println(df.format(testNum) ); // Round testNum to 5,368.88
        
        // Keep going with patterns
        
        DecimalFormat nDf = new DecimalFormat("000.##");
        System.out.println(nDf.format(12.739));
        nDf.applyPattern("0,000.00");
        System.out.println(nDf.format(12.739));
        
    }
    
}

package Unit1Lesson3;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class TesterWithTeacher {

    public static void main(String[] args) {
        
        /*System.out.println(3+4-5);
        System.out.println(3+(4-5));
        System.out.println(3+4*5);
        System.out.println((3+4)*5);
        System.out.println(8/2+6);
        System.out.println(8/(2+6));
        System.out.println(10-3-4-1);*/
        
        // Working with Modulus/getting remainders (%)
        
        System.out.println("Remainder of 9/5: " + 9%5);
        System.out.println("Division: " + 9.0/5);
        
        // Using variable in calculations
        
        int i = 2;
        double e = 2.5;
        System.out.println(i*e);
        
        double length = 12.6;
        double width = 5.4;
        String lengthOf = "The square footage of the length of ";
        String and = " and ";
        String widthOf = "width of ";
        String is = " is ";
        System.out.println(lengthOf + length + and + widthOf + width + is + length*width);
        
    }
    
}

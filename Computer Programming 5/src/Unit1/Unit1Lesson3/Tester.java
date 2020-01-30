package Unit1Lesson3;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class Tester {

    public static void main(String[] args) {
        
         // Basic calculations

        /* int i = 2;
        double e = 2.5;
        System.out.println(i * e);

        double length = 12.6;
        double width = 5.4;
        String lengthOf = "The square footage of the length of ";
        String and = " and ";
        String widthOf = " width of ";
        String is = " is ";
        System.out.println(lengthOf + length + and + widthOf + width + is + (length*width) );*/


        // Increments

        /*int m = 7;
        double x = 6.4;

        m++;
        x--;

        System.out.println(m);
        System.out.println(x);*/

        // Compound

        /*int count = 17;

        count += 3;
        count -= 3;
        count *= 3;
        count /= 3;

        System.out.println(count);

        count %= 3;

        System.out.println(count);*/

        // More examples

        /*int g = 409;
        g += 5;
        System.out.println(g);

        double d = 20.3;
        double m = 10;

        m *= d-1;
        System.out.println(m);

        int age = 7;
        int year = 2000;

        oldIn(age, year);
        year += 3;
        age += 3;

        oldIn(age, year);
        year += 5;
        age += 5;

        oldIn(age, year);*/

        // Division Truncation

        /*int x = 5;
        int y = 2;

        System.out.println(x/y);*/

        // Casting

        /*
        double d = 29.78;
        /*int i = d;*/ // BAD!

        /*
        int i = (int)d; // GOOD

        int j = 105;
        double f = j; // Does not lose anything
        */

        // Data loss

        /*int i = 4;
        double d = 3;

        double ans = i/d;*/

        // 20 + 5 * 6.0 // Integer, because of the decimal

        // Constants
        
        final double PI = 3.14159; // CONSTANT
        // PI = 3.7789 // BAD, NOT ALLOWED

        // The following is "illegal", or impossible/not allowed
        /*final double PI;
        PI = 3.14159;*/

        // Other final types (not all, afaik)
        final String NAME = "Pewee Herman";
        final int LunchCount = 122;
        
    }

    static void oldIn(int age, int year) {
        String was = "I was ";
        String old = " years old in ";
        System.out.println(was + age + old + year);
    }
    
}

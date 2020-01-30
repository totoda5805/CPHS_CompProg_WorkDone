package Unit1Lesson3;
import java.text.*;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

class Car {
    public String name, cost, mpg;
    public double gallons, miles;
    
    public Car(String name, double gallons, double miles) {
        this.name = name;
        this.gallons = gallons;
        this.miles = miles;
        this.init();
        
    }
    
    private void init() {
        
        double perGallon = 3.50;
        
        String format = "$###,###.00";
        DecimalFormat formatter = new DecimalFormat(format);
        this.cost = formatter.format(this.gallons*perGallon);
        formatter.applyPattern(format.substring(1) );
        this.mpg = formatter.format(this.miles/this.gallons);
        
    }
    
}

public class milesPerGallon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car accord = new Car("Honda Accord", 15, 487);
        Car taurus = new Car("Ford Taurus", 16.5, 399);
        Car towncountry = new Car("Chrystler Town & Country", 19.5, 408);
        
        String accordMPG = mpgString(accord);
        String taurusMPG = mpgString(taurus);
        String towncountryMPG = mpgString(towncountry);
        
        System.out.println(accordMPG + taurusMPG + towncountryMPG);
        
    }
    
    private static String mpgString(Car car) {
        
        return "The cost of gas for the " + car.name + " is " + car.cost + ", and it got " + car.mpg + " miles per gallon.\n";
        
    }
    
}

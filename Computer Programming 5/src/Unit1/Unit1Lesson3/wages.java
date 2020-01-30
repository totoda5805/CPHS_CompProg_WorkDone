package Unit1Lesson3;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

import java.text.*;

class Employee {
    
    String name;
    double wage, hours, overtime;
    
    Employee(String name, double wage, double hours, double overtime) {
        this.name = name;
        this.wage = wage;
        this.hours = hours;
        this.overtime = overtime;
    }
}

public class wages {

    public static void main(String[] args) {
        
        // Employees
        Employee mark = new Employee("Mark Anderson", 8.75, 40, 0);
        Employee beth = new Employee("Beth Johnson", 10.50, 38, 3);
        Employee amanda = new Employee("Amanda Harris", 7.40, 40, 6);
        Employee ryan = new Employee("Ryan Benson", 11.75, 40, 8);
        Employee austin = new Employee("Austin Wilson", 7.75, 36.5, 0);
        
        // Calculate weekly earnings
        String markEarned = calculatePay(mark);
        String bethEarned = calculatePay(beth);
        String amandaEarned = calculatePay(amanda);
        String ryanEarned = calculatePay(ryan);
        String austinEarned = calculatePay(ryan);
        
        // Header, info, and earnings
        String header = "Name\t\t\tHourly Wage\t\t\tRegular Hours Worked\t\t\tOvertime Hours Worked\n";
        String info = getInfo(mark) + getInfo(beth) + getInfo(amanda) + getInfo(ryan) + getInfo(austin) + "\n";
        String earnings = getEarnings(mark, markEarned) + getEarnings(beth, bethEarned) + getEarnings(amanda, amandaEarned) + getEarnings(ryan, ryanEarned) + getEarnings(austin, austinEarned);
        
        // Log it
        System.out.println(header + info + earnings);
        
    }
    
    private static String getEarnings(Employee employee, String wage) {
        
        return employee.name + " earned " + wage + "\n";
        
    }
    
    private static String getInfo(Employee employee) {
        
        return employee.name + "\t\t" + employee.wage  + "\t\t" + employee.hours + "\t\t" + employee.overtime + "\n";
        
    }
    
    private static String calculatePay(Employee employee) {
        
        double overtime = employee.overtime*(employee.wage*1.5);
        double regular = employee.wage*employee.hours;
        
        String format = "$###,###.00";
        DecimalFormat formatter = new DecimalFormat(format);
        String formatted = formatter.format(regular + overtime);
        
        return formatted;
    }
    
}

package Unit1Lesson2;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */
public class salesData {

    public static void main(String[] args) {
        
        double taxRate = .0675, totalSales = 122.98, pricePer = 2.45, average = 3.4987302; 
        int itemsCount = 15, stock = 100;
        String tax = "" + taxRate + "";
        tax = tax.substring(1);
        System.out.println("Tax rate = " + tax + "\nNumber of items = " + itemsCount + "\nTotal sales = $" + totalSales);
        System.out.println("Price per item = $" + pricePer + "\nItems in stock = " + stock + "\nAverage items sold = " + average);
        
    }
    
}

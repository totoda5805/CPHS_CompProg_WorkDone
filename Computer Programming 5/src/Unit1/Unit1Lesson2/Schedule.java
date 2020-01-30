package Unit1Lesson2;

/**
 * 
 * Date created:
 * Author: 
 * Description: 
 * 
 */

public class Schedule {

    public static void main(String[] args) {

        // Class names
        String firstHourName = "3 Tri Geometry A\t\t", secondHourName = "Essential Communication Skills\t";
        String thirdHourName = "Chemistry I A\t\t\t", fourthHourName = "English 10 B\t\t\t", fifthHourName = "Computer Programming\t\t";

        // Room numbers
        String firstHourRoom = "B130\n", secondHourRoom = "B118\n", thirdHourRoom = "A205", fourthHourRoom = "B127\n";
        String fifthHourRoom = "C243\n";

        // All
        String firstHour = firstHourName + firstHourRoom, secondHour = secondHourName + secondHourRoom, thirdHour = thirdHourName + thirdHourRoom;
        String fourthHour = fourthHourName + fourthHourRoom, fifthHour = fifthHourName + fifthHourRoom;

        System.out.println("Schedule for Robert Knight\nFirst Hour:\t" + firstHour + "Second Hour:\t" + secondHour + "Third Hour:\t" + thirdHour);
        System.out.println("Fourth Hour:\t" + fourthHour + "Fifth Hour:\t" + fifthHour);
    }

}

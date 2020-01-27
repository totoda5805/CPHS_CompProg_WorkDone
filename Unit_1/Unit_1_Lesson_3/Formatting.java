package Unit_1_Lesson_3;

import java.text.*;

public class Formatting {
    public static void main(String[] args){

        double testNum = 69420.21;
        String pattern = "##,###.##";
        DecimalFormat format = new DecimalFormat(pattern);

        System.out.println(format.format(testNum));

        //set new format
        String pattern2 = "000000000";
        format.applyPattern(pattern2);

        System.out.println(format.format(testNum));

        //set a 3rd format
        double testNum2 = 0.5244;
        String pattern3 = "%##";
        format.applyPattern(pattern3);

        System.out.println(format.format(testNum2));
    }
}

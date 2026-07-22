// Write a Java program to get the maximum value of the year, month, week, and date from the
//  current date of a default calendar.

import java.util.*;
public class Date_time3 {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();
    
        System.out.println();
        System.out.println("\nCurrent Date and Time:" + cal.getTime());

        int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
        int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
        int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
        
        System.out.println("Actual Maximum Year: " +actualMaxYear);
        System.out.println("Actual Maximum Month: " +actualMaxMonth);
        System.out.println("Actual Maximum Week: " +actualMaxWeek);
        System.out.println("Actual Maximum Date: " +actualMaxDate + "\n");
        System.out.println();
    }
}

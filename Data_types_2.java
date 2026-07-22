// Write a  Java program that reads a number in inches and converts it to meters.

import java.util.Scanner;
public class Data_types_2 {
    public static void main(String[] String) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a value for inche : ");
        double inch = input.nextDouble();

        double meters = inch * 0.0254;
        System.out.println("inch + \" inch is \" + meters + \" meters");
    }
}

/*Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
 Otherwise, print "positive" or "negative". Add "small" if the absolute value of 
 the number is less than 1, or "large" if it exceeds 1,000,000.
*/
import java.util.Scanner;
public class Conditional4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input value: ");
        double input = in.nextDouble();
        if (input > 0) {
            if (input < 1){
                System.out.println("positive small number.");
            } else if (input > 1000000) {
                System.out.println("positive large number.");
            } else {
                System.out.println("positive number.");
            }
        } else if (input < 0) {
            if (Math.abs(input) < 1) {
                System.out.println("negative small number.");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("negative large number.");
            } else {
                System.out.println("negative number.");
            }
        } else {
            System.out.println("zero.");
        }
       }
    }

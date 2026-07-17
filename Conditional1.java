// Get a number from the user and print whether it is positive or negative number
import java.util.Scanner;
public class Conditional1 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
        System.out.print("input a number: ");
         int input = in.nextInt();

        if (input > 0) {
            System.out.println("The number is positive.");
        } else if (input < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }         


   }
    
}

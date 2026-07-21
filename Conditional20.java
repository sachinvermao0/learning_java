// Write a Java program that accepts two floating­point numbers and checks whether they are the 
// same up to two decimal places.

import java.util.Scanner;
public class Conditional20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first floating­point number: ");
        double num1 = in.nextDouble();
        System.out.print("Input second floating­point number");
        double num2 = in.nextDouble();
        in.close();


        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }
    }
}

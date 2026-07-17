//Write a Java program that takes three numbers from the user and prints the greatest number

import java.util.Scanner;
public class Conditional3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = in.nextInt();
        System.out.println("Input the second number: ");
        int num2 = in.nextInt();
        System.out.println("Input the third number: ");
        int num3 = in.nextInt();

        if (num1 > num2)
         if (num1 > num3)
            System.out.println("The greatest number is: " + num1);

        if (num2 > num3)
         if (num2 > num1)
            System.out.println("The greatest number is: " + num2);
        if (num3 > num1)
         if (num3 > num2)
            System.out.println("The greatest number is: " + num3);
       
    }
    
}

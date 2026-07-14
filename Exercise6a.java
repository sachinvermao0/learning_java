/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5 */

import java.util.Scanner;

public class Exercise6a {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the first number: ");
    int n1 = scanner.nextInt();
    System.out.println("Input the second number: ");
    int n2 = scanner.nextInt();
    int sum = n1 + n2;
    int minus = n1 - n2;
    int product = n1 * n2;
    int quotient = n1 / n2;
    int remainder = n1 % n2;
    System.out.printf("Sum = %d\nMinus = %d\nProduct = %d\nSubtract = %d\nQuotient = %d\nRemainder = %d\n ", sum, minus, product, minus, quotient, remainder);
  }
}

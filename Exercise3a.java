//Sample solution using input from the user:
import java.util.Scanner;
public class Exercise3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int result = num1 / num2;
        System.out.println("\nResult: " + result);
    }
}
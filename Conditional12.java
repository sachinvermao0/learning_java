// Write a Java program to display the multiplication table of a given integer

import java.util.Scanner;
public class Conditional12 {
    public static void main(String[] args) {
        
        int j,n;

        System.out.print("Input the number(Table to be calculated): ");

        {
           System.out.println("Input numbers of terms:");
           Scanner in = new Scanner(System.in);
                   n = in.nextInt();

            System.out.println("\n");
            for(j = 0; j <= n; j++)

            System.out.println(n + "x" + j + "=" + n * j);
        }

    }
}

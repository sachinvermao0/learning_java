// Write a  Java program to display the pattern like a right angle triangle with a number.

import java.util.Scanner;
public class Conditional13 {
    public static void main(String[] args) {


        int i,j,n;
        System.out.print("Input numbers of Row : ");
      Scanner in = new Scanner(System.in);
              n = in.nextInt();


        for (i = 1; i <= n; i++) {

            for (j = 1; j <= n; j++)
                System.out.println(j);

            System.out.println("");
        }
    }
}

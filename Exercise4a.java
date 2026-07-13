/*Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/
public class Exercise4a {
    public static void main(String[] args) {
        int w = -5 + 8 * 6;
        int x = (55 + 9) % 9;
        int y = 20 + -3 * 5 / 8;
        int z = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
// Write a Java program to get the character (Unicode code point) at the given index within the string

public class String2 {
    public static void main(String[] args){
        String str = "Sachin Verma";
        System.out.println("Original String: " + str);

        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(9);

        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}

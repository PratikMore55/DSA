// In this question we have to check whether the first number of a given character is in uppercase or lower case

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch = sc.next().trim().charAt(0);
        if (ch>= 'a' && ch<= 'z'){
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}

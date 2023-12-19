// In this question we have to find the largest number between 3 numbers

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int A = sc.nextInt();
        System.out.println("Enter B : ");
        int B = sc.nextInt();
        System.out.println("Enter C : ");
        int C = sc.nextInt();
        int max = A;
        if (B > max){
            max = B;
        }
        if (C > max){
            max = C;
        }
        System.out.println("Largest number is : "+max);
    }
}

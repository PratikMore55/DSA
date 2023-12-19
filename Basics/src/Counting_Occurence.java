// In this question we have to find how many times a number is repeated in a list of numbers

import java.util.Scanner;

public class Counting_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        System.out.println("Enter number to find : ");
        int o = sc.nextInt();

        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == o){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}

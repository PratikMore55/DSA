// In this given question we have to reverse the given

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = sc.nextInt();

        int op = 0;

        while (n > 0){
            int rem = n % 10;
            n /= 10;
            op = op * 10 + rem;
        }

        System.out.println(op);
    }
}

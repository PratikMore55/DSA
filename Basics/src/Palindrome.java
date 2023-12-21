import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        int x = sc.nextInt();

        int a, b = 0, c;
        a = x;
        while (x > 0){
            c = x % 10;
            b = (b * 10) + c;
            x = x/10;
        }
        if (a == b){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}


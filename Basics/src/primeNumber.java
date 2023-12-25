import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    static  boolean isPrime(int n){
        int c = 2;
        while (c*c<=n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}

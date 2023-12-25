import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n = ");
//        int n = sc.nextInt();
//        System.out.println(armnum(n));
        for (int i = 100; i < 1000; i++){
            if (armnum(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean armnum(int n){
        int temp = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n=n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == temp;
    }
}


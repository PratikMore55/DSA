import java.util.Scanner;

public class n_by_n_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printMatrix(n);
    }

    static void printMatrix(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 8, 99, 5};
        int[] arr = {5, 8, 1, 33, 54, 1, 54};
        System.out.println(Arrays.toString(arr));
        System.out.println(SecondL(arr));
        System.out.println(SecondS(arr));
    }


    static int SecondL(int[] arr){

                                     // Brute

//        Arrays.sort(arr);
//        return arr[arr.length - 2];

                                     // Optimal

        int largest = arr[0];
        int Slargest = -1;
        for (int j : arr) {
            if (j > largest) {
                Slargest = largest;
                largest = j;
            }
        }
        return Slargest;
    }
    static int SecondS(int[] arr){

               // Brute

//        int smallest = 0;
//        Arrays.sort(arr);
//        smallest = arr[1];
//        return smallest;

            // Optimal

        int smallest = arr[0];
        int Ssmaleest = Integer.MAX_VALUE;

        for (int j : arr) {
            if (j < Ssmaleest
                    && j > smallest) {
                Ssmaleest = j;
            }
        }
        return Ssmaleest;

    }
}

import java.lang.instrument.ClassDefinition;
import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
//        System.out.println(Arrays.toString(sort(arr)));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void sort(int[] arr){
        int i = 0;
        while (i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int end){
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }
}
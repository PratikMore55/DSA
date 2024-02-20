import java.util.Arrays;

public class SelevtionSort {
    public static void main(String[] args) {
        int[] arr = {2,12,65,2,3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int last = arr.length - i - 1;
                int max = getMax(arr, 0, last);
//                int temp = arr[max];
//                arr[max] = arr[last];
//                arr[last] = temp;
                swap(arr,max, last);
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMax(int[] arr, int start, int end){
        int max = start;
        for (int i = 0; i <= end; i++) {
//            if (arr[max] < arr[i]){                  // for ascending order
            if (arr[i] < arr[max]){                    // for descending order
                max = i;
            }
        }
        return max;
    }
}

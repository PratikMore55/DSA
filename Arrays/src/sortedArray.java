public class sortedArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        int[] arr = {1,2,1,64,464};
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (first<arr[i]){
                System.out.println("Array is sorted");
            }
            else {
                System.out.println("Array is not sorted");
            }
        }
//        sort(arr);
    }

//    static void sort(int[] arr){
//        int first = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            return;
//        }
//    }
}


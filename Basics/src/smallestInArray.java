public class  smallestInArray {
    public static void main(String[] args) {
        int[] arr = {25,44,21,43,5};
        int ans = min(arr);
        System.out.println(ans);
    }

    static int min(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < temp){
                temp = arr[i];
            }
        }
        return temp;
    }
}

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = search(arr,9);
        System.out.println(ans);
    }

    static int search(int[] arr, int num){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}


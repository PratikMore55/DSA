public class Order_Agnostic_bs {
    public static void main(String[] args) {
        int[] arr = {23,61,77,456,789};
        int target = 61;
        int ans = OABS(arr,target);
        System.out.println(ans);
    }
    static int OABS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start<= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target < arr[mid]){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}

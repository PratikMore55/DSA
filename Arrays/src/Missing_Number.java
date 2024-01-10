// SOLUTION 1 == Linear Search

//public class Missing_Number {
//    public static void main(String[] args) {
//        int[] arr = {1,2,4,5};
//        int n = 5;
//
//        int ans = missing(arr,n);
//        System.out.println(ans);
//    }
//
//    static int missing(int[] arr, int n){
//        for (int i = 1; i <= n; i++) {
//            int flag = 0;
//            for (int j = 0; j < n-1; j++){
//                if (arr[j] == i){
//                    flag = 1;
//                    break;
//                }
//            }
//            if (flag == 0) return i;
//        }
//        return -1;
//    }
//}

// SOLUTION 1 == Add method

//public class Missing_Number {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 4, 5};
//        int n = 5;
//
//        int ans = missing(arr, n);
//        System.out.println(ans);
//    }
//
//    static int missing(int[] arr, int n){
//        int sum = n*(n+1)/2;
//        int s2 = 0;
//        for (int i = 0; i< n-1; i++){
//            s2 += arr[i];
//        }
//        int ans = sum - s2;
//        return ans;
//    }
//}


// SOLUTION 1 == XOR method


public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int ans = missing(arr, n);
        System.out.println(ans);
    }

    static int missing(int[] arr, int n){
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n-1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i +1);
        }
        xor1 = xor1 ^ n;

        return (xor1 ^ xor2);
    }
}

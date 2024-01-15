public class evenCount {
    public static void main(String[] args) {
        int[] arr = {12, 93 , 22, 333, 2345};
//        int n = arr.length;
        int ans = findNumbers(arr);
        System.out.println(ans);
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int num : arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            while (n>0){
//                n = n/10;
//                count++;
//            }
//            if (count/2 ==0){
//                return count;
//            }
//        }
//        return -1;

        int digitsInArray = digits(num);
        return digitsInArray % 2 == 0;
    }

    static int digits(int num){
        int count = 0;
        while (num > 0){
            count++;
            num = num/10;
        }
        return  count;
    }
}

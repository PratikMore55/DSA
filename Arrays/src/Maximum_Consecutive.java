public class Maximum_Consecutive {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,1,1,0,1};

        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[] arr){
        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                cnt++;
            }
            else {
                cnt = 0;
            }

            maxi = Math.max(maxi,cnt);
        }
        return maxi;
    }
}

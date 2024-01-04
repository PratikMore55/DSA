//27. Remove Element

//Constraints:
//
//        0 <= nums.length <= 100
//        0 <= nums[i] <= 50
//        0 <= val <= 100

public class Remove_Element {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,60,9,3};

        int N = removeElement(arr,6);
        System.out.println(N);

    }

                                 // SOLUTION
    static int removeElement(int[] nums, int val) {
        int i = 0;

        for (final int num : nums)
            if (num != val)
                nums[i++] = num;
        return i;
        }
}

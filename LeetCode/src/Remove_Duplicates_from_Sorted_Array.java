
// 26. Remove Duplicates from Sorted Array

//Constraints:
//
//        1 <= nums.length <= 3 * 104
//        -100 <= nums[i] <= 100
//        nums is sorted in non-decreasing order.


public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,3,4,};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        int rd = removeDuplicates(nums);
        System.out.println();

        for (int i = 0; i < rd; i++) {
            System.out.print(nums[i] + " ");
        }
    }

                                      // SOLUTION

    static int removeDuplicates(int[] nums) {
        int i = 0;

        for (final int num : nums)
            if (i < 1 || num > nums[i - 1])
                nums[i++] = num;

        return i;
    }
}

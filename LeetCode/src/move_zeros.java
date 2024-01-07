class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        zeros(nums, n);
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public void zeros(int[] nums, int n){
        int count = 0;

        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        while(count < n){
            nums[count++] = 0;
        }
    }
}


//283. Move Zeroes
//
//        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Note that you must do this in-place without making a copy of the array.
//
//
//
//        Example 1:
//
//        Input: nums = [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -231 <= nums[i] <= 231 - 1
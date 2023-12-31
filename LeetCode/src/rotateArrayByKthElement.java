public class rotateArrayByKthElement {
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;                             // if number of k is grater than length of array
            reverse(nums, 0, nums.length - 1);            // reversing whole array
            reverse(nums, 0, k-1);                        // reversing first k elements
            reverse(nums, k, nums.length - 1);            // reversing remaining elements
        }

        static void reverse(int[] nums, int start, int end){
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    }
}


//189. Rotate Array
//        Example 1:
//
//        Input: nums = [1,2,3,4,5,6,7], k = 3
//        Output: [5,6,7,1,2,3,4]
//        Explanation:
//        rotate 1 steps to the right: [7,1,2,3,4,5,6]
//        rotate 2 steps to the right: [6,7,1,2,3,4,5]
//        rotate 3 steps to the right: [5,6,7,1,2,3,4]
//        Example 2:
//
//        Input: nums = [-1,-100,3,99], k = 2
//        Output: [3,99,-1,-100]
//        Explanation:
//        rotate 1 steps to the right: [99,-1,-100,3]
//        rotate 2 steps to the right: [3,99,-1,-100]
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        -231 <= nums[i] <= 231 - 1
//        0 <= k <= 105

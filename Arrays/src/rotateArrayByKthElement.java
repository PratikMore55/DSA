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

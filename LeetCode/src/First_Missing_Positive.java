class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i , correct);
            }
            else {
                i++;
            }
        }
        for (int in = 0; in < nums.length; in++){
            if (nums[in] != in + 1) {
                return in + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//41. First Missing Positive
//
//        Given an unsorted integer array nums, return the smallest missing positive integer.
//
//        You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
//
//
//
//        Example 1:
//
//        Input: nums = [1,2,0]
//        Output: 3
//        Explanation: The numbers in the range [1,2] are all in the array.
//        Example 2:
//
//        Input: nums = [3,4,-1,1]
//        Output: 2
//        Explanation: 1 is in the array but 2 is missing.
//        Example 3:
//
//        Input: nums = [7,8,9,11,12]
//        Output: 1
//        Explanation: The smallest positive integer 1 is missing.
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        -231 <= nums[i] <= 231 - 1
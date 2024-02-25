class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){

            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//287. Find the Duplicate Number
//
//        Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//        There is only one repeated number in nums, return this repeated number.
//
//        You must solve the problem without modifying the array nums and uses only constant extra space.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,4,2,2]
//        Output: 2
//        Example 2:
//
//        Input: nums = [3,1,3,4,2]
//        Output: 3
//
//
//        Constraints:
//
//        1 <= n <= 105
//        nums.length == n + 1
//        1 <= nums[i] <= n
//        All the integers in nums appear only once except for precisely one integer which appears two or more times.
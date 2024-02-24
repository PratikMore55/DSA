import java.util.ArrayList;
import java.util.List;

class Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


//448. Find All Numbers Disappeared in an Array
//
//
//        Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//
//
//
//        Example 1:
//
//        Input: nums = [4,3,2,7,8,2,3,1]
//        Output: [5,6]
//        Example 2:
//
//        Input: nums = [1,1]
//        Output: [2]
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 105
//        1 <= nums[i] <= n
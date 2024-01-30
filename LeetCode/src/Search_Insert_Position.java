class Search_Insert_Position {
    public int searchInsert(int[] arr, int target) {
        // if (target > arr[arr.length-1]){
        //     return -1;
        // }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
//                return target;
            }
        }
        return start;
    }
}


//35. Search Insert Position
//
//
//        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        You must write an algorithm with O(log n) runtime complexity.
//
//
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 5
//        Output: 2
//        Example 2:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1
//        Example 3:
//
//        Input: nums = [1,3,5,6], target = 7
//        Output: 4
//
//
//        Constraints:
//
//        1 <= nums.length <= 104
//        -104 <= nums[i] <= 104
//        nums contains distinct values sorted in ascending order.
//        -104 <= target <= 104
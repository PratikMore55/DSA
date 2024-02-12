class Majority_Elements {
    public int majorityElement(int[] arr) {
        Integer ans = null;
        int count = 0;
        for (int num : arr) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }
        return ans;
    }
}


//169. Majority Element
//
//
//        Given an array arr of size n, return the majority element.
//
//        The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//
//
//        Example 1:
//
//        Input: arr = [3,2,3]
//        Output: 3
//        Example 2:
//
//        Input: arr = [2,2,1,1,1,2,2]
//        Output: 2
//
//
//        Constraints:
//
//        n == arr.length
//        1 <= n <= 5 * 104
//        -109 <= arr[i] <= 109
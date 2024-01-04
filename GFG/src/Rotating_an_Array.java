class Solution {
    void leftRotate(int[] arr, int n, int d) {
        // code here
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            int index = (i + d) % n;
            arr1[i] = arr[index];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }
    }
}

//    Rotating an Array
//
//        Given an array of size N. The task is to rotate array by D elements where D ≤ N.
//
//        Example 1:
//
//        Input:
//        N = 7
//        Arr[] = {1, 2, 3, 4, 5, 6, 7}
//        D = 2
//        Output: 3 4 5 6 7 1 2
//        Explanation:
//        Rotate by 1: [2, 3, 4, 5, 6, 7, 1]
//        Rotate by 2: [3, 4, 5, 6, 7, 1, 2]
//
//        Example 2:
//
//        Input:
//        N = 4
//        Arr[] = {1, 3, 4, 2}
//        D = 3
//        Output: 2 1 3 4
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function leftRotate()
//        which takes the array of integers arr[], its size n and d as input parameters and rotates arr[] in-place
//        without using any extra memory.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
//
//
//        Constraints:
//        1 ≤ N ≤ 105
//        1 ≤ Arr[i] ≤ 1000
//        0 ≤ D ≤ N
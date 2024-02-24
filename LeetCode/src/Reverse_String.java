class Reverse_String {
    public void reverseString(char[] s) {

                          // Solution 1

        // for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
        //     char temp = s[i];
        //     s[i] = s[j];
        //     s[j] = temp;
        // }

                           // Solution 2

        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            right--;
            left++;
        }
    }
}


//344. Reverse String
//
//
//        Write a function that reverses a string. The input string is given as an array of characters s.
//
//        You must do this by modifying the input array in-place with O(1) extra memory.
//
//
//
//        Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//        Example 2:
//
//        Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]
//
//
//        Constraints:
//
//        1 <= s.length <= 105
//        s[i] is a printable ascii character.
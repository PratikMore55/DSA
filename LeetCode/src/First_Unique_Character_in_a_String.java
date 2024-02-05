class First_Unique_Character_in_a_String  {
    public int firstUniqChar(String s) {
        int len = s.length();

        if(len == 0){
            return -1;
        }

        int[] arr = new int[26];
        for(char c : s.toCharArray()){
            arr[c - 'a']++;
        }
        for(int i=0; i<len; i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

//387. First Unique Character in a String
//
//
//        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//
//
//        Example 1:
//
//        Input: s = "leetcode"
//        Output: 0
//        Example 2:
//
//        Input: s = "loveleetcode"
//        Output: 2
//        Example 3:
//
//        Input: s = "aabb"
//        Output: -1
//
//
//        Constraints:
//
//        1 <= s.length <= 105
//        s consists of only lowercase English letters.
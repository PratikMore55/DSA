class Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram  {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];

        for(int i = 0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        int res = 0;
        for(int count : arr){
            if(count > 0) res += count;
        }
        return res;
    }
}
class Find_First_Palindrome_String_in_Array {
    public String firstPalindrome(String[] words) {

                                       // method 1 : 2-pointer (not working)

        //      for (final String word : words){
        //         if (isPalindrome(word)){
        //             return word;
        //         }
        //     }
        //     return "";
        // }

        // private boolean isPalindrome(final String s){
        //     int i = 0;
        //     int j = 0;

        //     while (i<j){
        //         if (s.charAt(i++) != s.charAt(j--)){
        //             return false;
        //         }
        //     }
        //     return true;

                                  // method 2 : using StingBuilder

        // for (String word : words){
        //         StringBuilder rev = new StringBuilder(word).reverse();
        //         if (word.equals(rev.toString())){
        //             return word;
        //         }
        //     }
        //     return "";

                                // method 3 : using StingBuilder


        for(String word : words){
            StringBuilder rev = new StringBuilder(word);
            rev.reverse();
            String s1 = String.valueOf(rev);
            if(word.equals(s1)){
                return word;
            }
        }
        return "";
    }
}


class Palindrome_number {
    public boolean isPalindrome(int x ) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.println("x = ");
        //     x = sc.nextInt();

        //     int a, b = 0, c;
        //     a = x;
        //     while (x > 0){
        //         c = x % 10;
        //         b = (b * 10) + c;
        //         x = x/10;
        //     }
        //       if (a == b){
        //         System.out.println("true");
        //     }
        //     else {
        //         System.out.println("false");
        //    }
        //    return

        if(x < 0) return false;

        long reversed = 0;
        int y = x;

        while(y > 0){
            reversed = reversed*10 + y % 10;
            y /= 10;
        }
        // if(reversed == x) return reversed;
        return reversed == x;

    }
}



//9. Palindrome Number
//
//        Given an integer x, return true if x is a
//        palindrome
//        , and false otherwise.
//
//
//
//        Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
//
//
//        Constraints:
//
//        -231 <= x <= 231 - 1
//
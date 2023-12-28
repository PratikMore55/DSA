import java.util.Scanner;

public class PasswordChecker {
    public static final int Password_len = 8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n" +
                        "Input a password: ");
        String s = sc.nextLine();

        if (validPassword(s)){
            System.out.println("Password is valid: " +s);
        }
        else {
            System.out.println("Not a valid password: " +s);
        }
    }
    static boolean validPassword(String s){
        if (s.length() < Password_len) return false;

        int charCount = 0;
        int numCount = 0;
        for (int i=0;i<Password_len;i++){
            char ch = s.charAt(i);
            if (isNumeric(ch))  numCount++;
            else if (isLetter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }

    static boolean isNumeric(char ch) {
        return (ch >= '0' && ch<= '9');
    }

    static boolean isLetter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >='A' && ch<= 'Z');
    }
}


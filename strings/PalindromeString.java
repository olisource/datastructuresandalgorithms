package datastructuresandalgorithms.strings;

import java.util.Scanner;

/**
 * Created by arivolitirouvingadame on 3/28/17.
 */
public class PalindromeString {
    public static boolean isPalindrome(String inputString) {
        if (inputString == null) {
            return false;
        }

        int i = 0;
        int j = inputString.length() - 1;

        while (i < j) {
            if (inputString.charAt(i) != inputString.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n Enter a string: ");
        String inputString = scanner.nextLine();

        if (inputString != null) {
            if (isPalindrome(inputString)) {
                System.out.println("\n Input string " + inputString + " is a palindrome");
            } else {
                System.out.println("\n Input string " + inputString + " is NOT a palindrome");
            }
        }
    }
}
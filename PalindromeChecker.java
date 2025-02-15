import java.util.Scanner;

public class PalindromeChecker {
    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to check if a number is a palindrome
    static boolean isPalindrome(int num) {
        int original = num, reverse = 0, digit;
        while (num > 0) {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check Palindrome for a String
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }

        // Check Palindrome for a Number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class PalindromeChecker_Genio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The word '" + word + "' is a palindrome.");
        } else {
            System.out.println("The word  '" + word + "' is not a palindrome.");
        }
    }
}
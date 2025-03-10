import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter a String : ");
        String text = sc.nextLine();

        // Creating a PalindromeChecker object with user input
        PalindromeChecker checker = new PalindromeChecker(text);

        // Displaying the result
        checker.displayResult();

        // Closing Scanner
        sc.close();
    }

    // Attribute (field)
    private String text;

    // Constructor to initialize PalindromeChecker object
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("==== Palindrome Check ====");
        System.out.println("Text : " + text);
        if (isPalindrome()) {
            System.out.println("Result : The given text is a Palindrome.");
        } else {
            System.out.println("Result : The given text is NOT a Palindrome.");
        }
    }
}

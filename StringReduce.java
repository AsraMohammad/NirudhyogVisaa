import java.util.Scanner;

public class Solution {
    public static String reduceString(String input) {
        // Handle edge case for an empty string
        if (input == null || input.isEmpty()) {
            return ""; // Correctly handle the case for empty input
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        int count = 1;

        // Traverse the string from the second character
        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);

            // Check if the current character matches the next character
            if (nextChar == currentChar) {
                count++;
            } else {
                // Append the current character and its count to the result
                result.append(currentChar).append(count);

                // Reset for the next character
                currentChar = nextChar;
                count = 1;
            }
        }

        // Append the last character and its count
        result.append(currentChar).append(count);

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the input string
         
        String input = scanner.nextLine(); // Declare and initialize the input variable

        // Call the reduceString method and print the result
        String output = reduceString(input);
        System.out.println(output);

        scanner.close();
    }
}

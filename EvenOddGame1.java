import java.util.Scanner;

public class CharanVigneshGame {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the input number as a string to handle large numbers
        String N = scanner.nextLine();
        
        // Variable to hold the sum of digits
        int digitSum = 0;
        
        // Loop through each character in the string
        for (int i = 0; i < N.length(); i++) {
            // Convert the character to an integer and add it to the sum
            digitSum += N.charAt(i) - '0';  // charAt(i) gives a char, subtract '0' to convert it to int
        }
        
        // Check if the sum is even or odd
        if (digitSum % 2 == 0) {
            System.out.println("Vignesh");  // Sum is even, Vignesh wins
        } else {
            System.out.println("Charan");   // Sum is odd, Charan wins
        }
        
        // Close the scanner to prevent memory leaks
        scanner.close();
    }
}

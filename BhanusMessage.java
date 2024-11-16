import java.util.Scanner;  // Import Scanner class to take input from console

public class PhoneNumberValidator {
    
    // Method to validate the phone number based on the given rules
    public static void validateNumber(String number) {
        // Check if the number is exactly 10 digits long (no country code)
        if (number.matches("\\d{10}")) {
            System.out.println("Correct");  // If the number is valid, print "Correct"
            return;  // Exit the method after printing the result
        }
        
        // Check if the number starts with a country code +xx followed by a space and 10 digits
        if (number.startsWith("+") && number.contains(" ")) {
            String[] parts = number.split(" ");  // Split the string into two parts: country code and phone number
            String countryCode = parts[0].substring(1);  // Remove the '+' symbol from the country code
            String phoneNumber = parts[1];  // The second part will be the phone number
            
            // Check if the country code is valid ( 2 digits)
            // Also check if the phone number is exactly 10 digits long
            if (countryCode.matches("\\d{2}") && phoneNumber.matches("\\d{10}")) {
                // Now we check if the sum of the digits in the phone number is greater than 0
                int sum = 0;
                for (char c : phoneNumber.toCharArray()) {
                    sum += c - '0';  // Convert the character to its integer value and add it to the sum
                }
                
                // If the sum of digits is greater than 0, the number is valid
                if (sum > 0) {
                    System.out.println("Correct");  // Print "Correct" if the sum is valid
                } else {
                    System.out.println("Incorrect");  // If the sum is 0 (all zeros), print "Incorrect"
                }
            } else {
                System.out.println("Incorrect");  // If the country code is not 1 or 2 digits or the phone number is not 10 digits
            }
        } else {
            System.out.println("Incorrect");  // If the input doesn't match the expected formats, print "Incorrect"
        }
    }
    
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a phone number
        System.out.print("Enter the phone number: ");
        
        // Read the input from the console
        String number = scanner.nextLine();
        
        // Call the validateNumber method to check if the entered phone number is correct
        validateNumber(number);
        
        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}

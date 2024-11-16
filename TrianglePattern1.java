import java.util.Scanner;

public class NumberTriangle {

    public static void main(String[] args) {
        // Create a scanner to read the input
        Scanner scanner = new Scanner(System.in);
        
        // Read the height of the triangle
        int N = scanner.nextInt();
        
        // Initialize the starting number
        int currentNumber = 1;
        
        // Loop through each row (i from 1 to N)
        for (int i = 1; i <= N; i++) {
            // Print i numbers in the current row
            for (int j = 1; j <= i; j++) {
                // Print the current number followed by a space (except after the last number in the row)
                System.out.print(currentNumber + " ");
                
                // Increment the current number
                currentNumber++;
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
        
        // Close the scanner
        scanner.close();
    }
}

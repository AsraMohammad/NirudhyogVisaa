import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input value for the height of the triangle
        int N = scanner.nextInt();

        // Generate and print the triangle
        for (int i = 1; i <= N; i++) {
            // Print the number 'i' exactly 'i' times in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print(" "); // Add a space between numbers
                }
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}

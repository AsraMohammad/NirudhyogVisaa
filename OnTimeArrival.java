import java.util.Scanner;

public class AjayOnTime {

    public static void main(String[] args) {
        // Create a scanner to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read the number of minutes Ajay leaves earlier
            int X = scanner.nextInt();
            
            // Determine if Ajay will reach on time
            if (X >= 30) {
                System.out.println("YES");  // If he leaves 30 minutes or more before, he is on time
            } else {
                System.out.println("NO");  // If he leaves less than 30 minutes before, he is late
            }
        }
        
        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}


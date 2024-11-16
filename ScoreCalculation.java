import java.util.Scanner;

public class AjayScoreCalculator {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Iterate over each test case
        for (int i = 0; i < T; i++) {
            // Read the total points (X) and the number of test cases passed (N)
            int X = scanner.nextInt();
            int N = scanner.nextInt();
            
            // Calculate the points per test case (X divided by 10)
            int pointsPerTestCase = X / 10;
            
            // Calculate the score as points per test case times the number of test cases passed
            int score = pointsPerTestCase * N;
            
            // Print the calculated score
            System.out.println(score);
        }
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Iterate through each test case
        for (int t = 0; t < T; t++) {
            // Read X (total points) and N (number of test cases passed)
            int X = scanner.nextInt();
            int N = scanner.nextInt();

            // Calculate points per test case
            int pointsPerTestCase = X / 10;

            // Calculate Ajay's score
            int score = pointsPerTestCase * N;

            // Output the score for this test case
            System.out.println(score);
        }

        scanner.close();
    }
}

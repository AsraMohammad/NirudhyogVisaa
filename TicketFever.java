import java.util.Scanner;

public class IPLTickets {

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Loop for each test case
        for (int i = 0; i < T; i++) {
            // Read N (students) and M (tickets)
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            
            // Calculate the number of students without tickets
            if (N <= M) {
                System.out.println(0); // All students get tickets
            } else {
                System.out.println(N - M); // Some students won't get tickets
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}

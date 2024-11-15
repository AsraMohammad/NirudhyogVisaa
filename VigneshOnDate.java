/**
 * Problem Statement:
 * Vignesh went on a date and took some money (a) to pay for the bill (b).
 * The program determines if the money Vignesh brought is enough to pay the bill.
 *
 * Input:
 * - Two space-separated integers:
 *   1. a (money brought)
 *   2. b (bill amount)
 *
 * Output:
 * - "YES" if a >= b
 * - "NO" otherwise
 */

import java.io.*;
import java.util.*;

// The class name is Solution, as required by competitive programming platforms.
public class Solution {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner Sc = new Scanner(System.in);

        // Read the amount of money Vignesh brought (long type to handle large values)
        long a = Sc.nextLong();

        // Read the bill amount (long type to handle large values)
        long b = Sc.nextLong();

        // Check if Vignesh has enough money to pay the bill
        if (a - b >= 0) {
            // Print "YES" if he has enough money
            System.out.print("YES");
        } else {
            // Print "NO" if he does not have enough money
            System.out.print("NO");
        }

        // Close the scanner to release resources
        Sc.close();
    }
}

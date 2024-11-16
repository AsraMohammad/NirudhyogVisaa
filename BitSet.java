import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int K = sc.nextInt();
        boolean isSet = ((N >> (K - 1)) & 1) == 1;
        System.out.println(isSet ? "true" : "false");
        sc.close();
    }
}

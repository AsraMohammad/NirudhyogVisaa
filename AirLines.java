import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int planesrequired = (n+99)/100;
        int additionalplanes = Math.max(0, planesrequired-x);
        System.out.println(additionalplanes);
        sc.close();
    }
}

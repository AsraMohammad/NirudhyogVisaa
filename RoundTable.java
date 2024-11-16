import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
    
        int factorial = 1;
        for(int i=1;i<=X;i++) {
            factorial *= i;
            
        }
         
        System.out.println(factorial);
        sc.close();
    }
}

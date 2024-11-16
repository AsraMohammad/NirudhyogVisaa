import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
         
        } else if(month >= 6 && month <= 8) {
            System.out.println("Summer");
        } else if(month >= 9 && month <= 11) {
            System.out.println("Autumn");
        } else if(month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}

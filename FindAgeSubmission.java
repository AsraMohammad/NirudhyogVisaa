Here’s the **Problem Statement**, **Solution Explanation**, and **Dry Run** in comments for the provided code:

```java
import java.io.*; 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* 
         * Problem Statement:
         * Vignesh is currently 10 years old, and Charan is currently 25 years old.
         * You need to calculate Vignesh's age when Charan was (or will be) X years old.
         * 
         * Input:
         * - A single integer X (Charan's age at a given time).
         * 
         * Output:
         * - Print Vignesh's age when Charan's age is X.
         * 
         * Example:
         * Input: 30
         * Output: 15
         */

        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);

        // Read the input value X (Charan's age at a given time)
        int X = sc.nextInt();

        // The age gap between Charan and Vignesh is constant (25 - 10 = 15)
        int ageGap = 25 - 10;

        // Vignesh's age when Charan is X years old
        int Y = X - ageGap;

        // Output the result
        System.out.println(Y);

        // Close the scanner to free resources
        sc.close();
    }
}
```

---

### **Solution Explanation**:

1. **Age Gap**:
   - The difference between Charan's and Vignesh's age is constant:
     \[
     \text{Age Gap} = 25 - 10 = 15
     \]
   - This means Charan is always 15 years older than Vignesh.

2. **Relationship**:
   - To find Vignesh's age when Charan's age is **X**, subtract the age gap from **X**:
     \[
     \text{Vignesh's Age} = X - \text{Age Gap}
     \]

3. **Output**:
   - Print the calculated value of Vignesh's age when Charan's age is **X**.

---

### **Dry Run**:

#### Test Case 1:
**Input**:
```
30
```

**Execution**:
1. Input value \( X = 30 \).
2. Calculate the age gap: \( 25 - 10 = 15 \).
3. Calculate Vignesh's age: \( 30 - 15 = 15 \).

**Output**:
```
15
```

---

#### Test Case 2:
**Input**:
```
20
```

**Execution**:
1. Input value \( X = 20 \).
2. Calculate the age gap: \( 25 - 10 = 15 \).
3. Calculate Vignesh's age: \( 20 - 15 = 5 \).

**Output**:
```
5
```

---

#### Test Case 3:
**Input**:
```
15
```

**Execution**:
1. Input value \( X = 15 \).
2. Calculate the age gap: \( 25 - 10 = 15 \).
3. Calculate Vignesh's age: \( 15 - 15 = 0 \).

**Output**:
```
0
```

---

### **Conclusion**:
The program effectively calculates Vignesh's age for any given value of Charan's age \( X \), based on the constant age gap of 15 years. It handles both past and future scenarios, including edge cases where Charan's age is less than 15 (resulting in negative ages for Vignesh).

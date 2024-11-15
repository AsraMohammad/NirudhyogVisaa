Here's the **Problem Statement**, **Solution Explanation**, and **Dry Run** in comments for your code:

```java
import java.io.*; 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* 
         * Problem Statement:
         * You know that:
         * - 1 kg of pulp can be used to produce 1000 pages.
         * - Each notebook consists of 100 pages.
         * 
         * Given 'N', the weight of pulp in kilograms, calculate the total number of notebooks 
         * that can be produced by the factory.
         *
         * Input:
         * - A single integer N representing the amount of pulp (in kilograms).
         * 
         * Output:
         * - Print the total number of notebooks that can be produced.
         * 
         * Constraints:
         * - 1 <= N <= 10^6
         * 
         * Approach:
         * - From 1 kg of pulp, 1000 pages are produced.
         * - Each notebook requires 100 pages.
         * - Therefore, from 1 kg of pulp, 10 notebooks can be produced.
         * - For N kg of pulp, the total notebooks are: N * 10.
         */

        // Read the input value (N, weight of pulp)
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Calculate the total number of notebooks
        int Notebooks = N * 10;

        // Print the result
        System.out.println(Notebooks);

        // Close the scanner to free resources
        sc.close();
    }
}
```

---

### Explanation of the Problem and Solution:

1. **Input Details**:
   - The input is a single integer \( N \), which represents the weight of pulp (in kilograms).

2. **Calculations**:
   - From **1 kg of pulp**, **1000 pages** are produced.
   - Since each notebook requires **100 pages**, from **1 kg of pulp**, **10 notebooks** can be made.
   - For \( N \) kilograms of pulp, the total number of notebooks is:
     \[
     \text{Notebooks} = N \times 10
     \]

3. **Output**:
   - The output is the total number of notebooks that can be made with \( N \) kilograms of pulp.

4. **Efficiency**:
   - The calculation involves a single multiplication operation, making it very efficient even for the upper limit of \( N = 10^6 \).

---

### Dry Run:

#### Test Case 1:
**Input**:
```
100
```

**Steps**:
1. \( N = 100 \) (weight of pulp in kilograms).
2. Calculate the total notebooks: \( 100 \times 10 = 1000 \).
3. Print \( 1000 \).

**Output**:
```
1000
```

---

#### Test Case 2:
**Input**:
```
50
```

**Steps**:
1. \( N = 50 \).
2. Calculate the total notebooks: \( 50 \times 10 = 500 \).
3. Print \( 500 \).

**Output**:
```
500
```

---

#### Test Case 3:
**Input**:
```
1
```

**Steps**:
1. \( N = 1 \).
2. Calculate the total notebooks: \( 1 \times 10 = 10 \).
3. Print \( 10 \).

**Output**:
```
10
```

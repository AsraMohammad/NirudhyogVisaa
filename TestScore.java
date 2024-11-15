### Problem Statement

In a test, there are **N problems**, each carrying **X marks**. In each problem, Vignesh either receives **X marks** or **0 marks**. 

Your task is to determine whether it is possible for Vignesh to achieve exactly **Y marks** in the test.

### Input Format

- A single line input containing three space-separated integers: **N**, **X**, and **Y**.
  - **N**: The number of problems in the test.
  - **X**: The marks each problem carries.
  - **Y**: The target marks Vignesh aims to achieve.

### Constraints

- **1 ≤ N, X, Y ≤ 10^4**

### Output Format

- Print **"YES"** if Vignesh can achieve exactly **Y marks**.
- Print **"NO"** otherwise.

### Example:

#### Sample Input 0:
```
1 8 4
```

#### Sample Output 0:
```
NO
```

### Explanation

- There is only **1 problem**, and it carries **8 marks**.
- Vignesh can either score **8 marks** or **0 marks** on this problem.
- He needs to achieve **4 marks**, but this is impossible because each problem carries **8 marks**.
- So, the output is **"NO"**.

---

### Logic Explanation

To determine if it is possible for Vignesh to achieve exactly **Y marks**, consider the following:

1. **Marks distribution**: Vignesh can only receive **0** or **X** marks for each problem. Hence, the possible total marks Vignesh can achieve are the sum of **X marks** for some number of problems.
   
2. **Key observation**:
   - If Vignesh scores **X marks** in **k** problems, the total marks will be **k * X**.
   - The goal is to check if it is possible for **k** to be such that **k * X = Y**, where **k** is a non-negative integer between **0** and **N** (because there are **N** problems in total).

3. **Mathematical check**:
   - For Vignesh to get exactly **Y marks**, we need to check if **Y** is a multiple of **X** and if the number of problems that need to be solved for this to happen is less than or equal to **N**.
   - That is, check if **Y % X == 0** (i.e., **Y** is divisible by **X**).
   - Also, check if the quotient **Y / X** is less than or equal to **N**, because Vignesh can't solve more problems than there are.

### Plan:

1. First, check if **Y** is divisible by **X**.
2. If **Y % X == 0**, calculate how many problems Vignesh would need to solve to achieve **Y marks** (i.e., **Y / X**).
3. If this value is less than or equal to **N**, print **"YES"**, otherwise print **"NO"**.

---

### Code:

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Read input values for N, X, and Y
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Step 1: Check if Y is divisible by X
        if (Y % X == 0) {
            // Step 2: Calculate how many problems would need to be solved
            int problemsNeeded = Y / X;
            
            // Step 3: Check if the number of problems needed is <= N
            if (problemsNeeded <= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
```

### Explanation of the Code:

1. **Input Handling**: We use a `Scanner` to read the input values: **N**, **X**, and **Y**.
2. **Divisibility Check**: We first check if **Y** is divisible by **X** (`Y % X == 0`). If not, it's impossible to achieve exactly **Y marks**, and we print **"NO"**.
3. **Calculation of Problems Needed**: If **Y** is divisible by **X**, we calculate the number of problems Vignesh needs to solve using `problemsNeeded = Y / X`.
4. **Check if Possible**: We check if the number of problems needed is less than or equal to **N**. If so, Vignesh can achieve **Y marks**, and we print **"YES"**. Otherwise, we print **"NO"**.

---

### Dry Run:

#### Input:
```
1 8 4
```

- **Step 1**: Check if **Y (4)** is divisible by **X (8)**:
  - **4 % 8 == 0**? No. So, the answer is **"NO"**.

#### Output:
```
NO
```

#### Input:
```
5 4 16
```

- **Step 1**: Check if **Y (16)** is divisible by **X (4)**:
  - **16 % 4 == 0**? Yes.
  
- **Step 2**: Calculate the number of problems needed: **16 / 4 = 4** problems.

- **Step 3**: Check if **4 <= N (5)**:
  - Yes, so the answer is **"YES"**.

#### Output:
```
YES
```

---

### Time Complexity:
- The time complexity is **O(1)** since we are only performing a few arithmetic checks and comparisons.

### Space Complexity:
- The space complexity is **O(1)** because we only need a few integer variables to store the input and results.

### Conclusion:
This solution efficiently checks if Vignesh can achieve exactly **Y marks** based on the given constraints.

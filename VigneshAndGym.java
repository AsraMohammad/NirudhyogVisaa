### Problem Statement:

Vignesh has decided to join a gym, and if possible, also hire a personal trainer at the gym. The monthly cost of the gym is `a`, and hiring a personal trainer will cost him an additional `b` per month. Vignesh's total budget per month is `c`.

Your task is to determine:
- **0** if Vignesh cannot even join the gym (i.e., the gym cost `a` exceeds his budget `c`).
- **1** if he can join the gym but cannot afford the personal trainer (i.e., the gym cost is within the budget, but the total cost with the trainer exceeds the budget).
- **2** if he can afford both the gym and the personal trainer (i.e., the combined cost of the gym and trainer is within the budget).

### Input:
- Three integers `a`, `b`, and `c` are provided:
  - `a`: Monthly cost of the gym.
  - `b`: Additional monthly cost for a personal trainer.
  - `c`: Vignesh's total monthly budget.

### Output:
- Print `2` if Vignesh can afford both the gym and the personal trainer.
- Print `1` if Vignesh can only afford the gym but not the trainer.
- Print `0` if Vignesh cannot afford the gym at all.

### Constraints:
- `1 ≤ a, b, c ≤ 10^9`

### Code Explanation:

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        
        // Read the input values for gym cost, trainer cost, and budget
        long a = sc.nextLong();  // a = gym cost
        long b = sc.nextLong();  // b = trainer cost
        long c = sc.nextLong();  // c = total budget
        
        long x = a + b;  // Total cost if Vignesh decides to hire a trainer
        
        // Check if the total cost is within the budget
        if (c >= x) {  // If the budget is greater than or equal to the combined cost
            System.out.println(2);  // Vignesh can afford both the gym and the trainer
        }
        // Check if Vignesh can only afford the gym, but not the trainer
        else if (a < c) {  // If the gym cost is less than the total budget
            System.out.println(1);  // Vignesh can afford only the gym
        } else {  // If the gym cost is greater than the budget
            System.out.println(0);  // Vignesh cannot even join the gym
        }
        
        sc.close();  // Close the scanner to avoid resource leak
    }
}
```

### Explanation:

1. **Input Handling**:
   - We use the `Scanner` object to read three integers: `a`, `b`, and `c` (gym cost, trainer cost, and total budget, respectively).
   - The `nextLong()` method is used to read the input values because the constraints can handle values as large as `10^9`.

2. **Logic**:
   - We calculate the total cost of joining the gym and hiring a personal trainer (`x = a + b`).
   - We first check if Vignesh can afford both the gym and the trainer. If `c >= x`, we print `2`.
   - If Vignesh cannot afford both, we check if he can afford just the gym (`a < c`). If true, we print `1`.
   - If neither of the above conditions is met, Vignesh cannot afford the gym, so we print `0`.

3. **Edge Cases**:
   - **Exact budget**: If `a + b == c`, the output will be `2` because Vignesh can afford both.
   - **Only gym affordable**: If `a < c` but `a + b > c`, the output will be `1`.

### Dry Run Example:

#### Test Case 1:
**Input**:
```
5 3 8
```

- `a = 5` (gym cost), `b = 3` (trainer cost), `c = 8` (total budget).
- Total cost (`x = a + b`) = `5 + 3 = 8`.
- Since the total budget `c` is equal to the combined cost, Vignesh can afford both the gym and the personal trainer.
- The output will be `2`.

#### Test Case 2:
**Input**:
```
5 3 7
```

- `a = 5` (gym cost), `b = 3` (trainer cost), `c = 7` (total budget).
- Total cost (`x = a + b`) = `5 + 3 = 8`.
- Since the budget `c = 7` is less than the combined cost `8`, Vignesh can afford the gym but not the trainer.
- The output will be `1`.

#### Test Case 3:
**Input**:
```
10 5 8
```

- `a = 10` (gym cost), `b = 5` (trainer cost), `c = 8` (total budget).
- Since the gym cost `a = 10` is more than the budget `c = 8`, Vignesh cannot afford the gym.
- The output will be `0`.

### Conclusion:

The program efficiently checks whether Vignesh can afford the gym, the trainer, or neither based on the given budget and costs. This solution ensures that all edge cases are handled, and it provides the correct output for varying input values.

Feel free to copy the code and explanation to your GitHub file!

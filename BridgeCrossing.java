Here’s the **Problem Statement**, **Solution Explanation**, and **Dry Run** in the comments for the provided Java code:

```java
import java.io.*; 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* 
         * Problem Statement:
         * A mango weighs 'a' kilograms, and a truck weighs 'b' kilograms.
         * The bridge has a maximum weight capacity of 'c' kilograms.
         * Find the maximum number of mangoes that can be loaded in the truck
         * so that the total weight of the truck and mangoes does not exceed 'c'.
         */
        
        // Read input values
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // Weight of one mango
        int b = sc.nextInt(); // Weight of the truck
        int c = sc.nextInt(); // Maximum weight capacity of the bridge
        
        // Calculate the remaining weight capacity for mangoes
        int x = c - b;
        
        // If the truck itself exceeds or matches the bridge's weight capacity
        if (x <= 0) {
            System.out.println(0); // No mangoes can be loaded
        } else {
            // Calculate the maximum number of mangoes that can be loaded
            int y = x / a;
            System.out.println(y);
        }
        
        // Close the scanner object to free resources
        sc.close();
    }
}
```

---

### **Problem Statement**:
You are tasked with finding the maximum number of mangoes that can be loaded onto a truck while ensuring that the total weight (truck + mangoes) does not exceed the weight capacity of a bridge.

Given:
1. **a**: The weight of one mango (in kilograms).
2. **b**: The weight of the truck (in kilograms).
3. **c**: The maximum weight capacity of the bridge (in kilograms).

### **Input Format**:
- A single line containing three integers: `a` (weight of one mango), `b` (weight of the truck), and `c` (weight capacity of the bridge).

### **Output Format**:
- Print the maximum number of mangoes that can be loaded on the truck so it can cross the bridge safely.

---

### **Solution Explanation**:
1. **Remaining Capacity**: 
   - The remaining capacity for mangoes is the difference between the bridge's weight capacity and the truck's weight:
     \[
     \text{Remaining Capacity} = c - b
     \]
   - If the truck's weight (`b`) exceeds or equals the bridge's capacity (`c`), no mangoes can be loaded.

2. **Maximum Mangoes**:
   - If the remaining capacity is positive, calculate how many mangoes can fit within that capacity:
     \[
     \text{Maximum Mangoes} = \frac{\text{Remaining Capacity}}{\text{Weight of One Mango}}
     \]
   - Use integer division (`/`) to ensure that the number of mangoes is an integer.

3. **Edge Cases**:
   - If `b >= c`, output `0` because the truck alone is too heavy for the bridge.
   - If `a > c - b`, output `0` because even one mango cannot fit within the remaining capacity.

---

### **Dry Run**:

#### Test Case 1:
**Input**:
```
2 5 11
```

**Steps**:
1. **Remaining Capacity**: `c - b = 11 - 5 = 6`.
2. **Maximum Mangoes**: `6 / 2 = 3`.

**Output**:
```
3
```

---

#### Test Case 2:
**Input**:
```
3 8 15
```

**Steps**:
1. **Remaining Capacity**: `c - b = 15 - 8 = 7`.
2. **Maximum Mangoes**: `7 / 3 = 2`.

**Output**:
```
2
```

---

#### Test Case 3:
**Input**:
```
4 10 9
```

**Steps**:
1. **Remaining Capacity**: `c - b = 9 - 10 = -1` (negative).
2. Since the remaining capacity is less than or equal to zero, output `0`.

**Output**:
```
0
```

---

### **Conclusion**:
The solution calculates the remaining capacity after accounting for the truck's weight and determines how many mangoes can fit within that capacity. The logic ensures that the truck and mangoes' combined weight never exceeds the bridge's weight limit.*/

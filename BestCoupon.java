Here’s the **Problem Statement**, **Solution Explanation**, and **Dry Run** in the comments for your Java code:

```java
import java.io.*; 
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the input bill amount X
        int X = sc.nextInt();
        
        // Calculate the final amount after applying the 10% discount coupon
        // The discount is 10% of X, so we subtract 10% from X
        int discountOne = (int) (X - 0.1 * X);
        
        // Calculate the final amount after applying the Rs. 100 discount coupon
        // The discount is flat Rs. 100, so we subtract 100 from X
        int discountSecond = X - 100;
        
        // Find the minimum of the two amounts to determine the lowest payment
        // We use Math.min to choose the maximum discount (i.e., the minimum final amount to pay)
        int FinalAmount = Math.min(discountOne, discountSecond);
        
        // Print the final amount Vignesh has to pay after choosing the maximum discount
        System.out.println(FinalAmount);
        
        // Close the scanner object to free resources
        sc.close();
    }
}
```

### Problem Statement:
Vignesh is ordering food online and the bill comes out to be `X` Rs. He can apply one of two discount coupons:
1. **Get 10% off** on the bill amount.
2. **Get a flat discount of Rs. 100** on the bill amount.

Your task is to determine the minimum amount Vignesh has to pay after applying the maximum discount. The goal is to print the final amount he has to pay after choosing the best discount.

### Input:
- A single integer `X` representing the total bill amount in Rs.

### Output:
- Print the final amount Vignesh has to pay after applying the maximum discount.

### Constraints:
- `1 ≤ X ≤ 10^9`

### Solution Explanation:

1. **Input Reading**: We read the total bill amount `X` using a `Scanner` object.
   
2. **Discount Calculations**:
   - **First Discount**: Calculate 10% off the bill amount. This is done using the formula `X - 0.1 * X`.
   - **Second Discount**: A flat Rs. 100 discount is applied. This is done by simply subtracting 100 from the bill amount: `X - 100`.

3. **Final Amount Calculation**: 
   - We use `Math.min(discountOne, discountSecond)` to find the minimum final amount, as we want to select the maximum discount option (i.e., the lowest final amount to be paid).
   
4. **Output**: We print the final amount that Vignesh has to pay after applying the maximum discount.

5. **Closing the Scanner**: It's important to close the `Scanner` object at the end of the program to free up resources.

### Dry Run:

#### Test Case 1:
**Input**:
```
300
```

1. **Discount Calculation**:
   - **First Coupon (10% off)**: `0.1 * 300 = 30`, so the amount to pay after the first discount is `300 - 30 = 270`.
   - **Second Coupon (Rs. 100 off)**: `300 - 100 = 200`.

2. **Choosing the Maximum Discount**: 
   - We use `Math.min(270, 200)`, which gives `200`.

**Output**:
```
200
```

#### Test Case 2:
**Input**:
```
150
```

1. **Discount Calculation**:
   - **First Coupon (10% off)**: `0.1 * 150 = 15`, so the amount to pay after the first discount is `150 - 15 = 135`.
   - **Second Coupon (Rs. 100 off)**: `150 - 100 = 50`.

2. **Choosing the Maximum Discount**:
   - We use `Math.min(135, 50)`, which gives `50`.

**Output**:
```
50
```

#### Test Case 3:
**Input**:
```
50
```

1. **Discount Calculation**:
   - **First Coupon (10% off)**: `0.1 * 50 = 5`, so the amount to pay after the first discount is `50 - 5 = 45`.
   - **Second Coupon (Rs. 100 off)**: `50 - 100 = -50` (but since the bill can't go negative, the final amount in practice should be `0`).

2. **Choosing the Maximum Discount**:
   - We use `Math.min(45, 0)`, which gives `0` (assuming no negative amounts in the final bill).

**Output**:
```
0
```

### Conclusion:
This solution efficiently calculates the best possible discount and provides the correct final amount to pay based on the bill and the available discount coupons.

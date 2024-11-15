### Problem Statement

Vignesh and Charan are playing the game of **Rock-Paper-Scissors**. The rules of the game are as follows:

- **R** (Rock) beats **S** (Scissors).
- **S** (Scissors) beats **P** (Paper).
- **P** (Paper) beats **R** (Rock).

Given the choices made by **Vignesh** and **Charan**, you need to determine the winner.

- If **Vignesh** wins, print "Vignesh".
- If **Charan** wins, print "Charan".
- If the game is a tie (i.e., both choose the same option), print "NULL".

### Input Format

- A single line containing two characters: the first character represents **Vignesh's** choice, and the second character represents **Charan's** choice. The characters will be one of **R** (Rock), **P** (Paper), or **S** (Scissors).

### Constraints

- The input characters will always be one of **R**, **P**, or **S**.

### Output Format

- Print the name of the winner (**Vignesh** or **Charan**) based on the rules of the game.
- If there is no winner (i.e., both players choose the same option), print **NULL**.

### Example:

#### Sample Input 0:
```
S P
```

#### Sample Output 0:
```
Vignesh
```

### Explanation

- **Vignesh** chooses **Scissors** (S) and **Charan** chooses **Paper** (P).
- According to the rules of the game:
  - **Scissors** beats **Paper**, so **Vignesh** wins.

#### Sample Input 1:
```
R R
```

#### Sample Output 1:
```
NULL
```

### Explanation:

- Both players choose **Rock** (R), so the game is a tie and there's no winner. Hence, the output is **NULL**.

---

### Solution Explanation

1. **Input Parsing**: 
   - We will read two characters from the input: the first for **Vignesh's** choice and the second for **Charan's** choice.

2. **Game Logic**: 
   - We will use conditional checks to compare the choices:
     - If both players choose the same option, it's a tie, and we print **NULL**.
     - We then check if **Vignesh's choice** beats **Charan's choice** using the rules:
       - **Rock (R)** beats **Scissors (S)**.
       - **Scissors (S)** beats **Paper (P)**.
       - **Paper (P)** beats **Rock (R)**.
     - If **Vignesh's choice** beats **Charan's**, we print **Vignesh**.
     - If not, we print **Charan**.

3. **Edge Case**:
   - If both players make the same choice, it results in a **tie**, and we print **NULL**.

### Dry Run

Let's dry run the program with an example input.

#### Input:
```
S P
```

- **Step 1**: Read the input:
  - Vignesh's choice = **S** (Scissors)
  - Charan's choice = **P** (Paper)

- **Step 2**: Check if both choices are the same:
  - They are not the same (S != P), so move to the next step.

- **Step 3**: Check if Vignesh wins:
  - **S** (Scissors) beats **P** (Paper), so Vignesh wins.

- **Step 4**: Output the result:
  - Print **Vignesh**.

#### Output:
```
Vignesh
```

---

### Code with Comments

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Step 1: Read the input for Vignesh's and Charan's choices
        Scanner sc = new Scanner(System.in);
        char vigneshChoice = sc.next().charAt(0);  // Vignesh's choice (R, P, S)
        char charanChoice = sc.next().charAt(0);  // Charan's choice (R, P, S)

        // Step 2: Check if both choices are the same (tie case)
        if (vigneshChoice == charanChoice) {
            System.out.println("NULL");  // If it's a tie, print "NULL"
        } else if ((vigneshChoice == 'R' && charanChoice == 'S') || 
                   (vigneshChoice == 'S' && charanChoice == 'P') || 
                   (vigneshChoice == 'P' && charanChoice == 'R')) {
            // Step 3: Check if Vignesh's choice beats Charan's choice
            System.out.println("Vignesh");  // Vignesh wins
        } else {
            // Step 4: If none of the above conditions are met, Charan wins
            System.out.println("Charan");  // Charan wins
        }

        sc.close();  // Close the scanner object
    }
}
```

### Explanation of Code:
1. **Input**: We use `sc.next().charAt(0)` to read the first character for **Vignesh's choice** and the second character for **Charan's choice**.
2. **Conditions**: 
   - First, we check if both players made the same choice. If they did, it’s a tie, and we print "NULL".
   - If not, we use conditional statements to determine if **Vignesh** wins based on the rules of the game.
3. **Output**: Based on the checks, we print either **Vignesh**, **Charan**, or **NULL** for a tie.

### Sample Runs:

#### Input 1:
```
S P
```
#### Output 1:
```
Vignesh
```

#### Input 2:
```
R R
```
#### Output 2:
```
NULL
```

#### Input 3:
```
P S
```
#### Output 3:
```
Charan
```

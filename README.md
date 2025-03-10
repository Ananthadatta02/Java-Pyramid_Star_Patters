# Pyramid Stars Pattern - Java Program

## Overview
This Java program generates a pyramid star pattern based on the user-provided size. It utilizes nested loops to align stars symmetrically, ensuring proper spacing and formatting.

## Code
```java
package star_patterns;

import java.util.Scanner;
public class PyramidStars
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size");
        int size = s.nextInt();
        int space = size - 1;
        int star = 1;

        for (int i = 0; i <= size - 1; i++)
        {
            for (int j = 1; j <= space; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= star; j++)
            {
                System.out.print("*");
            }
            space--;
            star += 2;
            System.out.println();
        }
    }
}
```

## Explanation

### **1. Importing Scanner Class**
The program uses the `Scanner` class to take user input for the size of the pyramid.

### **2. Variables**
- `size`: Stores the user input to determine the height of the pyramid.
- `space`: Controls the number of leading spaces before the stars in each row. Initialized to `size - 1` to create proper alignment.
- `star`: Tracks the number of stars printed in each row, starting with 1 and increasing by 2 per row.

### **3. Outer Loop**
```java
for (int i = 0; i <= size - 1; i++)
```
- Iterates `size` times to create the required number of rows.
- Starts from `0` and runs until `size - 1`, ensuring `size` rows are printed.

### **4. Inner Loops**
#### **First Inner Loop (Printing Spaces)**
```java
for (int j = 1; j <= space; j++)
```
- Prints spaces before stars to center-align the pyramid.
- Initially prints `size - 1` spaces in the first row and decreases by 1 each row.

#### **Second Inner Loop (Printing Stars)**
```java
for (int j = 1; j <= star; j++)
```
- Prints stars in each row.
- Starts with 1 star and increases by 2 per row to maintain pyramid shape.

### **5. Updating Variables**
```java
space--;
star += 2;
```
- `space--`: Reduces space count by 1 after each row to shift the stars to the left.
- `star += 2`: Increases the number of stars by 2 each row to expand the pyramid.

### **6. Printing Statement**
```java
System.out.println();
```
- Moves the cursor to a new line after printing each row to ensure correct formatting.

## **Example Output**
```
Enter Size
4
   *
  ***
 *****
*******
```

## **Customization**
- Change the `size` input to generate a larger or smaller pyramid.
- Modify the characters in `System.out.print("*");` to print other symbols.

## **Conclusion**
This program demonstrates the use of loops, condition handling, and formatting techniques in Java. It effectively creates a well-structured pyramid pattern using nested loops and proper variable management.

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Pyramid_Star_Patters.git
```

1.Write a Java program that calculates the sum of all even numbers present in an ArrayList of integers.

Logic :
Step1 Create an ArrayList of integers.
Traverse using a for-each loop.
Check if number is even (num % 2 == 0).
Add even numbers to sum.
Print the final sum.

Code :

package JavaTask;

/*ArrayList:
The ArrayList class implements the List interface.
It uses a dynamic array to store the duplicate element of different data types. 
The ArrayList class maintains the insertion order. */

import java.util.ArrayList;

public class EvenSum {
    public static void main(String[] args)
    {
        // Create ArrayList
        ArrayList<Integer> num = new ArrayList<>();

        // Add elements
        num.add(10);
        num.add(15);
        num.add(35);
        num.add(65);
        num.add(20);
        num.add(25);
        num.add(30);
        num.add(40);
        num.add(75);
        num.add(85);
        num.add(47);
        num.add(37);
        
        int sum = 0;

        // Loop through ArrayList
        for (int number : num) 
        {
            if (number % 2 == 0) 
            {      // Check even number
                sum += number;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
     }
}


Output :

Sum of even numbers: 100
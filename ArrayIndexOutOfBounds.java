1.Create a program with a logic that throws the ArrayIndexOutOfBoundsException while accessing elements in an array.[Hint: Use array and loop and try to access the element beyond the last index.]

Logic- 

This program here including has array (numbers[5]) element. The Demonstrates ArrayIndexOutOfBoundsException accessing an index by array’s valid range have (0 to 4),then accessing an index equal to or greater than the array length results in a runtime exception.

Code-

public class ArrayIndexOutOfBounds {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Loop exceeds array length
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }
    }
}


Output-

Element at index 0 : 0
Element at index 1 : 10
Element at index 2 : 20
Element at index 3 : 30
Element at index 4 : 40

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at Batch_ANP_D4848/JavaPrograms.ArrayIndexOutOfBoundsDemo.main(ArrayIndexOutOfBoundsDemo.java:16)

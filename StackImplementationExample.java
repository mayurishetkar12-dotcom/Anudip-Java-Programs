2. Write a Java program  to implement Stack.

Logic:
A Stack in Java is a class from the java.util package that follows the LIFO (Last In, First Out) principle and provides methods like push(), pop(), peek(), and empty() to manage elements.

/* Methods of Stack:

public boolean empty():It is used for returns true provided Stack is
empty.It returns false in case Stack is non-empty.

public void push (Object): It is used for inserting the elements into the Stack.

public Object pop():It is used for removing Top Most elements from the Stack.

public Object peek():It is used for retrieving the Top Most element from the Stack.

public int search(Object): It is used for searching an element in the Stack.

Public push():The method inserts an item onto the top of the stack */


Code- 
package JavaTask;

import java.util.Stack;

public class StackImplementationExample {
    public static void main(String[] args) {

        // Creating Stack object
        Stack<Integer> stack = new Stack<>();

        // Checking whether stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Pushing elements into stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying stack elements
        System.out.println("Stack elements: " + stack);

        // Peek operation
        System.out.println("Top element is: " + stack.peek());

        // Pop operation
        System.out.println("Removed element: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Checking stack again
        System.out.println("Is stack empty? " + stack.empty());
    }
}

Output:
Is stack empty? true
Stack elements: [10, 20, 30, 40]
Top element is: 40
Removed element: 40
Stack after pop: [10, 20, 30]
Is stack empty? false

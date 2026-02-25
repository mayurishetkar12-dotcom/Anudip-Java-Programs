2.Create program for Custom Exception.

Logic- 
This program uses a custom exception to handle invalid age input and ensures proper error handling using try-catch.

Code-

public class CustomException {

    // Method to check age
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(15);   // Change value to test
        } 
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}

Output:

Custom Exception: Age must be 18 or above

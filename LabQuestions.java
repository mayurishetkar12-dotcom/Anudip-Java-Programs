//Write program for Default Constructor.
/*Default Constructor- A constructor is called a "Default Constructor" when it doesn't have any parameter.*/

package OopsConcepts;

class ITIntern {
	//created a class
	ITIntern() {
	     System.out.println("Default Constructor is called");
	     }
}

public class DefaultConstructor {
	public static void main(String[] args) {
		
		// creates an object.
		ITIntern i1 = new ITIntern();
 }
}

/*
 *Logic: When an object of ITIntern is created, the default constructor is automatically executed, and it prints a message.
 
 *Output: Default Constructor is called 
*/




//Write program for Parameterized Constructor.

/*Parameterized Constructor: A constructor which has a specific number of parameters is called a parameterized
constructor.*/

package OopsConcepts;

class Intern {

    int duration;
    String name;

    Intern(int duration, String name) {
        this.duration = duration;   // Assigning parameter to instance variable
        this.name = name;
    }

    void display() {
        System.out.println("Duration: " + duration + " months");
        System.out.println("Name: " + name);
    }
}

public class ParameterizedConstructor {

    public static void main(String[] args) {

    	Intern i1 = new Intern(6,"Mayuri");

        i1.display();
    }
}

/*
 *Logic: "When the object is created, values are passed as arguments and assigned to instance variables using the this keyword."
 
 *Output: Duration: 6 months
          Name: Mayuri
*/
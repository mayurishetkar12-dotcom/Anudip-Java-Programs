/*Questions:
Create one superclass HillStations and three subclasses Manali, Mussoorie, Gulmarg. Subclasses extend the superclass and override its location() and famousFor() method. 
i.call the location() and famousFor() method by the Parent class’, i.e. Hillstations class.As it refers to the base class object and the base class method overrides the superclass method; the base class method is invoked at runtime. 
ii.call the location() and famousFor() method by the all subclass’,and print accordingly.

Logic:
This program demonstrates method overriding and runtime polymorphism by calling subclass methods using a parent class reference.*/


Code:
package JavaPrograms;

//Superclass
class HillStations {

 void location() {
     System.out.println("Location is: ");
 }

 void famousFor() {
     System.out.println("Famous for:");
 }
}


//Subclass Manali
class Manali extends HillStations {

 void location() {
     System.out.println("Manali is in Himachal Pradesh");
 }

 void famousFor() {
     System.out.println("It is famous for Hadiba Temple and Adventure Sports");
 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations {

 void location() {
     System.out.println("Mussoorie is in Uttarakhand");
 }

 void famousFor() {
     System.out.println("It is famous for education institutions");
 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations {

 void location() {
     System.out.println("Gulmarg is in J&K");
 }

 void famousFor() {
     System.out.println("It is famous for skiing");
 }
}

//Main class
public class HillStationTest {

 public static void main(String[] args) {

     // i. Calling methods using parent class reference
     HillStations h;

     h = new Manali();
     h.location();
     h.famousFor();

     h = new Mussoorie();
     h.location();
     h.famousFor();

     h = new Gulmarg();
     h.location();
     h.famousFor();

 }
}

/*Output:
anali is in Himachal Pradesh
It is famous for Hadiba Temple and Adventure Sports
Mussoorie is in Uttarakhand
It is famous for education institutions
Gulmarg is in J&K
It is famous for skiing*/

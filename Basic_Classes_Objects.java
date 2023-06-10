// Write a program to demonstrate the use of Classes and Object in java.

public class Basic_Classes_Objects
{
    int x = 5;                                                                                  // Initializing the 'x' variable outside main()
    public static void main(String[] args)
    {
        Basic_Classes_Objects myObj1 = new Basic_Classes_Objects();                             // Creating the first object
        Basic_Classes_Objects myObj2 = new Basic_Classes_Objects();                             // Creating the second object
        System.out.println("Accessing Variable Outside main() using First Object: "+myObj1.x);  // Printing the variable using first object
        System.out.print("\n");
        System.out.println("Accessing Variable Outside main() using Second Object: "+myObj2.x); // Printing the variable using first object
        System.out.println("\nIs myObj1 instance of Basic Classes Object:");
        System.out.println(myObj1 instanceof Basic_Classes_Objects);                            // Checks if myObj1 is an instance of Basic_Classes_Objects and prints the result
        System.out.println("\nIs myObj2 instance of Basic Classes Object:");
        System.out.println(myObj2 instanceof Basic_Classes_Objects);                            // Checks if myObj2 is an instance of Basic_Classes_Objects and prints the result
    }
}

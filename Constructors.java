// Write a program to demonstrate the use of default contructor.

public class Constructors
{
    int x;                                                                                  // Instance variable x
    public Constructors()
    {
        x = 5;                                                                              // Constructor to initialize the value of x to 5
    }
    public static void main(String[] args)
    {
        Constructors myConstructors = new Constructors();                                   // Creating an object of the Constructors class
        System.out.println("Value fetched from the Constructor: "+myConstructors.x);
    }
}

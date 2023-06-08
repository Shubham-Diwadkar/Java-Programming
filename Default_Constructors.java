// Write a program to demonstrate the use of default contructor.

public class Defualt_Constructors
{
    int x;                                                                                      // Instance variable x
    public Default_Constructors()
    {
        x = 5;                                                                                  // Constructor to initialize the value of x to 5
    }
    public static void main(String[] args)
    {
        Default_Constructors myDefault_Constructors = new Default_Constructors();               // Creating an object of the Constructors class
        System.out.println("Value fetched from the Constructor: "+myDefault_Constructors.x);
    }
}

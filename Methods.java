//Write a program to illustrate methods in java

public class Methods
{
    static void myMethod()
    {
        System.out.println("\nI am inside a Method Call!");                  // Prints "I am inside a Method Call!"
    }
    public static void main(String[] args)
    {
        System.out.println("I am outside a Method Call!");                   // Prints "I am outside a Method Call!"
        myMethod();                                                          // Calls the method myMethod()
        System.out.println("\nI am outside a Method Call again!");           // Prints "I am outside a Method Call again!"
        myMethod();                                                          // Calls the method myMethod()
        System.out.println("\nI am outside a Method Call again!");           // Prints "I am outside a Method Call again!"
        myMethod();                                                          // Calls the method myMethod()
        System.out.println("\nI am outside a Method Call again!");           // Prints "I am outside a Method Call again!"
    }
}

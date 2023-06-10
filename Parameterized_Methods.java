public class Parameterized_Methods
{
    static void myMethod(String fname)
    {
        System.out.println("My name is "+fname);            // Prints the names passed by the method
    }
    public static void main(String[] args)
    {
        myMethod("Liam");                                   // Calls myMethod() with argument "Liam"
        myMethod("Shubham");                                // Calls myMethod() with argument "Shubham"
        myMethod("Anja");                                   // Calls myMethod() with argument "Anja"
    }
}

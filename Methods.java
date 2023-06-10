public class Methods
{
    static void myMethod()
    {
        System.out.println("\nI am inside a Method Call!");
    }
    public static void main(String[] args)
    {
        System.out.println("I am outside a Method Call!");
        myMethod();
        System.out.println("\nI am outside a Method Call again!");
    }
}

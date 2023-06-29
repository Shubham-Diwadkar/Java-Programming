// Write a program to demonstrate Method Overloading in java

public class Method_Overloading
{
    static int plusMethod(int x, int y)                     // Method that takes two integers and returns their sum
    {
        return(x + y);
    }
    static double plusMethod(double x, double y)            // Method that takes two doubles and returns their sum
    {
        return(x + y);
    }
    public static void main(String[] args)
    {
        int myNum1 = plusMethod(8, 5);                      // Calling plusMethod with integers
        double myNum2 = plusMethod(4.3, 6.26);              // Calling plusMethod with doubles
        System.out.println("int: "+myNum1);                 // Printing the result of the integer addition
        System.out.println("double: "+myNum2);              // Printing the result of the double addition
    }
}

// Write a program to implement type casting in java

public class Type_Casting
{
    public static void main(String[] args)
    {
        int myInt1 = 9;
        double myDouble1 = myInt1;                              // Implicit type casting from int to double
        System.out.println("Integer Value: "+myInt1);
        System.out.println("Double Value: "+myDouble1);

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;                           // Explicit type casting from double to int
        System.out.println("Double Value: "+myDouble2);
        System.out.println("Integer Value: "+myInt2);
    }
}

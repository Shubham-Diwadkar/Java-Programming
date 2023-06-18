// Wtrite a program to demonstrate the use of custom wrapper classes in java

class CustomWrapper
{
    private int i;
    CustomWrapper()
    {
        // Default constructor
    }
    
    CustomWrapper(int i)
    {
        this.i = i;
    }
    
    public int getValue()
    {
        return i;
    }

    public void setValue(int i)
    {
        this.i = i;
    }

    public String toString()
    {
        return Integer.toString(i);
    }
}
public class Custom_Wrapper_Classes
{
    public static void main(String[] args)
    {
        CustomWrapper cw = new CustomWrapper(10);            // Create an instance of CustomWrapper with an initial value of 10
        System.out.println("Value is: "+cw);                 // Print the string representation of cw using System.out.println()
    }
}

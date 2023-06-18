// Wtrite a program to demonstrate the use of custom wrapper classes in java

class CustomWrapper
{
    private int i;
    CustomWrapper()
    {

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
        CustomWrapper cw = new CustomWrapper(10);
        System.out.println("Value is: "+cw);
    }
}

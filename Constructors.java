public class Constructors
{
    int x;
    public Constructors()
    {
        x = 5;
    }
    public static void main(String[] args)
    {
        Constructors myConstructors = new Constructors();
        System.out.println("Value fetched from the Constructor: "+myConstructors.x);
    }
}
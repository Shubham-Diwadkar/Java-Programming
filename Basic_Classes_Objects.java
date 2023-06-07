public class Basic_Classes_Objects
{
    int x = 5;
    public static void main(String[] args)
    {
        Basic_Classes_Objects myObj1 = new Basic_Classes_Objects();
        Basic_Classes_Objects myObj2 = new Basic_Classes_Objects();
        System.out.println("Accessing Variable Outside main() using First Object: "+myObj1.x);
        System.out.print("\n");
        System.out.println("Accessing Variable Outside main() using Second Object: "+myObj2.x);        
    }
}

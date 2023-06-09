public class Scopes
{
    public static void main(String[] args)
    {
        System.out.println("\nTrying to print before declaring and initializing the value of x: ");
        //System.out.println(x);                                                                                            // Try removing the comment on this line and try printing x you will get a error
        System.out.println("\nJava cannot print the value of x as it is not defined...");
        
        // Declaring and initializing the variable x
        int x = 10;
        System.out.println("\nint x = 10;");
        System.out.println("\nPrinting after declaring and initializing the value of x: ");
        System.out.println(x);

        System.out.println("\nTrying to print value of y outing the block:");
        //System.out.println(y);                                                                                            // Try removing the comment on this line and try printing y you will get a error
        System.out.println("\nAs the program can not access the variable outside a block it can not be printed...");
        {
            System.out.println("\n{");                                                                                      // Defining a block
            
            // Declaring and initializing the variable y
            int y = 100;
            System.out.println("\nint y = 100;");
            System.out.println("\nPrinting after declaring and initializing the value of y: ");
            System.out.println(y);
            System.out.println("\n}");
        }
    }
}

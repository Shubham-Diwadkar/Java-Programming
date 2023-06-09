public class Scopes
{
    public static void main(String[] args)
    {
        System.out.println("Trying to print before declaring and initializing the value of x: ");
        //System.out.println(x);
        System.out.println("\nJava cannot print the value of x as it is not defined...");
        
        int x = 10;
        
        System.out.println("\nPrinting after declaring and initializing the value of x: ");
        System.out.println(x);

        System.out.println("Trying to print value of y outing the block:");
        //System.out.println(y);
        System.out.println("As the program can not access the variable outside a block it can not be printed...");
        {
            int y = 100;
            System.out.println("\nPrinting after declaring and initializing the value of y: ");
            System.out.println(y);
        }
    }
}
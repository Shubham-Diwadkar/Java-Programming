//Write a program to demonstrate the use of finalize method in java

public class Finalize_Method
{
    public static void main(String[] args)
    {
        Finalize_Method objFinalize_Method = new Finalize_Method();     // Creates an object of the Finalize_Method class
        System.out.println(objFinalize_Method.hashCode());              // Prints the hash code of the object
        objFinalize_Method = null;                                      // Sets the reference variable to null, making the object eligible for garbage collection

        System.gc();                                                    // Explicitly requests the JVM to perform garbage collection
        System.out.println("End of Garbage Collector");                 // Prints a message after the garbage collection is completed
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalize Method Called...");                // Prints a message when the finalize method is called
    }
}

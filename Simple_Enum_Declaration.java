// Write a program to demonstrate the declaration of Enum inside the class in java

public class Simple_Enum_Declaration
{
    public enum Season {WINTER, SPRING, SUMMER, FALL}                                                // Define an enum called Season with four constants: WINTER, SPRING, SUMMER, FALL

    public static void main(String[] args)
    {
        System.out.println("Seasons: ");
        
        // Iterate over the constants of the Season enum using the values() method
        for(Season s: Season.values())
        {
            System.out.println("\n"+s);
        }

        // Accessing enum constants by their names and getting their ordinal values
        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());
    }
}

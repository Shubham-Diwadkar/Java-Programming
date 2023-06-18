public class Inside_Enum_Declaration
{
    public enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args)
    {
        System.out.println("Seasons: ");
        for(Season s: Season.values())
        {
            System.out.println("\n"+s);
        }

        System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));
        System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());
        System.out.println("Index of SUMMER is: "+Season.valueOf("SUMMER").ordinal());
    }
}

// Write a program to implement constants with enum in java

public class Enum_With_Constants
{
    enum Season
    {
        WINTER(5), SPRING(10), SUMMER(15), FALL(20);                // Define an enum called Season with four constants: WINTER, SPRING, SUMMER, FALL

        private int value;                                          // Define a private instance variable to hold the value associated with each constant
        private Season(int value)                                   // Define a private constructor to initialize the value for each constant
        {
            this.value = value;
        }
    }
    public static void main(String[] args)
    {
        // Iterate over the constants of the Season enum using the values() method
        for(Season s : Season.values())
        {
            System.out.println(s+" "+s.value);
        }
    }
}

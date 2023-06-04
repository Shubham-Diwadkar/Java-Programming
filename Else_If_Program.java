// Write a Else-If Program to check the time and wish the user accordingly.

public class Else_If_Program
{
    public static void main(String[] args)
    {
        int time = 22;                                  // Declaring and initializing the variable time with the value 22.
        if (time < 10)                                  // Checking if the value of time is less than 10.
        {
            System.out.println("Good morning.");        // Printing "Good morning" if the condition is true.
        }
        else if (time < 18)                             // Checking if the value of time is less than 18.
        {
            System.out.println("Good day.");            // Printing "Good day" if the condition is true.
        }
        else
        {
            System.out.println("Good evening.");        // Printing "Good evening" if all conditions are false.
        }
    }
}

//Write a if-else program to check the time and wish the user accordingly.

class If_Else_Program 
{
    public static void main(String[] args)
    {
        int time = 20;                              // Declaring and initializing the variable time with the value 20.

        if(time < 18)                               // Checking if the value of time is less than 18.
        {
            System.out.println("Good Day.");        // Printing "Good Day" if the condition is true.
        }
        else
        {
            System.out.println("Good Evening.");    // Printing "Good Evening" if the condition is false.
        }
    }
}

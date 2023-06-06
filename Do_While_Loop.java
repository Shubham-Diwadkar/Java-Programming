// Write a program to illustrate do-while loop in java

public class Do_While_Loop
{
    public static void main(String[] args) 
    {
        int i = 0;                                      // Declare and initialize the variable i with the value 0.
        do
        {
            System.out.println("Value of i: "+i);       // Print the value of i.
            i++;                                        // Increment the value of i by 1.
        } while(i < 5);                                 // Continue the loop as long as i is less than 5.
    }    
}
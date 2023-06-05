// Write a program to illustrate nested-for loops in java.

public class Nested_For_Loop
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=0; i<=2; i++)
        {
            System.out.println("Outer for loop: " + i);
            for(j=1; j<=3; j++)
            {
                System.out.println("Inner for loop: " + j);
            }
        }
    }
}

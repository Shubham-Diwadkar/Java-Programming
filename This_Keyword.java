// Write a program to demonstrate the use of this keyword in java

public class This_Keyword
{
    private int x;
    public This_Keyword(int x)
    {
        this.x = x;                                                 // Assigns the value of the parameter x to the instance variable x using the "this" keyword
    }
    public static void main(String[] args)
    {
        This_Keyword myObjThisKeyword = new This_Keyword(5);        // Creates an instance of the This_Keyword class with x = 5
        System.out.println("Value of x = " + myObjThisKeyword.x);   // Prints the value of the instance variable x
    }
}

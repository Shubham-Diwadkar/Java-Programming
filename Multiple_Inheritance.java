// Write a program to implement the Multiple Inheritance in java using interfaces

interface Wishes
{
    void message();            // Interface defining a message method
}

interface Birthday
{
    void message();            // Interface defining a message method
}

class Greetings implements Wishes, Birthday
{
    public void message()
    {
        System.out.println("\nBest of Luck!!!");            // Implementation of the message method from Wishes interface

        System.out.println("\nHappy Birthday!!!");            // Implementation of the message method from Birthday interface
    }
}

public class Multiple_Inheritance
{
    public static void main(String[] args)
    {
        Greetings greetingsObj = new Greetings();            // Create an instance of the Greetings class

        greetingsObj.message();            // Call the message method, which outputs the desired messages
    }
}

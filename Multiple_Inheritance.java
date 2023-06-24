interface Wishes
{
    void message();
}

interface Birthday
{
    void message();
}

class Greetings implements Wishes, Birthday
{
    public void message()
    {
        System.out.println("\nBest of Luck!!!");

        System.out.println("\nHappy Birthday!!!");
    }
}

public class Multiple_Inheritance
{
    public static void main(String[] args)
    {
        Greetings greetingsObj = new Greetings();

        greetingsObj.message();
    }
}
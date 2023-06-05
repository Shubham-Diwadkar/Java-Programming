// Write a program to illustrate for-each loop in java.

public class For_Each_Loop
{
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};          // Declare and initialize a String array.
        for (String i : cars)
        {
            System.out.println("Car Name:"+i);                      // Print each element in the array.
        }
    }
}

// Write a program to demonstrate Single Dimensional Arrays in java

public class Single_Dimensional_Arrays
{
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println("Cars in Array: ");
        System.out.println(cars[0]);                                // Print the first element of the cars array
        System.out.println(cars[1]);                                // Print the second element of the cars array
        System.out.println(cars[2]);                                // Print the third element of the cars array
        System.out.println(cars[3]);                                // Print the fourth element of the cars array
        System.out.print("\n");
        
        cars[0] = "Opel";                                           // Change the value of the first element
        System.out.println("AFTER CHANGING THE ELEMENT:-");
        System.out.print("\n");
        System.out.println("Cars in Array: ");
        System.out.println(cars[0]);                                // Print the first element of the cars array after the change
        System.out.println(cars[1]);                                // Print the second element of the cars array after the change
        System.out.println(cars[2]);                                // Print the third element of the cars array after the change
        System.out.println(cars[3]);                                // Print the fourth element of the cars array after the change
        System.out.print("\n");

        System.out.println("Length of the Array: "+cars.length);    // Print the length of the cars array
        System.out.print("\n");

        String[] fruits = {"Mango", "Banana", "Apple", "Grapes"};
        System.out.println("Fruits in Array: ");
        for (int i = 0; i < fruits.length; i++)
        {
            System.out.println(fruits[i]);                            // Print each element of the fruits array using an index-based approach
        }
        System.out.print("\n");

        int[] numbers = {10, 20, 30, 40};
        System.out.println("Numbers in Array: ");
        for (int j : numbers)
        {
            System.out.println(j);                                    // Print each element of the numbers array using a for-each loop
        }
    }
}

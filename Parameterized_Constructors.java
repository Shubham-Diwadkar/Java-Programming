// Write a program to demonstrate Parameterized Constructor in java.

public class Parameterized_Constructors
{
    int modelYear;                                                                                              // Instance variable to store the model year
    String modelName;                                                                                           // Instance variable to store the model name

    public Parameterized_Constructors(int year, String name)
    {
        modelYear = year;                                                                                       // Initialize the model year with the provided parameter value
        modelName = name;                                                                                       // Initialize the model name with the provided parameter value
    }

    public static void main(String[] args)
    {
        Parameterized_Constructors myCar = new Parameterized_Constructors(1969, "Mustang");                     // Create an object using the parameterized constructor
        System.out.println("Car Year: " + myCar.modelYear + "\n \n Car Name: " + myCar.modelName);              // Print the values of modelYear and modelName
    }
}

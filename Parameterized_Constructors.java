public class Parameterized_Constructors
{
    int modelYear;
    String modelName;

    public Parameterized_Constructors(int year, String name)
    {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args)
    {
        Parameterized_Constructors myCar = new Parameterized_Constructors(1969, "Mustang");
        System.out.println("Car Year: " + myCar.modelYear + "\n \n Car Name: " + myCar.modelName);
    }
}
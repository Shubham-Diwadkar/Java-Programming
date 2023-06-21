//Write a program to demonstrate the Hierarchical Inheritance in java

class Student1
{
    public void methodStudent1()// Method of the Student1 class
    {
        System.out.println("\nThe method of the class Student invoked.");
    }
}

class Science extends Student1
{
    public void methodScience()// Method specific to the Science class
    {
        System.out.println("\nThe method of the class Science invoked.");
    }
}

class Commerce extends Student1
{
    public void methodCommerce()// Method specific to the Commerce class
    {
        System.out.println("\nThe method of the class Commerce invoked.");
    }
}

class Arts extends Student1
{
    public void methodArts()// Method specific to the Arts class
    {
        System.out.println("\nThe method of the class Arts invoked.");
    }
}

public class Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        Science sci = new Science();// Create an object of the Science class
        Commerce comm = new Commerce();// Create an object of the Commerce class
        Arts art = new Arts();// Create an object of the Arts class

        sci.methodStudent1();// Invoke the method from the Student1 class using the Science object
        comm.methodStudent1();// Invoke the method from the Student1 class using the Commerce object
        art.methodStudent1();// Invoke the method from the Student1 class using the Arts object
    }
}

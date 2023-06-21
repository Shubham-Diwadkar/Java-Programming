class Student1
{
    public void methodStudent1()
    {
        System.out.println("\nThe method of the class Student invoked.");
    }
}

class Science extends Student1
{
    public void methodScience()
    {
        System.out.println("\nThe method of the class Science invoked.");
    }
}

class Commerce extends Student1
{
    public void methodCommerce()
    {
        System.out.println("\nThe method of the class Commerce invoked.");
    }
}

class Arts extends Student1
{
    public void methodArts()
    {
        System.out.println("\nThe method of the class Arts invoked.");
    }
}

public class Hierarchical_Inheritance
{
    public static void main(String[] args)
    {
        Science sci = new Science();
        Commerce comm = new Commerce();
        Arts art = new Arts();

        sci.methodStudent1();
        comm.methodStudent1();
        art.methodStudent1();
    }
}
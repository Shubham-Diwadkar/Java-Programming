class GrandFather
{
    public void show()
    {
        System.out.println("\nI am Grand Father");
    }
}

class Father extends GrandFather
{
    public void show()
    {
        System.out.println("\nI am Father");
    }
}

class Son extends Father
{
    public void show()
    {
        System.out.println("\nI am Son");
    }
}

class Hybrid_Inheritance extends Father
{
    public void show()
    {
        System.out.println("\nI am a Daughter");
    }

    public static void main(String[] args)
    {
        Hybrid_Inheritance daughterObj = new Hybrid_Inheritance();
                
        daughterObj.show();
    }
}
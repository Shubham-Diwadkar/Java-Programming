public class Type_Casting
{
    public static void main(String[] args)
    {
        int myInt1 = 9;
        double myDouble1 = myInt1;
        System.out.println("Integer Value: "+myInt1);
        System.out.println("Double Value: "+myDouble1);

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;
        System.out.println("Double Value: "+myDouble2);
        System.out.println("Integer Value: "+myInt2);
    }
}
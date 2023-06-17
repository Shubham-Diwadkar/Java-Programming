public class Wrapper_Classes
{
    public static void main(String[] args) 
    {
        int a = 20;

        System.out.println("Autoboxing of int to Integer:");
        System.out.println("\na = 20");
        Integer i = Integer.valueOf(a);
        Integer j = a;

        System.out.println("\nVariable with type int: "+a);
        System.out.println("\nVariable with type Integer(Wrapper Class): "+i);
        System.out.println("\nVariable with type Integer(Wrapper Class) assigned by '=': "+j);
    }
}
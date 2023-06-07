public class Mathematical_Functions
{
    public static void main(String[] args)
    {
        int a = 5, b = 10, c = 64, randomNum;
        double d = -12.45, x = 2.0;
        
        System.out.println("Minimum Number between 5 and 10:");
        System.out.println(Math.min(a, b));
        System.out.print("\n");

        System.out.println("Maximum Number between 5 and 10:");
        System.out.println(Math.max(a, b));
        System.out.print("\n");

        System.out.println("Square Root of 64: ");
        System.out.println(Math.sqrt(c));
        System.out.print("\n");

        System.out.println("Absolute value of -12.45: ");
        System.out.println(Math.abs(d));
        System.out.print("\n");

        System.out.println("Absolute value of 5: ");
        System.out.println(Math.abs(a));
        System.out.print("\n");

        System.out.println("Getting a Random Number between 1 and 100: ");
        randomNum =(int)(Math.random()*101);
        System.out.println(randomNum);
        System.out.print("\n");
        
        System.out.println("Exponential of 2.0: ");
        System.out.println(Math.exp(x));
        System.out.print("\n");

        System.out.println("Rounding up the Number -12.45:-");
        System.out.print("\n");
        System.out.println("Using round(): "+Math.round(d));
        System.out.print("\n");
        System.out.println("Using ceil(): "+Math.ceil(d));
        System.out.print("\n");
        System.out.println("Using floor(): "+Math.floor(d));
        System.out.print("\n");
        System.out.println("Using rint(): "+Math.rint(d));
    }
}
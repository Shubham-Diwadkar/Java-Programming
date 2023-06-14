public class Finalize_Method
{
    public static void main(String[] args)
    {
        Finalize_Method objFinalize_Method = new Finalize_Method();
        System.out.println(objFinalize_Method.hashCode());
        objFinalize_Method = null;

        System.gc();
        System.out.println("End of Garbage Collector");
    }

    @Override
    protected void finalize()
    {
        System.out.println("Finalize Method Called...");
    }
}
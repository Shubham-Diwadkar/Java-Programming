public class Garbage_Collector
{
    public void finalize()
    {
        System.out.println("Garbage Collection performed by JVM");
    }
    public static void main(String[] args)
    {
        Garbage_Collector s1 = new Garbage_Collector();
        Garbage_Collector s2 = new Garbage_Collector();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
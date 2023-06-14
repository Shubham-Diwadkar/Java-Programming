public class String_Buffer_Classes
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = new StringBuffer("I am Diwadkar");
        StringBuffer sb2 = new StringBuffer("Hey there");
        StringBuffer sb3 = new StringBuffer();
        StringBuffer sb4 = new StringBuffer();

    sb.append(" Shubham");
    System.out.println("Appending ' Shubham' in the String Buffer 'Hello': ");
    System.out.println(sb);

    sb1.insert(4," Shubham");
    System.out.println("\nInserting ' Shubham' in String Buffer 'I am Diwadkar': ");
    System.out.println(sb1);

    sb2.replace(1, 3, " Shubham");
    System.out.println("\nInserting ' Shubham' in String Buffer 'Hey there': ");
    System.out.println(sb2);

    sb.delete(1, 3);
    System.out.println("\nDeleting 'el' from String Buffer 'Hello': ");
    System.out.println(sb);

    sb1.reverse();
    System.out.println("\nReversing the String Buffer 'I am Shubham Diwadkar': ");
    System.out.println(sb1);

    System.out.println("\nChecking the Default Capacity of String Buffer: ");
    System.out.println(sb3.capacity());
    System.out.println("\nChecking the Capacity of String Buffer after appending 'Hello' String: ");
    sb3.append("Hello");
    System.out.println(sb3.capacity());
    System.out.println("\nChecking the Default Capacity of String Buffer after appending 'Java is my favourite language' String: ");
    sb3.append("Java is my favourite language");
    System.out.println(sb3.capacity());

    System.out.println("\nChecking the Default Capacity of String Buffer: ");
    System.out.println(sb4.capacity());
    System.out.println("\nChecking the Capacity of String Buffer after appending 'Hello' String: ");
    sb3.append("Hello");
    System.out.println(sb4.capacity());
    System.out.println("\nChecking the Default Capacity of String Buffer after appending 'Java is my favourite language' String: ");
    sb4.append("Java is my favourite language");
    System.out.println(sb4.capacity());
    System.out.println("\nEnsuring Minimum Capacity to 10: ");
    sb4.ensureCapacity(10);
    System.out.println(sb4.capacity());
    System.out.println("\nEnsuting Minimum Capacity to 50: ");
    sb4.ensureCapacity(50);
    System.out.println(sb4.capacity());
    }
}
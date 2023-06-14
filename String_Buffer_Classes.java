// Write a program to demonstrate the use of String Buffer classes in java

public class String_Buffer_Classes
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");                                                                                        // Creates a StringBuffer object with initial value "Hello"
        StringBuffer sb1 = new StringBuffer("I am Diwadkar");                                                                               // Creates a StringBuffer object with initial value "I am Diwadkar"
        StringBuffer sb2 = new StringBuffer("Hey there");                                                                                   // Creates a StringBuffer object with initial value "Hey there"
        StringBuffer sb3 = new StringBuffer();                                                                                              // Creates an empty StringBuffer object
        StringBuffer sb4 = new StringBuffer();                                                                                              // Creates an empty StringBuffer object

    sb.append(" Shubham");                                                                                                                  // Appends " Shubham" to the StringBuffer object 'sb'
    System.out.println("Appending ' Shubham' in the String Buffer 'Hello': ");
    System.out.println(sb);                                                                                                                 // Prints the content of the StringBuffer object 'sb'

    sb1.insert(4," Shubham");                                                                                                               // Inserts " Shubham" at index 4 in the StringBuffer object 'sb1'
    System.out.println("\nInserting ' Shubham' in String Buffer 'I am Diwadkar': ");
    System.out.println(sb1);                                                                                                                // Prints the content of the StringBuffer object 'sb1'

    sb2.replace(1, 3, " Shubham");                                                                                                          // Replaces characters from index 1 to 2 with " Shubham" in the StringBuffer object 'sb2'
    System.out.println("\nInserting ' Shubham' in String Buffer 'Hey there': ");
    System.out.println(sb2);                                                                                                                // Prints the content of the StringBuffer object 'sb2'

    sb.delete(1, 3);                                                                                                                        // Deletes characters from index 1 to 2 from the StringBuffer object 'sb'
    System.out.println("\nDeleting 'el' from String Buffer 'Hello': ");
    System.out.println(sb);                                                                                                                 // Prints the content of the StringBuffer object 'sb'

    sb1.reverse();                                                                                                                          // Reverses the content of the StringBuffer object 'sb1'
    System.out.println("\nReversing the String Buffer 'I am Shubham Diwadkar': ");
    System.out.println(sb1);                                                                                                                // Prints the content of the StringBuffer object 'sb1'

    System.out.println("\nChecking the Default Capacity of String Buffer: ");
    System.out.println(sb3.capacity());                                                                                                     // Prints the default capacity of the StringBuffer object 'sb3'
    System.out.println("\nChecking the Capacity of String Buffer after appending 'Hello' String: ");
    sb3.append("Hello");                                                                                                                    // Appends "Hello" to the StringBuffer object 'sb3'
    System.out.println(sb3.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb3'
    System.out.println("\nChecking the Default Capacity of String Buffer after appending 'Java is my favourite language' String: ");
    sb3.append("Java is my favourite language");                                                                                            // Appends "Java is my favourite language" to the StringBuffer object 'sb3'
    System.out.println(sb3.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb3'

    System.out.println("\nChecking the Default Capacity of String Buffer: ");
    System.out.println(sb4.capacity());                                                                                                     // Prints the default capacity of the StringBuffer object 'sb4'
    System.out.println("\nChecking the Capacity of String Buffer after appending 'Hello' String: ");
    sb3.append("Hello");                                                                                                                    // Appends "Hello" to the StringBuffer object 'sb4'
    System.out.println(sb4.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb4'
    System.out.println("\nChecking the Default Capacity of String Buffer after appending 'Java is my favourite language' String: ");
    sb4.append("Java is my favourite language");                                                                                            // Appends "Java is my favourite language" to the StringBuffer object 'sb4'
    System.out.println(sb4.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb4'
    System.out.println("\nEnsuring Minimum Capacity to 10: ");
    sb4.ensureCapacity(10);                                                                                                                 // Ensures that the StringBuffer object 'sb4' has a minimum capacity of 10
    System.out.println(sb4.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb4'
    System.out.println("\nEnsuting Minimum Capacity to 50: ");
    sb4.ensureCapacity(50);                                                                                                                 // Ensures that the StringBuffer object 'sb4' has a minimum capacity of 50
    System.out.println(sb4.capacity());                                                                                                     // Prints the capacity of the StringBuffer object 'sb4'
    }
}

public class Strings
{
    public static void main(String[] args)
    {
        String greeting = "Hello";
        String firstName = "Shubham";
        String lastName = "Diwadkar";
        int x = 10;
        int y = 20;
        int z;
        String x1 = "10";
        String y1 = "20";
        String z1, z2, txt, txt1, txt2;

        System.out.println(greeting);

        System.out.println("The length of the String: "+greeting.length());

        System.out.println("\nString in Upper Case: "+greeting.toUpperCase());
        System.out.println("\nString in Lower Case: "+greeting.toLowerCase());

        System.out.println("\nPlease locate where 'l' occurs: "+greeting.indexOf("l"));

        System.out.println("\nConcatenating the Strings:");
        System.out.println(firstName+" "+lastName);

        System.out.println("\nConcatenating the Strings using concat():");
        System.out.println(firstName.concat(lastName));

        System.out.println("\nDIFFERENCE BETWEEN NUMBERS AND STRINGS:");
        System.out.println("\nx=10 and y=20 using these as Integer type:");
        z= x + y;
        System.out.println(z);

        System.out.println("\nx1='10' and y1='20' using these as String type:");
        z1 = x1 + y1;
        System.out.println(z1);

        System.out.println("\nTrying to Concatenate String type and Integer type:");
        System.out.println("x1='10'(String type) and y=20(Integer type):");
        z2 = x1 + y;
        System.out.println(z2);

        System.out.println("\nUSING SPECIAL CHARACTERS:");
        
        System.out.println("\nUsing a '\\' Backslash and a '\"' Double Quote:");
        txt = "My name is \"Shubham Diwdkar\" and I am studying Java Programming.";
        System.out.println(txt);
        
        System.out.println("\nUsing a '\\' Backslash and a '\'' Single Quote:");
        txt1 = "It\'s Alright.";
        System.out.println(txt1);
        
        System.out.println("\nUsing a '\\' Backslash:");
        txt2 = "This is a Special Character \\ named as Backslash.";
        System.out.println(txt2);

        System.out.println("\nThis statement is printed on the next to next line using '\\' Backslash and variable 'n'.");
        
        System.out.println("\n\tThis statement is printed after a tab using '\\' Backslash and variable 't'.");
        
        System.out.println("\nThe following statement is printed by cutting the string into two different halves and getting rid of the first part using '\\' Backslash and variable 'r'.");
        System.out.println("This statement is printed by cutting the string into tw\ro different halves using '\\' Backslash and variable 'r'.");
        
        System.out.println("\nThe following statement prints by backspacing a letter in the String '\\' Backslash and variable 'b'.");
        System.out.println("Hel\blo World");
        
        System.out.println("\nThe following statement is printed by cutting the string into two different halves printing as two new print statements using '\\' Backslash and variable 'f'.");
        System.out.println("\nThis statement is printed on the\fnext to next line using '\\' Backslash and variable 'f'.");
    }
}
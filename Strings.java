//Write a program to illustrate the use of Strings in Java

public class Strings
{
    public static void main(String[] args)
    {
        // String variables
        String greeting = "Hello", firstName = "Shubham", lastName = "Diwadkar", x1 = "10", y1 = "20", z1, z2, txt, txt1, txt2;
        
        // Integer variables
        int x = 10, y = 20, z;

        System.out.println(greeting);// Printing the greeting

        System.out.println("The length of the String: "+greeting.length());// Length of the string

        System.out.println("\nString in Upper Case: "+greeting.toUpperCase());// Converting string to upper case
        System.out.println("\nString in Lower Case: "+greeting.toLowerCase());// Converting string to lower case

        System.out.println("\nPlease locate where 'l' occurs: "+greeting.indexOf("l"));// Finding the index of a character in the string

        // Concatenating strings
        System.out.println("\nConcatenating the Strings:");
        System.out.println(firstName+" "+lastName);

        // Concatenating strings using the concat() method
        System.out.println("\nConcatenating the Strings using concat():");
        System.out.println(firstName.concat(lastName));

        // Demonstrating the difference between numbers and strings
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

        // Using special characters in strings
        System.out.println("\nUSING SPECIAL CHARACTERS:");
        
        // Using backslash and double quote
        System.out.println("\nUsing a '\\' Backslash and a '\"' Double Quote:");
        txt = "My name is \"Shubham Diwdkar\" and I am studying Java Programming.";
        System.out.println(txt);
        
        // Using backslash and single quote
        System.out.println("\nUsing a '\\' Backslash and a '\'' Single Quote:");
        txt1 = "It\'s Alright.";
        System.out.println(txt1);
        
        // Using backslash
        System.out.println("\nUsing a '\\' Backslash:");
        txt2 = "This is a Special Character \\ named as Backslash.";
        System.out.println(txt2);

        // Using special escape sequences
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

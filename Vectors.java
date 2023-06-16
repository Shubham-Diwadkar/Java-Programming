//Write a program to demonstrate use of various Vector methods in java

import java.util.*;

public class Vectors
{
    public static void main(String[] args)
    {
        Vector<String> vec = new Vector<String>();                // Create a vector to store strings
        Vector<String> vec1 = new Vector<String>(4);              // Create a vector with an initial capacity of 4
        Vector<Integer> in = new Vector<Integer>();               // Create a vector to store integers
        
        // Adding elements before assigning the space 
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        
        System.out.println("Elements are: "+vec);            // Printing the vector 'vec'

        // Adding elements after assigning the space
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("\nVector Elements are: "+vec);            //Pring the vector 'vec' after adding new values

        // Adding elements before assigning the space
        vec1.add("Computer");
        vec1.add("Mouse");
        vec1.add("Keybord");
        vec1.add("CPU");

        System.out.println("\nSize is: "+vec1.size());                      // Printing the size of the vector 'vec1'
        System.out.println("Default capacity is: "+vec1.capacity());        // Printing the capacity of the vector 'vec1'
        System.out.println("Vector Elements are: "+vec1);                   // Printing the vector 'vec1'

        // Adding elements after assigning the space
        vec1.addElement("SSD");
        vec1.addElement("HDD");
        vec1.addElement("Power Supply");

        System.out.println("\nAfter adding more elements size is: "+vec1.size());            // Printing the size of the vector 'vec1' after adding new elements
        System.out.println("Capacity after adding more elements: "+vec1.capacity());         // Printing the capacity of the vector 'vec1' after adding the new elements
        System.out.println("Elements are: "+vec1);                                           // Printing the vector 'vec1' after adding new elements
        if(vec1.contains("SSD"))                                                             // Checking if vector 'vec1' contains element named 'SSD'
        {
            System.out.println("SSD is present at index: "+vec1.indexOf("SSD"));             // Printing the index of element where 'SSD' is located
        }
        else
        {
            System.out.println("SSD is not present in the list");                            // Printing the element 'SSD' is not present
        }
        System.out.println("\nThe first Element of the Vector is: "+vec1.firstElement());            // Printing the first element of vector 'vec1'
        System.out.println("\nThe last Element of the Vector is: "+vec1.lastElement());              // Printing the last element of vector 'vec1'

        // Adding elements before assigning the space
        in.add(100);
        in.add(200);
        in.add(300);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        
        System.out.println("\nValues in Vector: "+in);            // Printing the vector 'in'

        System.out.println("\nRemove first occurence of element 200: "+in.remove((Integer)200));            // Removing the first occurence of element '200' in vector 'in'

        System.out.println("\nValues in Vector: "+in);            // Printing the vector 'in'

        System.out.println("\nRemove element at index 5: "+in.remove(5));            // Removing the element at index 5 in vector 'in'
        System.out.println("New Values in Vector: "+in);                             // Printing the vector 'in'

        in.removeElementAt(4);                                                // Removing the 4th element in vector 'in'
        System.out.println("\nVector elements after removal: "+in);           // Printing the vector 'in'

        System.out.println("\nHash code of this vector: "+in.hashCode());            // Printing the hash code of the vector 'in'

        System.out.println("\nElement at index 1 is: "+in.get(1));            // Printing the element at index '1'
    }
}

//Write a program to demonstrate use of various Vector methods in java

import java.util.*;

public class Vectors
{
    public static void main(String[] args)
    {
        Vector<String> vec = new Vector<String>();
        Vector<String> vec1 = new Vector<String>(4);
        Vector<Integer> in = new Vector<Integer>();
        
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        
        System.out.println("Elements are: "+vec);

        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("\nVector Elements are: "+vec);

        vec1.add("Computer");
        vec1.add("Mouse");
        vec1.add("Keybord");
        vec1.add("CPU");

        System.out.println("\nSize is: "+vec1.size());
        System.out.println("Default capacity is: "+vec1.capacity());
        System.out.println("Vector Elements are: "+vec1);

        vec1.addElement("SSD");
        vec1.addElement("HDD");
        vec1.addElement("Power Supply");

        System.out.println("\nAfter adding more elements size is: "+vec1.size());
        System.out.println("Capacity after adding more elements: "+vec1.capacity());
        System.out.println("Elements are: "+vec1);
        if(vec1.contains("SSD"))
        {
            System.out.println("SSD is present at index: "+vec1.indexOf("SSD"));
        }
        else
        {
            System.out.println("SSD is not present in the list");
        }
        System.out.println("\nThe first Element of the Vector is: "+vec1.firstElement());
        System.out.println("\nThe last Element of the Vector is: "+vec1.lastElement());

        in.add(100);
        in.add(200);
        in.add(300);
        in.add(400);
        in.add(500);
        in.add(600);
        in.add(700);
        
        System.out.println("\nValues in Vector: "+in);

        System.out.println("\nRemove first occurence of element 200: "+in.remove((Integer)200));

        System.out.println("\nValues in Vector: "+in);

        System.out.println("\nRemove element at index 5: "+in.remove(5));
        System.out.println("New Values in Vector: "+in);

        in.removeElementAt(4);
        System.out.println("\nVector elements after removal: "+in);

        System.out.println("\nHash code of this vector: "+in.hashCode());

        System.out.println("\nElement at index 1 is: "+in.get(1));
    }
}

// Write a program to demonstrate the use of Wrapper Classes in java

public class Wrapper_Classes
{
    public static void main(String[] args) 
    {
        // Initializing variables
        int a = 10;
        Integer b = new Integer(3);
        byte c = 20;
        short d = 30;
        int e = 40;
        long f = 50;
        float g = 60.0F;
        double h = 70.0D;
        char m = 'S';
        boolean n = true;

        System.out.println("Primitive to Wrapper:");
        System.out.println("\na = 20");

        // Primitive to Wrapper: int to Integer
        Integer i = Integer.valueOf(a);                // Convert int to Integer using valueOf()
        Integer j = a;                                 // Autoboxing: int to Integer directly

        System.out.println("\nVariable with type int: "+a);
        System.out.println("Variable with type Integer(Wrapper Class): "+i);
        System.out.println("Variable with type Integer(Wrapper Class) assigned by \'=\': "+j);

        System.out.println("\nWrapper to Primitive:");
        System.out.println("\nb = 3");
        
        // Wrapper to Primitive: Integer to int
        int k = b.intValue();                        // Convert Integer to int using intValue()
        int l = b;                                   // Unboxing: Integer to int directly

        System.out.println("\nVariable with type Integer(Wrapper Class): "+b);
        System.out.println("\nVariable with type int: "+k);
        System.out.println("\nVariable with type int assigned by \'=\': "+l);

        System.out.println("\nConverting Primitives into Objects...");
        Byte byteObj = c;                                                // Autoboxing: byte to Byte
        Short shortObj = d;                                              // Autoboxing: short to Short
        Integer intObj = e;                                              // Autoboxing: int to Integer
        Long longObj = f;                                                // Autoboxing: long to Long
        Float floatObj = g;                                              // Autoboxing: float to Float
        Double doubleObj = h;                                            // Autoboxing: double to Double
        Character charObj = m;                                           // Autoboxing: char to Character
        Boolean booleanObj = n;                                          // Autoboxing: boolean to Boolean
        
        System.out.println("\nPrinting the Object\'s values:");
        System.out.println("Byte Object: "+byteObj);
        System.out.println("Short Object: "+shortObj);
        System.out.println("Integer Object: "+intObj);
        System.out.println("Long Object: "+longObj);
        System.out.println("Float Object: "+floatObj);
        System.out.println("Double Object: "+doubleObj);
        System.out.println("Character Object: "+charObj);
        System.out.println("Boolean Object: "+booleanObj);

        System.out.println("\nConverting Objects into Primitives...");
        byte bytevalue = byteObj;                                        // Unboxing: Byte to byte
        short shortvalue=shortObj;                                       // Unboxing: Short to short
        int intvalue=intObj;                                             // Unboxing: Integer to int
        long longvalue=longObj;                                          // Unboxing: Long to long
        Float floatvalue=floatObj;                                       // Unboxing: Float to float
        double doublevalue=doubleObj;                                    // Unboxing: Double to double
        char charvalue=charObj;                                          // Unboxing: Character to char
        boolean booleanvalue=booleanObj;                                 // Unboxing: Boolean to boolean

        System.out.println("\nPrinting the Primitive\'s value:");
        System.out.println("byte Value: "+bytevalue);
        System.out.println("short Value: "+shortvalue);
        System.out.println("int Value: "+intvalue);
        System.out.println("long Value: "+longvalue);
        System.out.println("float Value: "+floatvalue);
        System.out.println("double Value: "+doublevalue);
        System.out.println("char Value: "+charvalue);
        System.out.println("boolean Value: "+booleanvalue);
    }
}

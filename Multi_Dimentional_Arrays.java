public class Multi_Dimentional_Arrays
{
    public static void main(String[] args)
    {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i)
        {
            for(int j = 0; j < myNumbers[i].length; ++j)
            {
              System.out.println(myNumbers[i][j]);
            }
        }
        System.out.print("\n");

        System.out.println("Accessing 3rd element of 2 array: "+myNumbers[1][2]);
        System.out.print("\n");
        
        System.out.println("CHANGING THE ACCESSED ELEMENT");
        myNumbers[1][2] = 9;
        
        System.out.println("AFTER CHANGING THE ACCESSED ELEMENT");
        System.out.print("\n");
        
        for (int i = 0; i < myNumbers.length; ++i) 
        {
            for(int j = 0; j < myNumbers[i].length; ++j)
            {
              System.out.println(myNumbers[i][j]);
            }
        }
        System.out.print("\n");

        String[][] myColors = { {"Red", "Yellow", "Green", "Blue"}, {"Purple", "Black", "White"} };
        for (int i = 0; i < myColors.length; ++i)
        {
            for(int j = 0; j < myColors[i].length; ++j)
            {
                System.out.println(myColors[i][j]);
            }
        }
    }
}
public class This_Keyword
{
    private int x;
    public This_Keyword(int x)
    {
        this.x = x;
    }
    public static void main(String[] args)
    {
        This_Keyword myObjThisKeyword = new This_Keyword(5);
        System.out.println("Value of x = " + myObjThisKeyword.x);
    }
}
class Employee
{
    float salary = 34534*12;
}
public class Simple_Inheritance extends Employee
{
    float bonus = 3000*6;
    public static void main(String[] args)
    {
        Simple_Inheritance simple_InheritanceObj = new Simple_Inheritance();
        System.out.println("Total Salary credited: "+simple_InheritanceObj.salary);
        System.out.println("Bonus of six months: "+simple_InheritanceObj.bonus);
    }
}

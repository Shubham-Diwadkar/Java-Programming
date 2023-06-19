// Write a program to demonstrate Simple Inheritance in java

class Employee
{
    float salary = 34534*12;                           // Salary calculated as a product of monthly salary and 12 months
}
class Simple_Inheritance extends Employee
{
    float bonus = 3000*6;                              // Bonus calculated as a product of monthly bonus and 6 months
    public static void main(String[] args)
    {
        Simple_Inheritance simple_InheritanceObj = new Simple_Inheritance();
        System.out.println("Total Salary credited: "+simple_InheritanceObj.salary);
        System.out.println("Bonus of six months: "+simple_InheritanceObj.bonus);
    }
}

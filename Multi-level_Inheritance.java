// Write a program to demonstrate multiple inheritance in java

class Student
{
    int reg_no;            // Variable to store registration number
    
    void getNo(int no)            // Method to set the registration number
    {
        reg_no = no;
    }
    
    void putNo()            // Method to display the registration number
    {
        System.out.println("Registration number = "+reg_no);
    }
}

class Marks extends Student
{
    float marks;            // Variable to store marks
    
    void getMarks(float m)            // Method to set the marks
    {
        marks = m;
    }
    
    void putMarks()            // Method to display the marks
    {
        System.out.println("Marks = "+marks);
    }
}

class Sports extends Marks
{
    double score;            // Variable to store score
    
    void getScore(double scr)            // Method to set the score
    {
        score = scr;
    }
    
    void putScore()            // Method to display the score
    {
        System.out.println("Score = "+score);
    }
}

public class Multiple_Inheritance
{
    public static void main(String[] args)
    {
        Sports sportsObj = new Sports();            // Create an object of the Sports class
        
        sportsObj.getNo(987);            // Set the registration number using the method from the Student class
        sportsObj.putNo();            // Display the registration number using the method from the Student class
        
        sportsObj.getMarks(78);            // Set the marks using the method from the Marks class
        sportsObj.putMarks();            // Display the marks using the method from the Marks class
        
        sportsObj.getScore(68.7);            // Set the score using the method from the Sports class
        sportsObj.putScore();            // Display the score using the method from the Sports class

    }
}

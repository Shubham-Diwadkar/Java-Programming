// Write a program to demonstrate multiple inheritance in java

class Student
{
    int reg_no;
    void getNo(int no)
    {
        reg_no = no;
    }
    void putNo()
    {
        System.out.println("Registration number = "+reg_no);
    }
}

class Marks extends Student
{
    float marks;
    void getMarks(float m)
    {
        marks = m;
    }
    void putMarks()
    {
        System.out.println("Marks = "+marks);
    }
}

class Sports extends Marks
{
    double score;
    void getScore(double scr)
    {
        score = scr;
    }
    void putScore()
    {
        System.out.println("Score = "+score);
    }
}

public class Multiple_Inheritance
{
    public static void main(String[] args)
    {
        Sports sportsObj = new Sports();
        sportsObj.getNo(987);
        sportsObj.putNo();
        sportsObj.getMarks(78);
        sportsObj.putMarks();
        sportsObj.getScore(68.7);
        sportsObj.putScore();

    }
}

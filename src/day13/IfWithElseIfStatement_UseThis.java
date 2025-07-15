package day13;

public class IfWithElseIfStatement_UseThis
{
    //Use this to make multiple decisions
    public static void main(String[] args) {
        int marks = 70;
        if(marks>90)
        {
            System.out.println("Student scored A++");
        }
        else if(marks>80 && marks<=90)
        {
            System.out.println("Student scored A+");
        }
        else if(marks>70 && marks<=80)
        {
            System.out.println("Student scored A");
        }
        else if(marks>60 && marks<=70)
        {
            System.out.println("Student scored B++");
        }
        else if(marks>50 && marks<=60)
        {
            System.out.println("Student scored B+");
        }
        else if(marks>40 && marks<=50)
        {
            System.out.println("Student scored B");
        }
        else if(marks>30 && marks<=40)
        {
            System.out.println("Student scored C");
        }
        else
        {
            System.out.println("Student scored an F....");
        }
    }
}

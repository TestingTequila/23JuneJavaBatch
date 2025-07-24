package day20.example2;

public class Student2
{
    public  int getStudentMarks(String studentName)
    {
        int marks = -1;

        if(studentName.equals("Jason"))
        {
            marks= 76;
        }
        else if (studentName.equals("Kerrie"))
        {
            marks= 56;
        }

        else if (studentName.equals("Lee"))
        {
            marks= 96;
        }

        else if (studentName.equals("Rose"))
        {
            marks= 78;
        }

        else if (studentName.equals("Mark"))
        {
            marks= 16;
        }
        return marks;
    }
}

package day20.example2;

public class Student
{
    public  int getStudentMarks(String studentName)
    {
        if(studentName.equals("Jason"))
        {
            return 76;
        }
        else if (studentName.equals("Kerrie"))
        {
            return 56;
        }

        else if (studentName.equals("Lee"))
        {
            return 96;
        }

        else if (studentName.equals("Rose"))
        {
            return 78;
        }

        else if (studentName.equals("Mark"))
        {
            return 16;
        }
        return -1;
    }
}

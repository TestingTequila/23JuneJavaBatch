package day20.example2;

public class ExecutingStudent
{
    public static void main(String[] args) {
        Student st= new Student();
        int marks =st.getStudentMarks("Steve");
        System.out.println(marks);
    }
}

package day13;

public class SwitchStatement {
    public static void main(String[] args) {
        int marks = 90;
        switch (marks) {
            case 90:
                System.out.println("Student Scored A++");
                break;
            case 80:
                System.out.println("Student Scored A+");
                break;
            case 70:
                System.out.println("Student Scored A");
                break;
            case 60:
                System.out.println("Student Scored B++");
                break;
            case 50:
                System.out.println("Student Scored B+");
                break;
            case 40:
                System.out.println("Student Scored B");
                break;
            default:
                System.out.println("Sorry..student scored an F");
        }
    }


}

package day27;

public class ExecutingUsers {
    public static void main(String[] args) {
        Users u1 = new Users("Jason", 24, 3456.45);
        System.out.println("Users Name: " + u1.getName());
        System.out.println("Users Age: " + u1.getAge());
        System.out.println("Users Salary: " + u1.getSalary());

       Users u2 = new Users("Kerrie", 35);

    }
}

package day20.example1;

public class ExecutingEmpDetails {
    public static void main(String[] args) {
        PrintEmpDetails empDetails = new PrintEmpDetails();
        String empFName =empDetails.printEmpFullName("Kerrie", "Roger");
        System.out.println(empFName + " MEDMA");
    }
}

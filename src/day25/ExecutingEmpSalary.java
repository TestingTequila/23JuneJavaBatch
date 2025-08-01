package day25;

public class ExecutingEmpSalary {
    public static void main(String[] args) {
        EmpSalary comp1 = new EmpSalary();
        comp1.setEmpName("Lindsay");
        comp1.setEmpSalary(150000);


        System.out.println("Pay " + comp1.getEmpName() + " a salary of $" + comp1.getEmpSalary());


    }
}

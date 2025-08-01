package day25;

public class ExecuteEmpSalary3 {
    public static void main(String[] args) {
        EmpSalary3 comp1 = new EmpSalary3("Jason", 2000);
        System.out.println(comp1.getEmpName());
        comp1.setEmpSalary(5000);
        System.out.println(comp1.getEmpSalary());
    }
}

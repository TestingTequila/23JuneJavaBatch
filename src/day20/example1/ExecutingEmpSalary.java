package day20.example1;

public class ExecutingEmpSalary {
    public static void main(String[] args) {
        SalaryCalculations calc = new SalaryCalculations();
        double mySalary =calc.calculateEmpSalary(4000.12, 5000.34);

        System.out.println("===Salary Without Bonus====");
        System.out.println(mySalary);


        System.out.println("===Salary With Bonus====");
        System.out.println(mySalary + 1000);
    }
}

package day20.example1;

public class SalaryCalculations
{
    //whatever be the salary of an employee, we will pay an additional bonus of $1000 to every one
    public  double calculateEmpSalary(double basicSalary, double travelAllowance)
    {
        double salaryWithoutBonus = basicSalary + travelAllowance;
        return salaryWithoutBonus;
    }
}

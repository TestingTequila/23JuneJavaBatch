package day19;

public class EmployeeTaxation
{
    // basic salary;
    // travel allowance;
    // tax;
    // calculate Salary

    int tax;

    public void calculateSalaryC1(int basicSalary, int travelAllowance)
    {
        int SalaryWithoutTax =basicSalary+travelAllowance;
        System.out.println("SalaryWithoutTax" + SalaryWithoutTax*tax);
    }

    public void calculateSalaryC2(int basicSalary, int travelAllowance)
    {
        int SalaryWithoutTax =basicSalary+travelAllowance;
        System.out.println("SalaryWithoutTax" + SalaryWithoutTax*tax);
    }
}

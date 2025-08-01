package day25;

public class EmpSalary3 {
    private String empName;
    private double empSalary;

    public EmpSalary3(String empName, double empSalary)
    {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public String getEmpName()
    {
        return empName;
    }

    public void setEmpSalary(double empSalary)
    {
        this.empSalary = empSalary;
    }



}

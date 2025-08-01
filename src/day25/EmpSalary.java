package day25;

public class EmpSalary {
    private String empName;
    private double empSalary;

    public void setEmpName(String empName) {
        String[] employeeNames= {"Kerrie", "Jason", "Ben"};
        for(String emp : employeeNames)
        {
            if(emp.contains(empName))
            {
                this.empName = empName;
                break;
            }
            else
            {
                this.empName = "N/A";
            }
        }

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpSalary(double empSalary)
    {
        if(empSalary>1000 && empSalary<=1000)
        {
            this.empSalary = empSalary;
        }
        else
        {
            this.empSalary =0.0;
        }

    }

    public double getEmpSalary()
    {
        return empSalary;
    }
}

package day27;

public class Users {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return Salary;
    }

    private int age;
    private double Salary;

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Users(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.setSalary(salary);
    }

    public Users(String name, int age) {
        this(name, age, 3456.67);
    }

    public Users(String name, double salary) {
        this.name = name;
        this.setSalary(salary);
    }

    public Users(int age, double salary) {
        this.age = age;
        this.setSalary(salary);
    }

    public Users(String name) {
        this.name = name;
    }

}

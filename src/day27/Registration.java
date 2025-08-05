package day27;

public class Registration {
    private String fName;

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public char getGender() {
        return gender;
    }

    private String lName;
    private int age;
    private double salary;
    private String emailId; // mandatory
    private String password; // mandatory
    private String confirmPassword; //mandatory
    private char gender;


    public Registration(String fName, String lName, int age, double salary, String emailId, String password, String confirmPassword, char gender) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.salary = salary;
        this.emailId = emailId;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.gender = gender;

    }

    public Registration(String fName, String lName, int age, double salary, char gender) {
        this(fName,lName,age,salary,"default@janbask.com", "test@1234", "test@1234", gender);


    }

    public Registration(String emailId, String password, String confirmPassword) {
        this.emailId = emailId;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public  void m1()
    {
        System.out.println("This is m1 method...");
        m2();//directly
        this.m2();// using this keyword

    }

    public  void m2()
    {
        System.out.println("This is m1 method...");
    }
    public  void m3()
    {
        System.out.println("This is m1 method...");
    }

    public  void m4()
    {
        System.out.println("This is m1 method...");
    }
}

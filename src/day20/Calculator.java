package day20;

public class Calculator
{
    public void addition1(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition1 : " + sum);
    }

    public int addition2(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition2 : " + sum);
        return a;
    }

    public int addition3(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition3 : " + sum);
        return b;
    }

    public int addition4(int a, int b)
    {
        int sum =a+b;
        System.out.println("Addition4 : " + sum);
        return sum;
    }

    public  void printName(String fName, String lName)
    {
        String fullName =fName+lName;
        System.out.println("full Name is : " + fullName);

    }
    public  String printName1(String fName, String lName)
    {
        String fullName =fName+lName;
        System.out.println("full Name is : " + fullName);
        return fName;
    }

    public  String printName2(String fName, String lName)
    {
        String fullName =fName+lName;
        System.out.println("full Name is : " + fullName);
        return lName;
    }

    public  String printName3(String fName, String lName)
    {
        String fullName =fName+lName;
        System.out.println("full Name is : " + fullName);
        return fullName;
    }

}

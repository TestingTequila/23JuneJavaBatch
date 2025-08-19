package day32;

public class A {

    int price = 100;

    static final int age = 34;

    //Can be inherited and overridden
    public String m1()
    {
        return "Class A method....";
    }

    //Can be inherited but not overridden
    public static String m2()
    {
        return "Parent Class A static method";
    }

    //Can be inherited but not overridden
    public final void m3()
    {
        System.out.println("Class A final method....");
    }

    public static final void m4()
    {
        System.out.println("Class A final method....");
    }

    //public final abstract  void m1(); cannot make abstract method final

    //private abstract  void m1(); cannot make abstract method private

}

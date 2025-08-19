package day32;

public class B extends A {
    int price = 200;

    @Override
    public String m1()
    {
        return "Class B overridden method";
    }
    public static String m2()
    {
        return "Child Class B static method";
    }

//    public final void m3()
//    {
//        System.out.println("Class A final method....");
//    }
}

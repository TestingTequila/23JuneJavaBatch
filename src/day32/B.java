package day32;

public class B extends A {
    int price = 200;

    @Override
    public void m1()
    {
        System.out.println("Class B overridden method");
    }
    public static void m2()
    {
        System.out.println("Child Class B static method");
    }

//    public final void m3()
//    {
//        System.out.println("Class A final method....");
//    }
}

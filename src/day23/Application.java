package day23;

public class Application
{
    public void m1()
    {
        System.out.println("Non-static m1 method");
        Application app = new Application();
        app.m2();
    }

    public void m2()
    {
        System.out.println("Non-static m2 method");
        Application app = new Application();
        app.m3();
    }

    public void m3()
    {
        System.out.println("Non-static m3 method");
        Application.t1();
    }

    public static void t1()
    {
        System.out.println("static t1 method");
        Application.t2();
    }

    public static void t2()
    {
        System.out.println("static t2 method");
        Application.t3();
    }

    public static void t3()
    {
        System.out.println("static t3 method");
        Application app = new Application();
        app.m3();
    }
}

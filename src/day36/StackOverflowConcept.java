package day36;

public class StackOverflowConcept
{
    public  void m1()
    {
        System.out.println("m1 method");
        m2();
    }
    public  void m2()
    {
        System.out.println("m1 method");
        m3();
    }
    public  void m3()
    {
        System.out.println("m1 method");
        m1();
    }

    public static void main(String[] args) {
        StackOverflowConcept soc = new StackOverflowConcept();
        try {
            soc.m1();
        }
        catch (Error e)
        {
            e.printStackTrace();
        }
        System.out.println("Will This execute as i am handling the error....");
    }
}

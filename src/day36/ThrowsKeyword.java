package day36;

public class ThrowsKeyword
{
    public void m1() throws ArithmeticException
    {
        System.out.println("m1 method....");
        m2();
    }

    public  void m2() throws ArithmeticException
    {
        int p=9/0;
        System.out.println(p);
    }

    public  void m3() throws ArithmeticException
    {
        System.out.println("m3 method...");
        int a=10;
        int b =0;
        int c=a/b;
        System.out.println("end of m3 method....");
    }

    public static void main(String[] args) {
        ThrowsKeyword obj= new ThrowsKeyword();
        try {
            obj.m1();
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
        //obj.m3();
        System.out.println("Will this be printed...");
    }
}

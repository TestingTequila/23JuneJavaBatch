package day21;

public class UnderstandingMain
{
    public static void main(String[] args) //String[]
    {
        System.out.println("I am Default main method");

    }

    public static void main(int args) //int
    {
        System.out.println("I am not Default main method1");
    }

    public static void main(int args, String x) //int, String
    {
        System.out.println("I am not Default main method2");
    }

    public static void main(String args, int x) //String, int
    {
        System.out.println("I am not Default main method3");
    }

    public static void main(String args, int x, byte b) //String, int, byte
    {
        System.out.println("I am not Default main method4");
    }
}

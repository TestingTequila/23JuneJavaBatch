package day23;

public class Automobile {
    String name;
    int price;
    String color;
    final static int wheels = 4;

    public void start()
    {
        System.out.println("Car start-----");
    }

    public static void stop()
    {
        //static int x; local variables as static
        System.out.println("Car stop-----");
    }
}

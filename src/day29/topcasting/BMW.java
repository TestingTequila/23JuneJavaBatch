package day29.topcasting;

public class BMW extends Car {

    int x = 20;
    @Override
    public void start() {
        System.out.println("BMW Start.....");
    }

    public void autoParking() {
        System.out.println("BMW auto-parking....");
    }

    public static void billing()
    {
        System.out.println("BMW Billing....");
    }


    @Override
    public  void engine()
    {
        System.out.println("BMW Engine");
    }

}

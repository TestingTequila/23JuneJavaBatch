package day29.topcasting;

public class Car extends  Vehicle{
    int x = 10;

    public void start() {
        System.out.println("Car Start.....");
    }

    public void stop() {
        System.out.println("Car Stop.....");
    }

    public void refuel() {
        System.out.println("Car Refuel.....");
    }


    // This method cannot be overridden as its final
    public final void reverseGear() {
        System.out.println("Car Reverse Gear.....");
    }

    private void manualTransitionType() {
        System.out.println("car Manual Transition..");
    }

    public static void billing() {
        System.out.println("Car Billing....");
    }
}

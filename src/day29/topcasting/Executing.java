package day29.topcasting;

public class Executing {
    public static void main(String[] args) {
        System.out.println("===========================Car==========");
        Car car = new Car();
        car.start();//self
        car.stop();//self
        car.refuel();//self
        System.out.println(car.x); //10

        System.out.println("===========================BMW==========");
        BMW bmw = new BMW();
        bmw.start(); //inherited
        bmw.stop();  //inherited
        bmw.refuel();//inherited
        bmw.autoParking(); //self
        bmw.reverseGear();
        System.out.println(bmw.x);//20

        System.out.println("=====Top Casting b/w Car and BMW========================");
        Car car1= new BMW();
        car1.start(); //BMW Start
        car1.stop();  // Car Stop
        car1.refuel(); // Car Refuel
        car1.reverseGear();
        System.out.println(car1.x);//10

        System.out.println("=====Top Casting b/w Vehicle and BMW========================");
         Vehicle vehicle= new BMW();
         vehicle.engine(); // BMW Engine

        System.out.println("=========Down Casting===================");
        //DownCasting is not allowed in Java
        //BMW bmw1= new Car();
        BMW bmw1= (BMW)new Car();
        bmw1.start();

    }
}

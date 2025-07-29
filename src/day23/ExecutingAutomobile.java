package day23;

public class ExecutingAutomobile {
    public static void main(String[] args) {
        Automobile car1 = new Automobile();
        car1.name = "BMW";
        car1.price = 90;
        car1.color = "Red";
        Automobile.stop();
        //Automobile.wheels =5; cannot update it as its final

        System.out.println("Car Name: " + car1.name + ", Car Color: " + car1.color + ", Car Price: " + car1.price + ", Car Wheels: " + Automobile.wheels);
        car1.start();

        Automobile car2 = new Automobile();
        car2.name = "Audi";
        car2.price = 80;
        car2.color = "White";
        car2.start();
        Automobile.stop();

        System.out.println("Car Name: " + car2.name + ", Car Color: " + car2.color + ", Car Price: " + car2.price + ", Car Wheels: " + Automobile.wheels);



        Automobile car3 = new Automobile();
        car3.name = "Tesla";
        car3.price = 120;
        car3.color = "Black";
        car3.start();
        Automobile.stop();
        System.out.println("Car Name: " + car3.name + ", Car Color: " + car3.color + ", Car Price: " + car3.price + ", Car Wheels: " + Automobile.wheels);


    }
}

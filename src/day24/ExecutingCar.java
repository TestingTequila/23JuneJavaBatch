package day24;

public class ExecutingCar {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "black", 45645, true);
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.price);
        System.out.println(c1.isAutomatic);
    }
}

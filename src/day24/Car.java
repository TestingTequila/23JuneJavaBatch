package day24;

public class Car {
    String name;
    String color;
    int price;
    boolean isAutomatic;


    public Car(String color, boolean isAutomatic) {
        this.color = color;
        this.isAutomatic = isAutomatic;
    }

    public Car(String name, int price, boolean isAutomatic) {
        this.name = name;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Car(String name, String color, int price, boolean isAutomatic) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }


}

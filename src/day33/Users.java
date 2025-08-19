package day33;

public abstract class Users {
    int x; //0
    String name; //null

    public void m1() {
        System.out.println("m1 method --Concrete");
    }

    public abstract void m2();

    public Users() {
        x = 15;
        name = "Jason";
    }

    //Cannot create object of an interface
}

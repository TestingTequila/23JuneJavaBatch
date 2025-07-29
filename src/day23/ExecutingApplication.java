package day23;

public class ExecutingApplication {
    public static void main(String[] args) {
        Application app1 = new Application();
        System.out.println("Calling non-Static methods using object name");
        app1.m1();
        app1.m2();
        app1.m3();

        System.out.println("Calling Static methods using class name");
        Application.t1();
        Application.t2();
        Application.t3();
    }
}

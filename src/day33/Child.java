package day33;

public class Child extends Parent {
    public Child() {
        super("Jason");
        System.out.println("Child Class Default Constructor...");
    }

    public Child(String name) {
        super("Kerrie");
        System.out.println("Child Class parametrized Constructor..." + name);
    }

    public Child(int age) {
         super("Rohit");
        System.out.println("Child Class parametrized Constructor..." + age);
    }
}

package day28;

public class ExecutingInheritance {
    public static void main(String[] args) {
        System.out.println("====Class A======");
        A a = new A();
        a.addition(12, 8);

        System.out.println("====Class B======");
        B b = new B();
        b.addition(12, 8);
        b.subtraction(12, 8);

        System.out.println("====Class C======");
        C c = new C();
        c.addition(12, 8);
        c.subtraction(12, 8);
        c.multiplication(12, 5);

        System.out.println("====Class D======");
        D d = new D();
        c.addition(12,8);
        c.subtraction(12,8);
        c.multiplication(12,8);
        d.division(12,8);

    }
}

package day32;

public class Execution {
    public static void main(String[] args) {

        System.out.println("====Class A Object========");
        A a = new A();
        System.out.println(a.price); //100
        a.m1();// Class A method....

        System.out.println("====Class B Object========");
        B b = new B();
        System.out.println(b.price);//200
        b.m1(); //Class B overridden method

        System.out.println("====Top Casting==========");
        A a1 = new B();
        System.out.println(a1.price);//100
        a1.m1();//Class B overridden method
        a1.m2();//Parent Class A static method
        A.m2(); //Parent Class A static method
        B.m2();
        a1.m3();

    }
}

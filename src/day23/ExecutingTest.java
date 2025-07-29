package day23;

public class ExecutingTest {
    public static void main(String[] args) {
        Test a1 = new Test();
        Test a2 = new Test();
        System.out.println(Test.a++);//10
        System.out.println(a1.b++);//20
        System.out.println(Test.a++);//11
        System.out.println(a2.b++);//20
    }
}

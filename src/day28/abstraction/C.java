package day28.abstraction;

public class C extends Base {
    @Override
    public void addition(int a, int b) {
        int sum = 3 * a + 3 * b;
        System.out.println("Addition by C: " + sum);
    }
}

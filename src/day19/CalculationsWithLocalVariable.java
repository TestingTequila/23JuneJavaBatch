package day19;

public class CalculationsWithLocalVariable {
    // WAP to add two integer numbers
    int a; //Global Variable - can be shared by all the methods of a class
    int b;

    public void addition(int a, int b) { // parameters belongs to methods only
        int sum = a + b;
        System.out.println(sum);
    }

    public void subtraction(int a, int b) {

        int difference = a - b;
        System.out.println(difference);
    }

    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println(product);
    }

    public void division()
    {
        int a = 12; //local variable
        int b = 4; //local variable
        int divide =a/b;
        System.out.println(divide);

    }

}

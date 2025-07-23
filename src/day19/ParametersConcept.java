package day19;

public class ParametersConcept {
    // WAP to add two integer numbers
    int c; // global variable, class level variable
    private int d; // global variable, class level variable
    protected int e; // global variable, class level variable

    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

}

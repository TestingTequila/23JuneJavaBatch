package day25;

public class ExecuteEncapsulation
{
    public static void main(String[] args) {
        Calculations calc = new Calculations();
        calc.c =34;
        calc.setA(12);
        calc.setB(8);

        System.out.println("The value of variable a Is: " + calc.getA());
        System.out.println("The value of variable b is: " + calc.getB());
        System.out.println("The value of variable c is: " + calc.c);
        calc.addition();

    }
}

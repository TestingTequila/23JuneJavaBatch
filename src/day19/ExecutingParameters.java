package day19;

public class ExecutingParameters
{
    public static void main(String[] args) {
        CalculationsWithParameters p1= new CalculationsWithParameters();
        p1.a = 100;
        p1.b =200;

        p1.addition(12, 4);//16
        p1.subtraction(55,5);//50
        p1.multiplication(3,5);//15

        System.out.println("=================================================");

        CalculationsWithLocalVariable p2 = new CalculationsWithLocalVariable();
        p2.a =300;
        p2.b =500;

        p2.addition(3,4);//7
        p2.subtraction(45,5);//40
        p2.multiplication(3,9);//27
        p2.division();//3


        CalculationsWithLocalVariable p3 = new CalculationsWithLocalVariable();
        p3.a =32;
        p3.b =6;
        p3.addition(45,8);// 53
        p3.subtraction(34, 4);//30
        p3.multiplication(11,4);//44
        p3.division();//3



    }
}

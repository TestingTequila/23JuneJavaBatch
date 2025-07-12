package day12.oprators;

public class MathsOperators {
    public static void main(String[] args) {
        //1. I/I = Integer Part
        System.out.println("==============================================");
        System.out.println(10 / 2);//5
        System.out.println(9 / 2);//4

        System.out.println("==============================================");
        //2. D/I or I/D = Integer Part.Decimal part
        System.out.println(10.0 / 2); // 5.0
        System.out.println(9.0 / 2); // 4.5
        System.out.println(10 / 2.0); //5.0
        System.out.println(9 / 2.0); //4.5

        System.out.println("==============================================");
        //3. Modulo Operator [Remainder]
        System.out.println(10%2);//0
        System.out.println(10%3);//1
        System.out.println(10%4);//2
    }

}

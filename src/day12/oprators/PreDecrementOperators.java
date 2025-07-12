package day12.oprators;

public class PreDecrementOperators
{
    public static void main(String[] args) {
        //1. Pre Decrement Operator [Decrement and then assign]
        System.out.println("============Pre Decrement Operator=============");
        int a =1;
        int b =--a;
        System.out.println(a);//0
        System.out.println(b);//0

        int x = 100;
        int y = --x;
        System.out.println(x);//99
        System.out.println(y);//99

        int c = -99;
        int d = --c;
        System.out.println(c);//-100
        System.out.println(d);//-100





    }
}

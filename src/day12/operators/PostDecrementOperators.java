package day12.oprators;

public class PostDecrementOperators
{
    public static void main(String[] args) {
        //1. Post Decrement Operator [Assignment and then Decrement]
        System.out.println("============Post Decrement Operator=============");
        int a =1;
        int b =a--;
        System.out.println(a);//0
        System.out.println(b);//1

        int x = 100;
        int y = x--;
        System.out.println(x);//99
        System.out.println(y);//100

        int c = -99;
        int d = c--;
        System.out.println(c);//-100
        System.out.println(d);//-99




    }
}

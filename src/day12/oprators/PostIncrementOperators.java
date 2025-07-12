package day12.oprators;

public class PostIncrementOperators
{
    public static void main(String[] args) {
        //1. Post Increment Operator [Assignment and then Increment]
        System.out.println("============Post Increment Operator=============");
        int a =1;
        int b =a++;
        System.out.println(a);//2
        System.out.println(b);//1

        int x = 100;
        int y = x++;
        System.out.println(x);//101
        System.out.println(y);//100

        int c = -99;
        int d = c++;
        System.out.println(c);//-98
        System.out.println(d);//-99




    }
}

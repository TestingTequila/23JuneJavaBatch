package day12.oprators;

public class PreIncrementOperators
{
    public static void main(String[] args) {
        //1. Post Increment Operator [Increment and then assign]
        System.out.println("============Pre Increment Operator=============");
        int a =1;
        int b =++a;
        System.out.println(a);//2
        System.out.println(b);//2

        int x = 100;
        int y = ++x;
        System.out.println(x);//101
        System.out.println(y);//101

        int c = -99;
        int d = ++c;
        System.out.println(c);//-98
        System.out.println(d);//-98





    }
}

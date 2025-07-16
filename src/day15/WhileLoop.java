package day15;

public class WhileLoop {
    public static void main(String[] args) {
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");
//        System.out.println("Ashish");

        System.out.println("=======Example1: Printing Name 10 times=======");
        int x = 1;
        while (x <= 10) {
            System.out.println("Ashish");
            x++;
        }

        System.out.println("=======Example2: Print numbers from 1 to 10=======");

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("=======Example3: Print numbers from 10 to 1=======");

        int m = 10;
        while (m>0)
        {
            System.out.println(m);
            m--;
        }

        System.out.println("=======Example4: Print the table of 2=======");

        int n =1;
        while (n<=10)
        {
            System.out.println(2*n);
            n++;
        }

        System.out.println("=======Example5: Print every value in table of 2 except 16=======");

        int k=1;
        while (k<=10)
        {
            if(k!=8) {
                System.out.println(2 * k);
            }
            k++;
        }

        System.out.println("=======Example6: Click on all the links of Janbaskdemo.com=======");

    }
}

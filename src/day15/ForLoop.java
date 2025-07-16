package day15;

public class ForLoop {
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

        for (int x = 1;x <= 10;x++) {
            System.out.println("Ashish");
        }

        System.out.println("=======Example2: Print numbers from 1 to 10=======");


        for (int a = 1;a <= 10;a++) {
            System.out.println(a);

        }

        System.out.println("=======Example3: Print numbers from 10 to 1=======");


        for (int m = 10;m>0;m--)
        {
            System.out.println(m);

        }

        System.out.println("=======Example4: Print the table of 2=======");


        for (int n =1;n<=10;n++)
        {
            System.out.println(2*n);
        }

        System.out.println("=======Example5: Print every value in table of 2 except 16=======");


        for (int k=1;k<=10;k++)
        {
            if(k!=8) {
                System.out.println(2 * k);
            }

        }

        System.out.println("=======Example6: Click on all the links of Janbaskdemo.com=======");

    }
}

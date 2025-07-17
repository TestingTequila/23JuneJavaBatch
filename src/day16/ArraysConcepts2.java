package day16;

import java.util.Arrays;

public class ArraysConcepts2 {
    public static void main(String[] args) {
        //12, 43, 65,48, 98

        // dataType[] arrayName ={value1, value2, value3.......};
//
//        int x =200;
//        System.out.println(x);
        System.out.println("====================Numbers Array===========");

        int[] numbers = {12, 43, 65, 48, 98, 600, 98};
        System.out.println("*********While loop********");
        int i=0;
        while (i<numbers.length)
        {
            System.out.println(numbers[i]);//12, 43, 65, 48, 98
            i++;
        }

        System.out.println("********For loop********");

        for (int j=0;j<numbers.length;j++)
        {
            System.out.println(numbers[j]);//12, 43, 65, 48, 98

        }

        System.out.println("********Advanced For Loop*******");
        for(int n:numbers)
        {
            System.out.println(n);
        }

        System.out.println("**********Just Displaying the Array Values*************");
        System.out.println(Arrays.toString(numbers));
        System.out.println("================Temperatures Array=======================");


        // 12.34, 34.56, 56.78, 22.0, 6.39, 55.55
        double[] temperature = {12.34, 34.56, 56.78, 22.0, 6.39, 55.55};
        System.out.println("*********While loop*********");
        int k=0;
        while (k<temperature.length)
        {
            System.out.println(temperature[k]);
            k++;
        }

        System.out.println("*******for loop***************");

        for (int m=0;m<temperature.length;m++)
        {
            System.out.println(temperature[m]);

        }

        System.out.println("********Advanced For Loop*******");
        for(double t:temperature)
        {
            System.out.println(t);
        }

        System.out.println("**********Just Displaying the Array Values*************");
        System.out.println(Arrays.toString(temperature));

        System.out.println("=================Students Array=======================");
        //Jason, Kerrie, Rose, Tony, Ben, John, Megan

        String[] students = {"Jason", "Kerrie", "Rose", "Tony", "Ben", "John", "Megan"};
        System.out.println("************while loop *************");
        int n=0;
        while (n<students.length)
        {
            System.out.println(students[n]);
            n++;
        }

        System.out.println("************for loop *************");
        int l=0;
        while (l<students.length)
        {
            System.out.println(students[l]);
            l++;
        }

        System.out.println("********Advanced For Loop*******");
        for(String s:students)
        {
            if(!(s.equals("Ben"))) {
                System.out.println(s);
            }
        }

        System.out.println("**********Just Displaying the Array Values*************");
        System.out.println(Arrays.toString(students));
        System.out.println("===================Vowels Array=====================");

        //a, e, i, o, u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("*********While loop*****************");
        int p=0;
        while (p<vowels.length)
        {
            System.out.println(vowels[p]);
            p++;
        }

        System.out.println("*********for loop*****************");
        int q=0;
        while (q<vowels.length)
        {
            System.out.println(vowels[q]);
            q++;
        }

        System.out.println("********Advanced For Loop*******");
        for(char c:vowels)
        {
            System.out.println(c);
        }

        System.out.println("**********Just Displaying the Array Values*************");
        System.out.println(Arrays.toString(vowels));

    }
}

package day16;

public class ArraysConcepts {
    public static void main(String[] args) {
        //12, 43, 65,48, 98

        // dataType[] arrayName ={value1, value2, value3.......};
//
//        int x =200;
//        System.out.println(x);

        int[] numbers = {12, 43, 65, 48, 98};
        System.out.println(numbers.length);//5
        System.out.println(numbers[0]);//12
        System.out.println(numbers[1]);//43
        System.out.println(numbers[2]);//65
        System.out.println(numbers[3]);//48
        System.out.println(numbers[4]);//98
        System.out.println("=======================================");
        // 12.34, 34.56, 56.78, 22.0, 6.39, 55.55
        double[] temperature = {12.34, 34.56, 56.78, 22.0, 6.39, 55.55};
        System.out.println(temperature.length);//6
        System.out.println(temperature[0]);//12.34
        System.out.println(temperature[1]);//34.56
        System.out.println(temperature[2]);//56.78
        System.out.println(temperature[3]);//22.0
        System.out.println(temperature[4]);//6.39
        System.out.println(temperature[5]);//55.55

        System.out.println("========================================");
        //Jason, Kerrie, Rose, Tony, Ben, John, Megan

        String[] students = {"Jason", "Kerrie", "Rose", "Tony", "Ben", "John", "Megan"};
        System.out.println(students.length);//7
        System.out.println(students[0]);//Jason
        System.out.println(students[1]);//Kerrie
        System.out.println(students[2]);//Rose
        System.out.println(students[3]);//Tony
        System.out.println(students[4]);//Ben
        System.out.println(students[5]);//John
        System.out.println(students[6]);//Megan

        System.out.println("========================================");

        //a, e, i, o, u
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        System.out.println(vowels.length);
        System.out.println(vowels[0]);//a
        System.out.println(vowels[1]);//e
        System.out.println(vowels[2]);//i
        System.out.println(vowels[3]);//o
        System.out.println(vowels[4]);//u


    }
}

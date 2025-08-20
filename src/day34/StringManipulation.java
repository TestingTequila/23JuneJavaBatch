package day34;

import java.util.Arrays;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hi this is my java code";
        System.out.println(str.length());
        int li = 0;//0
        int hi = str.length() - 1; //22

        System.out.println("=================//1.charAt====================");
        System.out.println(str.charAt(0));//H
        System.out.println(str.charAt(22));//e
        System.out.println(str.charAt(9));//s
        //System.out.println(str.charAt(23));//SIOBE

        System.out.println("=================//2.indexOf====================");

        System.out.println(str.indexOf('H'));//0
        System.out.println(str.indexOf('m'));//11
        System.out.println(str.indexOf("java"));//14

        String str1 = "This Java is my favourite Java ";
        System.out.println(str1.indexOf("Java"));//5
        System.out.println(str1.indexOf('i'));//2


        String str2 = "Welcome Lee, to the QA course";
        if (str2.indexOf("Jason") == 8) {
            System.out.println("Jason is Present....");
        } else {
            System.out.println("Jason is Absent...");
        }

        System.out.println("===============================================");

        String str3 = "hi this is my Java Code";
        System.out.println(str3.indexOf('i'));//1
        System.out.println(str3.indexOf('i', str3.indexOf('i') + 1));

        System.out.println("====3. ToUpperCase============");
        String s1 = "this is my favourite class";
        System.out.println(s1.toUpperCase()); //THIS IS MY FAVOURITE CLASS
        System.out.println(s1); //this is my favourite class

        String s2 = "WELCOME TO MY PARTY";
        System.out.println(s2.toLowerCase());//welcome to my party

        System.out.println("=====================4.trim========================");

        String s4 = "  This is Java Class   ";
        System.out.println(s4);
        System.out.println(s4.trim());

        System.out.println("=====================4.replace========================");
        System.out.println(s4.replace(" ", ""));

        String s5 = "Hi This is Java Class";
        System.out.println(s5.replace("Java", "Selenium"));

        String s6 = "25/12/1994";
        System.out.println(s6.replace("/", "-"));//25-12-1994

        System.out.println("========5. Equals===================");
        String ss1 = "  Hello";
        String ss2 = "Hello";
        System.out.println(ss1.trim().equals(ss2));//true

        System.out.println("=======6. Contains=================");
        String message = "This message is for Jason";
        System.out.println(message.contains("Jason"));//true

        System.out.println("========7. split==================>String to Array");

        String programmingLanguage = "JAVA C# PYTHON JAVASCRIPT RUBY";
        System.out.println(programmingLanguage.indexOf("#"));
        System.out.println(programmingLanguage.length());//30
        System.out.println(programmingLanguage.length()-1);
        System.out.println(programmingLanguage.charAt(29));

        String[] programs = programmingLanguage.split(" ");
        for(String s: programs)
        {

            System.out.println(s);
        }
        System.out.println(Arrays.toString(programs));
        System.out.println(programmingLanguage.split(" ").length);


        String pop = "This_is_best_selenium_course";
        String[] words= pop.split("_");
        System.out.println(words.length);// 28 or 5

        char[] letters= pop.toCharArray();
        for(char l : letters)
        {
            System.out.println(l);
        }




    }


}

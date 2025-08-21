package day35;

public class StringComparison {
    public static void main(String[] args) {
        String str = "Selenium"; //1 object Created
        String str1 = "Selenium"; //1 Object Created
        String str2 = new String("Selenium");
        String str3 = new String("Selenium");

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str1));

        System.out.println(str == str1);//true: This will compare memory address of str and str1
        System.out.println(str.equals(str1));//true: This will compare value of str and str1

        System.out.println(System.identityHashCode(str2));
        System.out.println(str == str2);//false
        System.out.println(str.equals(str2));//true

        System.out.println(System.identityHashCode(str3));

        System.out.println(str2==str3);//false
        System.out.println(str2.equals(str3));//true

        System.out.println("************str2=str3************");
        str2=str3; //str2 will break its original connection and will start pointing where str3 is pointing
        System.out.println(System.identityHashCode(str2));
        System.out.println(str2==str3);//true
        System.out.println(str2.equals(str3));//true

        String s = new String("Java");//2
        String s1 = "Java";
        String s2 = new String("Automation");
        String s3 = new String("Automation");

    }


}

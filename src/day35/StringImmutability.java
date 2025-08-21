package day35;

public class StringImmutability
{
    public static void main(String[] args) {
        String str = "Selenium";
        System.out.println(str + " Automation");
        System.out.println(str);//Selenium

        String name = "Jason";
        name.concat("Roger");
        System.out.println(name);
    }
}

package day35;

public class StringMutability
{

    //StringBuffer
    //StringBuilder
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java");
        sb.append(" Course");
        System.out.println(sb);

        StringBuffer sbf = new StringBuffer("Automation");
        sbf.append(" Engineer");
        System.out.println(sbf);

    }
}

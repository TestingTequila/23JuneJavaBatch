package day11;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        int i1 = 100;
        int i2 = 200;
        double d1 = 12.33;

        System.out.println(s1);//Hello
        System.out.println(s2);//World
        System.out.println(i1);//100
        System.out.println(i2);//200
        System.out.println(i1 + i2);//300
        System.out.println(s1 + s2);//HelloWorld
        System.out.println(i1 + s1 + s2);//100HelloWorld
        System.out.println(i1 + i2 + s1 + s2);//300HelloWorld
        System.out.println(s1 + s2 + i1 + i2);//HelloWorld100200
        System.out.println(i1 + i2 + s1 + s2 + i1 + i2);//300HelloWorld100200
        System.out.println(i1 + i2 + d1 + s1 + s2 + i1 + i2 + d1);//312.33HelloWorld10020012.33


    }
}

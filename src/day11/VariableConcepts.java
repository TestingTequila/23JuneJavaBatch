package day1;

public class VariableConcepts {
    public static void main(String[] args) {
        //variables
        //1. dataType nameOfVariable =value;

        //WAP to add two integer numbers 12 and 18

        //primitive data Types
        //1. We know in advance how much memory this will consume
        //2. We don't need objects to use them
        // 3. Integer(byte, short, int, long), decimal(float, double), (single character)char, (T/F)boolean

        //non-primitive data types
        //1. We don't know in advance how much memory this will consume
        //2. We need objects to use them
        // 3. Array, class, string....etc..

        byte num1 = 127;  // -128 to 127 [1 byte= 8 bits]
        short num2 = 32767;    // -32768 to 32767 [2 byte = 16 bits]
        int num3 = 32769;//-2147483648 to 2147483647 [4 byte =32 bits]
        long l =2147483650L; //-9223372036854775808 to -9223372036854775807 [8 byte =64 bits]

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);

        //1 byte = 8 bits

    }
}

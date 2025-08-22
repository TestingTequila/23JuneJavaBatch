package day36;

public class ExceptionsType
{
    public static void main(String[] args) {

        //int x = 12.33;// compile time error

        //RunTime Error
//        int[] numbers = new int[5];
//        numbers[5]=100;
//        System.out.println(numbers[5]);


        int x =10;
        int y =5;
        int z=0;
        String s = null;
        try {
            z = x/y;//ArithmeticException
            s.contains("Test");//nullPointerException
        }

        finally {
            System.out.println("Finally This will always execute.....");
        }

        if(z>=0)
        {
            System.out.println("The value of Z is Positive");
        }
        else
        {
            System.out.println("The Value of Z is negative");
        }
        System.out.println("This is example of Exception Handling....");

    }
}

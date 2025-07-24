package day20;

public class ExecutingCalculator
{
    public static void main(String[] args) {
           Calculator calc =new Calculator();
           //int total1 =calc.addition1(12,4); //void

           int total2 =calc.addition2(12,4); //int a
           System.out.println(total2);

           int total3 = calc.addition3(12,4); //int b
           System.out.println(total3);

           int total4= calc.addition4(12,4); //int sum
           System.out.println(total4);

           //String myName=calc.printName("Jason", "Roger"); //void

           String myfName=calc.printName1("Jason", "Roger"); // String fName
           System.out.println(myfName);
           String mylName=calc.printName2("Jason", "Roger"); // String lName
           System.out.println(mylName);
           String myFullName=calc.printName3("Jason", "Roger"); // String fullName
           System.out.println(myFullName);

    }
}

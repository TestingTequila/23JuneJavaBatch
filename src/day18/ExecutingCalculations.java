package day18;

public class ExecutingCalculations
{
    public static void main(String[] args) {
        Calculations calc= new Calculations();
        calc.a= 12;
        calc.b=8;
        //calc.c; cannot access this variable as it is private
        calc.addition();//12+8 = 20
        calc.subtraction(); //12-8 = 4
        calc.multiplication(); //12*8 = 96
    }
}

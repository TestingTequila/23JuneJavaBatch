package day27;

public class ExecutingCBR {
    public static void main(String[] args) {

        System.out.println("**********************8Scenario 1**********************");
        CBR cbr = new CBR(1, 5);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("====updating the value of a & b using setter method================");
        cbr.setA(11);
        cbr.setB(51);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());

        System.out.println("====updating the value of a & b using Call By Reference method================");
        cbr.updateValue(cbr);
        System.out.println(cbr.getA());
        System.out.println(cbr.getB());


        System.out.println("**********************Scenario 2**********************");
        CBR2 cbr2 = new CBR2();
        cbr2.setA(1);
        cbr2.setB(5);
        System.out.println(cbr2.getA());
        System.out.println(cbr2.getB());

        System.out.println("====updating the value of a & b using Call By Reference method================");
        cbr2.updateValue(cbr2);
        System.out.println(cbr2.getA());
        System.out.println(cbr2.getB());




    }
}

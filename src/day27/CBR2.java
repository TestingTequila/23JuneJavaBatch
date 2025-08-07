package day27;

public class CBR2 {
    private int a;//1
    private int b;//5

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void updateValue(CBR2 cbr)
    {
        cbr.a =1000;
        cbr.b =2000;
    }
}

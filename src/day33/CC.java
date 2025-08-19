package day33;

public class CC extends AC
{
    public CC()
    {
        super("Ashish");
        System.out.println("Child Class default Constructor");
    }

    public CC(int y)
    {
        super("Jason");
        System.out.println("Child Class Parametrized Constructor");
    }
}

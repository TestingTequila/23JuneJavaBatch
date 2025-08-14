package day32;

public interface IndianMedicalAssociation {
    final static int a = 100;

    public void oncologyServices();

    public void gynicServices();

    public void orthoServices();

    public void emergencyServices();

    public static void taxCalculation()
    {
        System.out.println("30% Tax Calculation");
    }

    default void getMedicalServices()
    {
        System.out.println("IndianMedicalAssociation- Default method....");
    }


}

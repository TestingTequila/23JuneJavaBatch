package day30;

public class FortisHospital extends  MedantaHospital implements USMedicalAssociation, UKMedicalAssociation, IndianMedicalAssociation  {

    @Override
    public void cardioServices() {
        System.out.println("FH---cardioServices");
    }

    @Override
    public void neuroServices() {
        System.out.println("FH---neuroServices");
    }

    @Override
    public void physioServices() {
        System.out.println("FH---physioServices");
    }

    @Override
    public void emergencyServices() {
        System.out.println("FH---emergencyServices");
    }

    @Override
    public void entServices() {
        System.out.println("FH---entServices");
    }

    @Override
    public void dentalServices() {
        System.out.println("FH---dentalServices");
    }

    @Override
    public void oncologyServices() {
        System.out.println("FH---dentalServices");
    }

    @Override
    public void gynicServices() {
        System.out.println("FH---dentalServices");
    }

    @Override
    public void orthoServices() {
        System.out.println("FH---dentalServices");
    }

    public void medicalTraining() {
        System.out.println("FH---medicalTraining");
    }

    public void medicalInsurance() {
        System.out.println("FH---medicalInsurance");
    }

    @Override
    public  void medicalNews()
    {
        System.out.println("FH---medicalNews");
    }

    @Override
    public void covidVaccination() {
        System.out.println("FH---covidVaccination");
    }

    @Override
    public void charityServices() {
        System.out.println("FH---charityServices");
    }

    //Cannot override medicalRND services of Medanta as this is final

//    public final void medicalRND()
//    {
//        System.out.println("Medanta---medicalRND");
//    }
}

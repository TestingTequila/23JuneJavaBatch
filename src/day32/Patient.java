package day32;

public class Patient {
    public static void main(String[] args) {
        //USMedicalAssociation uma = new USMedicalAssociation(); cannot create object of an interface
        //UKMedicalAssociation ukm = new UKMedicalAssociation(); cannot create object of an interface
        //IndianMedicalAssociation im = new IndianMedicalAssociation(); cannot create object of an interface

        FortisHospital fh = new FortisHospital();
        fh.cardioServices();
        fh.neuroServices();
        fh.physioServices();
        fh.entServices();
        fh.dentalServices();
        fh.oncologyServices();
        fh.gynicServices();
        fh.orthoServices();
        fh.emergencyServices();
        fh.medicalTraining();
        fh.medicalInsurance();
        fh.medicalNews(); // FH---MedicalNews
        //fh.taxCalculation(); static method from interface cannot be inherited
        IndianMedicalAssociation.taxCalculation();
        fh.getMedicalServices();// default method can be inherited

        System.out.println("====Top Casting with USMedicalAssociation==============");

        USMedicalAssociation usma = new FortisHospital();
        usma.neuroServices();
        usma.neuroServices();
        usma.physioServices();
        usma.emergencyServices();

        System.out.println("====Top Casting with UKMedicalAssociation==============");

        UKMedicalAssociation ukma = new FortisHospital();
        ukma.entServices();
        ukma.dentalServices();
        ukma.emergencyServices();


        System.out.println("====Top Casting with IndianMedicalAssociation==============");

        IndianMedicalAssociation ima = new FortisHospital();
        ima.oncologyServices();
        ima.gynicServices();
        ima.orthoServices();
        ima.emergencyServices();
        //ima.taxCalculation(); static method from interface cannot be inherited
        IndianMedicalAssociation.taxCalculation();
        ima.getMedicalServices();// default method can be inherited

        System.out.println("=====Services from Medanta Hospital=======");
        fh.medicalTraining();
        fh.medicalRND();

        System.out.println("====Top Casting with MedantaHospital==============");

        MedantaHospital mh = new FortisHospital();
        mh.medicalRND();
        mh.medicalNews(); // FH---MedicalNews
    }
}

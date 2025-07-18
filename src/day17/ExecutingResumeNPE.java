package day17;

public class ExecutingResumeNPE
{
    public static void main(String[] args) {
        Resume jasonResume= new Resume();
        jasonResume.firstName="Jason";
        jasonResume.lastName = "Roger";
        jasonResume.gender = 'm';
        jasonResume.totalExperience =4.5;
        jasonResume.isFromIT = false;

        System.out.println(jasonResume.firstName);
        System.out.println(jasonResume.lastName);
        System.out.println(jasonResume.gender);
        System.out.println(jasonResume.totalExperience);
        System.out.println(jasonResume.isFromIT);

        jasonResume=null;

        System.out.println(jasonResume.firstName);
        System.out.println(jasonResume.lastName);
        System.out.println(jasonResume.gender);
        System.out.println(jasonResume.totalExperience);
        System.out.println(jasonResume.isFromIT);



    }
}

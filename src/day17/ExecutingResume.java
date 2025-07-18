package day17;

public class ExecutingResume
{
    public static void main(String[] args) {
        Resume jasonResume= new Resume();
        jasonResume.firstName="Jason";
        jasonResume.lastName = "Roger";
        jasonResume.gender = 'm';
        jasonResume.totalExperience =4.5;
        jasonResume.isFromIT = false;

        Resume kerrieResume = new Resume();
        kerrieResume.firstName = "Kerrie";
        kerrieResume.lastName ="Wright";
        kerrieResume.gender = 'f';
        kerrieResume.totalExperience = 6.7;
        kerrieResume.isFromIT = true;

        Resume benResume = new Resume();
        benResume.firstName = "Ben";
        benResume.lastName = "Fletcher";
        benResume.gender = 'm';
        benResume.totalExperience = 3;
        benResume.isFromIT = false;


    }
}

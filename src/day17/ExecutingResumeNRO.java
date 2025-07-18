package day17;

public class ExecutingResumeNRO {
    public static void main(String[] args) {
        new Resume().firstName = "Ashish";
        new Resume().lastName = "Mishra";
        new Resume().gender = 'm';
        new Resume().isFromIT = true;
        new Resume().totalExperience = 12;
        System.gc();
    }
}

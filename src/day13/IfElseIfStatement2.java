package day13;

public class IfElseIfStatement2
{
    public static void main(String[] args) {
        String browserName = "Chrome";
        if(browserName.equals("IE"))
        {
            System.out.println("Launch Internet Explorer browser...");
        }
        else if(browserName.equals("Edge"))
        {
            System.out.println("Launch Edge browser...");
        }
        else if(browserName.equals("Firefox"))
        {
            System.out.println("Launch Firefox browser...");
        }
        else if(browserName.equals("Chrome"))
        {
            System.out.println("Launch Chrome browser...");
        }
        else if(browserName.equals("Safari"))
        {
            System.out.println("Launch Safari browser...");
        }
        else
        {
            System.out.println("Please enter a valid browser name...");
        }
    }
}
